package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "TOILAKENGOC";
        System.out.println("Enter a char: ");
        char str1 = input.nextLine().charAt(0);
        int count =0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==str1){
                count++;
            }
        }
        System.out.println("Display count: " + count);
    }
}
