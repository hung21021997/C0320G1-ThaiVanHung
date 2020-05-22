package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class IsPrime{
    int number1;

    public IsPrime() {
    }

    public IsPrime(int number) {
        this.number1 = number;
    }

    public int getNumber() {
        return number1;
    }

    public void setNumber(int number) {
        this.number1 = number;
    }
    public void inputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1:");
        this.number1=Integer.parseInt(input.nextLine());
    }
    public boolean IsPrimeNumber1(){
        boolean check = true;
        for (int i=2; i<=Math.sqrt(this.number1); i++){
            if (this.number1%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
    public int IsPrimeNumber2(){
        int number2=this.number1+1, count=0;
        while (count <1){
            boolean result=true;
            for (int j=2;j<=Math.sqrt(number2); j++){
                if(number2%j==0){
                    result = false;
                    break;
                }
            }
            if (result){
                count++;
            } else {
                number2++;
            }
        }
        return number2;
    }
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        isPrime.inputNumber();
        System.out.println("Kiểm tra number1: " + isPrime.IsPrimeNumber1());
        System.out.println("Hiển thi number2: " + isPrime.IsPrimeNumber2());
    }
}

