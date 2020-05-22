package NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần chuyển đổi: ");
        double usd = input.nextDouble();
        double vnd = usd*23000;
        System.out.print("Số tiền đã quy đổi ra VND: " + vnd);
    }
}
