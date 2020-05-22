package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class NgoaiLe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length1: ");
        int length1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter length2: ");
        int length2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter length3: ");
        int length3 = Integer.parseInt(input.nextLine());
        try {
            if (length1+length2>length3 && length1+length3>length2 && length3+length2>length1){
                System.out.println("3 số nhập vào là 3 cạnh của 1 tam giác");
            }
        } catch (Exception e){
            System.out.println("3 cạnh nhập vào không phải 3 cạnh của 1 tam giác");
        }
    }
}
