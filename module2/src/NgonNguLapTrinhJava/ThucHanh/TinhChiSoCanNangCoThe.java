package NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight =1.0, height =1.0, bmi;
        System.out.println("Enter weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter height: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi<18){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if(bmi<25){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if(bmi<30){
            System.out.printf("%-20.2f%s", bmi, "OverWeight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
