import java.util.*;

class StudentGradeCalculator {

    public int total_no_of_subjects;
    int total_mark = 0;
    public float student_percentage;
    public double student_CGPA;

    StudentGradeCalculator() {
    }

    public void Total_Subjects(int number) {
        total_no_of_subjects = number;

        for (int i = 1; i <= number; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the subject " + i + " :  ");
            String subject1 = sc.nextLine();
            System.out.print("Enter the mark scored in " + subject1 + "  :  ");
            int mark = sc.nextInt();
            total_mark += mark;
        }
    }

    public void Student_Percentage() {
        student_percentage = total_mark / total_no_of_subjects;
        System.out.println("Your percentage is  :  " + student_percentage + "%");
    }

    public void Student_CGPA(){
        student_CGPA = student_percentage / 9.8;
        System.out.println("Your CGPA  :  " +  String.format("%.2f", student_CGPA));
    }

    public void Student_Grade() {
        if (student_percentage >= 90) {
            System.out.println("Your Grade  :  A++ ");
        } else if (student_percentage >= 80) {
            System.out.println("Your Grade  :  A+");
        } else if (student_percentage >= 70) {
            System.out.println("Your Grade  :  A");
        } else if (student_percentage >= 60) {
            System.out.println("Your Grade  :  B+");
        } else if (student_percentage >= 50) {
            System.out.println("Your Grade  :  B");
        } else if (student_percentage >= 40) {
            System.out.println("Your Grade  :  C");
        } else {
            System.out.println("You Percentage is not enough for Grade");
        }
    }
    public void Redata(){
        System.out.println("Press 1 : To Calculate percentage and grade for a new Student");
        System.out.println("Press 0 : To exit the program ");
    }
}


public class Main extends StudentGradeCalculator{
    public static void main(String[] args) {
        boolean check = true;
        while(check) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the total number of subjects  :  ");
            int inputnumber = input.nextInt();
            StudentGradeCalculator student = new StudentGradeCalculator();
            student.Total_Subjects(inputnumber);
            student.Student_Percentage();
            student.Student_CGPA();
            student.Student_Grade();
            student.Redata();
            int check_value = input.nextInt();
            if(check_value == 1){
                check = true;
            }
            else{
                check = false;
                System.out.println("Thank you! Come Again");
            }
        }
    }
}