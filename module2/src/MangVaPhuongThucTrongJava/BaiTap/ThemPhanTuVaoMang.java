package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7};
        int [] arr = new int[array.length+1];
        System.out.println("Mảng ban đầu: ");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter number: ");
        int number = Integer.parseInt(input.nextLine());
        int index;
        do {
            System.out.println("Enter index: ");
            index = Integer.parseInt(input.nextLine());
        } while (index < 0 || index > array.length-1);
        arr[index] = number;
        for (int i =0; i<index; i++){
            arr[i]=array[i];
        }
        for (int i=array.length-1; i>=index; i--){
            arr[i+1]=array[i];
        }
        System.out.println("Mảng sau khi thêm phần tử number: ");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
