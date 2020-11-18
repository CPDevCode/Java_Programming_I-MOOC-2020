
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //asks for points and gives grade according to scale
        /* 0	impossible!
            0-49	failed
            50-59	1
            60-69	2
            70-79	3
            80-89	4
            90-100	5
            > 100	incredible!
        */    
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scan.nextLine());
        // assigns grade to message
        String grade = "Grade: ";
        if (point > 100) {
            System.out.println(grade + "incredible!");
        } else if (point <= 100 && point >= 90) {
            System.out.println(grade + "5");
        } else if (point < 90 && point >= 80) {
            System.out.println(grade + "4");
        } else if (point < 80 && point >= 70) {
            System.out.println(grade + "3");
        } else if (point < 70 && point >= 60) {
            System.out.println(grade + "2");
        } else if (point < 60 && point >= 50) {
            System.out.println(grade + "1");
        } else if (point < 50 && point >= 0) {
            System.out.println(grade + "failed");
        } else if (point < 0) {
            System.out.println(grade + "impossible!");
        }

    }
}
