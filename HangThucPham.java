package bai5;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    // Constructor with full parameters
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = (maHang != null && !maHang.isEmpty()) ? maHang : "DEFAULT";
        this.tenHang = (tenHang != null && !tenHang.isEmpty()) ? tenHang : "xxx";
        this.donGia = (donGia >= 0) ? donGia : 0;
        this.ngaySanXuat = (ngaySanXuat != null && ngaySanXuat.before(new Date())) ? ngaySanXuat : new Date();
        this.ngayHetHan = (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) ? ngayHetHan : this.ngaySanXuat;
    }

    // Constructor with only maHang parameter
    public HangThucPham(String maHang) {
        this(maHang, "xxx", 0, new Date(), new Date());
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Ma hang khong hop le!");
        }
    }

    // Getters
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    // Setters
    public void setTenHang(String tenHang) {
        this.tenHang = (tenHang != null && !tenHang.isEmpty()) ? tenHang : "xxx";
    }

    public void setDonGia(double donGia) {
        this.donGia = (donGia >= 0) ? donGia : 0;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = (ngaySanXuat != null && ngaySanXuat.before(new Date())) ? ngaySanXuat : new Date();
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) ? ngayHetHan : this.ngaySanXuat;
    }

    // Check if the HangThucPham is expired or not
    public boolean isExpired() {
        return new Date().after(this.ngayHetHan);
    }

    // Format the price with thousand separator
    private String formatPrice() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(this.donGia);
    }

    // Format the date as dd/MM/yyyy
    private String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    // Return string representation of the object
    @Override
    public String toString() {
        String expiredStatus = (isExpired()) ? "Het han" : "Con han";
        return maHang + "\t" + tenHang + "\t" + formatPrice() + "\t" + formatDate(ngaySanXuat) + "\t" +
                formatDate(ngayHetHan) + "\t" + expiredStatus;
    }
}
