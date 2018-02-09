import java.util.Scanner;

public class Main {

    public static void gradeCalulator(int grade){
        if (grade < 50 && grade >= 0){
            System.out.println("you failed");
        }else if (grade > 50 && grade < 60){
            System.out.println("you got passed");
        }else if (grade > 59 && grade < 70){
            System.out.println("you got C");
        }else if (grade > 69 && grade < 80){
            System.out.println("you got B");
        }else if (grade > 79 && grade <= 100){
            System.out.println("you got A");
        }else {
            System.out.println("you put the wrong number");
        }
    }

    public static boolean gradeChecker(int grade){

        if (grade >= 50 && grade <= 100){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        int grade;
        Scanner gradeIn = new Scanner(System.in);
        System.out.print("put your grade: ");
        grade = gradeIn.nextInt();
        System.out.println("your grade is " + grade);
        gradeCalulator(grade);
        System.out.println("you got "+ gradeChecker(grade));
    }
}
