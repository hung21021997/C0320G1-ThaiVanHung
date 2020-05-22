package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1;
        System.out.println("Enter a size1: ");
        size1 = Integer.parseInt(input.nextLine());
        int size2;
        System.out.println("Enter a size2: ");
        size2 = Integer.parseInt(input.nextLine());
        int [][] array = new int [size1][size2];
        System.out.println("Row array: " + size1 + " column array: " + size2);
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.println("Enter array["+i+"]["+j+"]");
                array[i][j]=Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Enter number: ");
        int number = Integer.parseInt(input.nextLine());
        int sum=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if (number==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Display sum: " + sum);
    }
}
