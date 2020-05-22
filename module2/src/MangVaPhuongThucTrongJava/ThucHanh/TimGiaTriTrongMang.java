package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student: ");
        String inputStudent = input.nextLine();
        boolean choose = true;
        for (int i=0; i<students.length; i++){
            if(students[i].equals(inputStudent)){
                System.out.println("Position of the students in the list " + inputStudent + " is: " + i);
                choose=false;
                break;
            }
        }
        if(choose){
            System.out.println("Not found " + inputStudent + " in the list.");
        }
    }
}
