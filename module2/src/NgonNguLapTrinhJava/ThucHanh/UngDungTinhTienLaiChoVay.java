package NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 1;
        double money = 1.0;
        double intersect_rate =1.0;
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        intersect_rate = input.nextDouble();
        double total_intersect = 0;
        for (int i =0; i<month; i++){
            total_intersect = money*((intersect_rate)/12);
        }
        System.out.println("Total of interset: " + total_intersect);
    }
}
