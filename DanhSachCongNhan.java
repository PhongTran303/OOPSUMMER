package bai9;
public class DanhSachCongNhan {
    private CongNhan[] dsCongNhan;
    private int soLuongCN;
    private final int MAX_SIZE;

    public DanhSachCongNhan(int n) {
        this.dsCongNhan = new CongNhan[n];
        this.soLuongCN = 0;
        this.MAX_SIZE = n;
    }

    public boolean themCongNhan(CongNhan cn) {
        if (soLuongCN < MAX_SIZE) {
            dsCongNhan[soLuongCN] = cn;
            soLuongCN++;
            return true;
        }
        return false;
    }

    public void xuatThongTin() {
        for (int i = 0; i < soLuongCN; i++) {
            System.out.println(dsCongNhan[i].toString());
        }
    }

    public int tinhSoLuong() {
        return soLuongCN;
    }

    public void xuatThongTinSP200() {
        for (int i = 0; i < soLuongCN; i++) {
            if (dsCongNhan[i].getmSoSP() > 200) {
                System.out.println(dsCongNhan[i].toString());
            }
        }
    }

    public void sapXepGiamDanTheoSP() {
        for (int i = 0; i < soLuongCN - 1; i++) {
            for (int j = i + 1; j < soLuongCN; j++) {
                if (dsCongNhan[i].getmSoSP() < dsCongNhan[j].getmSoSP()) {
                    CongNhan temp = dsCongNhan[i];
                    dsCongNhan[i] = dsCongNhan[j];
                    dsCongNhan[j] = temp;
                }
            }
        }
    }
}

