package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Enter a size: ");
            size = Integer.parseInt(input.nextLine());
            if (size>20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size >20);
        array = new int[size];
        for (int i= 0; i<array.length; i++){
            System.out.println("Enter element " + i + ":");
            array[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println("Property list:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index=0;
        for (int i=1; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
