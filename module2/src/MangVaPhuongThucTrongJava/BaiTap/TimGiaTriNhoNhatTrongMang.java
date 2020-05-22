package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size: ");
            size = Integer.parseInt(input.nextLine());
            if(size>20){
                System.out.println("Size does not exceed 20.");
            }
        } while (size>20);
        int [] array = new int[size];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter array[" +i+"] :");
            array[i]=Integer.parseInt(input.nextLine());
        }
        int min = array[0];
        int index = 0;
        System.out.println("Display array:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            if(array[i]<min){
                min = array[i];
                index=i;
            }
        }
        System.out.println("Số nhỏ nhất trong mảng: " + min + ", tại vị trí: " + index);
    }
}
