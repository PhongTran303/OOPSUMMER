package bai1;

 public abstract class ChuyenXe {
    protected String maSo;
    protected String hoTenTaiXe;
    protected String soXe;                   
    protected int doanhThu;
    public ChuyenXe() {
    	
    }
  
    public ChuyenXe(String maSo, String hoTenTaiXe, String soXe, int doanhThu) {
		this.maSo = maSo;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}


	public abstract void xuatThongTin();
}

 class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private int soKmDi;
    

    public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKmDi() {
		return soKmDi;
	}
	public void setSoKmDi(int soKmDi) {
		this.soKmDi = soKmDi;
	}
	
	

	public ChuyenXeNoiThanh(String maSo, String hoTenTaiXe, String soXe, int doanhThu, String soTuyen, int soKmDi) {
        super(maSo, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDi = soKmDi;
    }
	

	@Override
    public void xuatThongTin() {
        System.out.println("Chuyen xe noi thanh - Ma so: " + maSo);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("So tuyen: " + soTuyen);
        System.out.println("So km di: " + soKmDi);
        System.out.println("Doanh thu: " + doanhThu);
    }
}

class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDi;
    
    
    public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDi() {
		return soNgayDi;
	}

	public void setSoNgayDi(int soNgayDi) {
		this.soNgayDi = soNgayDi;
	}
	
	

	public ChuyenXeNgoaiThanh(String maSo, String hoTenTaiXe, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(maSo, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
	

    @Override
    public void xuatThongTin() {
        System.out.println("Chuyen xe ngoai thanh - Ma so: " + maSo);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay di: " + soNgayDi);
        System.out.println("Doanh thu: " + doanhThu);
    }
}


