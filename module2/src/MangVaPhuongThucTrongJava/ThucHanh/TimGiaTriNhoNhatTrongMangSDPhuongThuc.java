package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMangSDPhuongThuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {6,2,8,9,4,5};
        int index = minvalue(arr);
    }
    public static int minvalue(int []array){
        int min = array[0];
        int index =0;
        for (int i=1; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Số nhỏ nhất tỏng mảng: " + min +" ,tại vị trí: " + index);
        return index;
    }
}
