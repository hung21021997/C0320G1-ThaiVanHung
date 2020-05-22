package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Random;
import java.util.Scanner;

public class NgoaiLe {
    public static void main(String[] args) {
        NgoaiLe arrExample = new NgoaiLe();
        int [] arr = arrExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
    public int[] createRandom(){
        Random rd = new Random();
        int [] array = new int[100];
        System.out.println("Số phần tử trong mảng");
        for (int i=0; i<100; i++){
            array[i]=rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
