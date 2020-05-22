package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Enter size array: ");
            size = Integer.parseInt(input.nextLine());
            if(size>20){
                System.out.println("Size does not exceed 20.");
            }
        } while (size>20);
        array = new int[size];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter element: " + i + " :");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Element in array:");
        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
        for (int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reverse array:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
