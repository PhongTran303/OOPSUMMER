package bai3;


class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }
}

class GiaoDichVang extends GiaoDich {
    String loaiVang;

    public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
}

class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiTienTe.equals("USD") || loaiTienTe.equals("Euro")) {
            return soLuong * donGia * tiGia;
        } else if (loaiTienTe.equals("VND")) {
            return soLuong * donGia;
        }
        return 0;
    }
}

