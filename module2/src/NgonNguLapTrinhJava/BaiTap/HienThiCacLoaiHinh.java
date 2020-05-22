package NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;


public class HienThiCacLoaiHinh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        while (true){
            int choose = input.nextInt();
            switch (choose){
                case 1: {
                    String str = "* ";
                    for (int i =0; i<4; i++){
                        for (int j=0; j<7; j++){
                            System.out.print(str);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    String str = "* ";
                    for (int i=0; i<5; i++){
                        for (int j=0; j<=i; j++){
                            System.out.print(str);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    String str = "* ";
                    for (int i=7; i>0;i--){
                        for (int j=0; j<i; j++){
                            System.out.print(str);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    System.out.println("No choose");
                }
            }
        }
    }
}
