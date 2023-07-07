package bai4;


class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public double thanhTien() {
        return dienTich * donGia;
    }
}

class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double thanhTien() {
        if (loaiDat.equals("A")) {
            return super.thanhTien() * 1.5;
        } else {
            return super.thanhTien();
        }
    }
}

class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double thanhTien() {
        if (loaiNha.equals("cao cấp")) {
            return super.thanhTien();
        } else {
            return super.thanhTien() * 0.9;
        }
    }
}

