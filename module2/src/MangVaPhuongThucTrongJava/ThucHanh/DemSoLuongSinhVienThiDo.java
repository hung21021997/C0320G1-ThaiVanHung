package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size: ");
            size = Integer.parseInt(input.nextLine());
            if (size>30){
                System.out.println("size should not exceed 20");
            }
        } while (size > 30);
        int [] array = new int[size];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter a mart for student: " + i);
            array[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println("List of mart:");
        int count =0;
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            if (array[i]>=5){
                count ++;
            }
        }
        System.out.println("The number of students passing the exam is " + count);
    }
}
