package MangVaPhuongThucTrongJava.BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9};
        int [] array = new int[array1.length+array2.length];
        System.out.println("Display array1: ");
        for (int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
            array[i]=array1[i];
        }
        System.out.println("Display array2: ");
        for (int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
            array[array1.length+i] = array2[i];
        }
        System.out.println("Display array:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
