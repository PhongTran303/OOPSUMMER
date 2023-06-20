package bai8;

public class CDList {
    private CD[] cds;
    private int count;

    public CDList(int n) {
        cds = new CD[n];
        count = 0;
    }

    public boolean addCD(CD cd) {
        if (count == cds.length) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (cds[i].getMaCD() == cd.getMaCD()) {
                return false;
            }
        }

        cds[count] = cd;
        count++;
        return true;
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += cds[i].getGiaThanh();
        }
        return sum;
    }

    public String getAllCDInfo() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += cds[i].toString() + "\n\n";
        }
        return result;
    }

    public void sortByPriceDescending() {
        Arrays.sort(cds, 0, count, Comparator.comparing(CD::getGiaThanh).reversed());
    }

    public void sortByTitleAscending() {
        Arrays.sort(cds, 0, count, Comparator.comparing(CD::getTuaCD));
    }
}

