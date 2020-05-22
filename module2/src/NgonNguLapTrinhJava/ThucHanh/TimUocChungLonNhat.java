package NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Enter b: ");
        b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 && b == 0){
            System.out.println("No greatest common factor");
        }
        if(a==0 && b!=0){
            System.out.println("Greatest common factor: " + b);
        }
        if(a!=0 && b==0){
            System.out.println("Greatest common factor: " + a);
        }
        while (a!=b){
            if(a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
