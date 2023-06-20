package bai8;
public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chưa xác định";
        this.soBaiHat = 0;
        this.giaThanh = 0.0;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        setMaCD(maCD);
        setTuaCD(tuaCD);
        setSoBaiHat(soBaiHat);
        setGiaThanh(giaThanh);
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        }
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (!tuaCD.isEmpty()) {
            this.tuaCD = tuaCD;
        }
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        }
    }

    public String toString() {
        return "Mã CD: " + maCD + "\nTựa CD: " + tuaCD + "\nSố bài hát: " + soBaiHat + "\nGiá thành: " + giaThanh;
    }

	}

