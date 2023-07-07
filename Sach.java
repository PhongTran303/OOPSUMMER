package bai2;


 class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;
    public Sach() {
    	
    }

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
}

class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equals("mới")) {
            return soLuong * donGia;
        } else if (tinhTrang.equals("cũ")) {
            return soLuong * donGia * 0.5;
        }
        return 0.0;
    }
}

class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }
}

