
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    //get's average grade
    public double averageOfGrades() {
        int total = 0;
        int count = 0;
        for(int each: this.grades) {
            total += each;
            count++;
        }
        double avg = (double) total / count;
        if(this.grades.isEmpty()) {
            return -1;
        }
        return avg;
    }
    
    //get's avg of points
    public double averageOfPoints() {
        int count = 0;
        int pointTotal = 0;
        for (int point: this.points) {
            pointTotal += point;
            count++;
        }
        double avgPoint = (double) pointTotal / count;
        if(this.points.isEmpty()) {
            return -1;
        }
        return avgPoint;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
