package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {5,10,15,3,6,13,9};
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        int [] arr = new int[array.length-1];
        boolean choose = false;
        for (int i=0; i<array.length; i++){
            if(array[i]==number){
                choose=true;
                for (int j=0; j<i; j++){
                    arr[j]=array[j];
                }
                for (int j=i; j<arr.length; j++){
                    arr[j]=array[j+1];
                }
            }
        }
        if (choose){
            System.out.println("Mảng sau khi xóa: ");
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Số vừa nhập không có trong mảng.");
        }
    }
}
