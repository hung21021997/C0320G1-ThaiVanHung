package MangVaPhuongThucTrongJava.BaiTap;

public class TimGiaTriLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int [][] array = {{12, 23, 19, 12}, {21, 13, 24, 19}, {26, 18, 16, 20}};
        int max = array[0][0];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
    }
}
