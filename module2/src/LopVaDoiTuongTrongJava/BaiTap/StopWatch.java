package LopVaDoiTuongTrongJava.BaiTap;


public class StopWatch {
    public double getTime(){
        return System.currentTimeMillis();
    }
    public static void main(String[] args) {
        StopWatch stopWatch =new StopWatch();
        double startTime = stopWatch.getTime();
        System.out.println("Display startTime: " + startTime);
        for (int i=0; i<10000; i++){
            System.out.print(i + " ");
        }
        double endTime = stopWatch.getTime();
        System.out.println("\n Display endTime: " + endTime);
        double time = endTime-startTime;
        System.out.println("Display time: " + time);
    }
}
