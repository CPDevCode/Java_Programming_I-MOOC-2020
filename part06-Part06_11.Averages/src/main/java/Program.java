
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    GradeRegister register = new GradeRegister();
    register.addGradeBasedOnPoints(91);
    register.addGradeBasedOnPoints(92);
    register.addGradeBasedOnPoints(93);
    System.out.println(register.averageOfPoints());
//register.averageOfPoints(); expected:<92.0> but was:<31.0>
    }
}
