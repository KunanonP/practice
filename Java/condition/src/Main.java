import com.sun.org.apache.xpath.internal.SourceTree;

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

    public static String stormType(int speed){
        String stormName = "";
        if (speed < 63){
            stormName = "Depression";
        }else if (speed >= 63 && speed < 118){
            stormName = "Tropical Storm";
        }else{
            stormName = "Typhoon";
        }
        return stormName;
    }

    public static String chineseZodiac(int year){
        int z = year % 12;
        String zodiacName = "";
        switch (z){
            case 0:
                zodiacName = "Monkey";
                break;
            case 1:
                zodiacName = "Rooster";
                break;
            case 2:
                zodiacName = "Dog";
                break;
            case 3:
                zodiacName = "Pig";
                break;
            case 4:
                zodiacName = "Rat";
                break;
            case 5:
                zodiacName = "Ox";
                break;
            case 6:
                zodiacName = "Tiger";
                break;
            case 7:
                zodiacName = "Rabbit";
                break;
            case 8:
                zodiacName = "Dragon";
                break;
            case 9:
                zodiacName = "Snake";
                break;
            case 10:
                zodiacName = "Horse";
                break;
            case 11:
                zodiacName = "Sheep";
                break;
        }
        return zodiacName;
//        if (z == 4){
//            zodiacName = "Rat";
//        }else if (z == 5){
//            zodiacName = "Ox";
//        }else if (z == 6 ){
//            zodiacName = "Tiger";
//        }else if (z == 7) {
//            zodiacName = "Rabiit";
//        }else if (z == 8) {
//            zodiacName = "Dragon";
//        }else if (z == 9) {
//            zodiacName = "Snake";
//        }else if (z == 10) {
//            zodiacName = "Horse";
//        }else if (z == 11) {
//            zodiacName = "Sheep";
//        }else if (z == 0) {
//            zodiacName = "Monkey";
//        }else if (z == 1) {
//            zodiacName = "Rooster";
//        }else if (z == 2) {
//            zodiacName = "Dog";
//        }else if (z == 3) {
//            zodiacName = "Pig";
//        }else{
//            zodiacName = "error";
//        }
//        return zodiacName;
    }
    public static String switchString(String s){
        String result = "";
        switch (s){
            case "one":
                result = "1";
                break;
            case "two":
                result = "2";
                break;
                default:
                    result = "Other";
                    break;
        }
        return result;
    }
    public static void main(String[] args) {
	// write your code here
//        int grade;
//        Scanner gradeIn = new Scanner(System.in);
//        System.out.print("put your grade: ");
//        grade = gradeIn.nextInt();
//        System.out.println("your grade is " + grade);
//        gradeCalulator(grade);
//        System.out.println("you got "+ gradeChecker(grade));

//          int speed;
//          Scanner stormSpeed = new Scanner(System.in);
//          System.out.print("put storm speed: ");
//          speed = stormSpeed.nextInt();
//          System.out.println(stormType(speed));
//
//          int year;
//          Scanner inYear = new Scanner(System.in);
//          System.out.print("please enter your year of birth: ");
//          year = inYear.nextInt();
//          System.out.println("your chinese zodiac is: " + chineseZodiac(year));

            String s;
            Scanner inString = new Scanner(System.in);
            System.out.print("please enter number in word: ");
            s = inString.next();
            System.out.println("number: " + switchString(s));
    }
}
