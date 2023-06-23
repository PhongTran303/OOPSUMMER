package bai9;

public class CongNhan {
		private int maCN;
		private String mHo;
		private String mTen;
		private int mSoSP;
	public CongNhan() {
		}
	public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
		this.setMaCN(maCN);
		this.mHo = mHo;
		this.setmTen(mTen);
		this.setmSoSP(mSoSP);
	}
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if(mSoSP<0) 
		{
			System.out.println("Nhap sai");
		}
		else {
			this.mSoSP = mSoSP;
			 }
	}
		
		
	public double tinhLuong() {
	    double donGia;
	    if (mSoSP< 200) {
	        donGia = 0.5;
	    } else if ( mSoSP < 400) {
	        donGia = 0.55;
	    } else if (mSoSP < 600) {
	        donGia = 0.6;
	    } else {
	        donGia = 0.65;
	    }
	    return mSoSP * donGia;
	}
	
	@Override
    public String toString() {
        return "Ma CN: " + maCN + ", Ho va ten: " + mHo + " " + mTen + ", So san pham: " + mSoSP + ", Luong: " + tinhLuong();
    }

}