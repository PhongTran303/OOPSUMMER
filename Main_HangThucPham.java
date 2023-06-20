package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main_HangThucPham {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        HangThucPham hang1 = new HangThucPham("001", "Gạo", 100000, formatter.parse("10/07/2018"), formatter.parse("10/07/2018"));
        HangThucPham hang2 = new HangThucPham("002", "Mì", 5000, formatter.parse("01/03/2018"), formatter.parse("01/03/2018"));
}
}