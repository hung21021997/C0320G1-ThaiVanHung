package NgonNguLapTrinhJava.BaiTap;

public class Hienthi20SoNguyenToDauTien {

    public static void main(String[] args) {
        int count = 0, number = 2;
        while (count<20){
            boolean check = true;
            for (int i=2; i<=Math.sqrt(number); i++){
                if(number%i==0){
                    check =false;
                    break;
                }
            }
            if(check){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
