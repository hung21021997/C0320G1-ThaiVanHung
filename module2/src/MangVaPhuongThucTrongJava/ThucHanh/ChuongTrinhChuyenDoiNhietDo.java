package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choose");
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1: {
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = Double.parseDouble(input.nextLine());
                    celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("Fahrenheit to Celsius: " + celsius);
                    break;
                }
                case 2: {
                    System.out.println("Enter your celsius: ");
                    celsius = Double.parseDouble(input.nextLine());
                    fahrenheit = (9.0 / 5) * celsius + 32;
                    System.out.println("Celsius to Fahrenheit: " + fahrenheit);
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Input choose, please! ");
            }
        } while (choose !=0);
    }
}
