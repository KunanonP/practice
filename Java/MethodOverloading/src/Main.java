public class Main {

    public static void main(String[] args) {

    double centemeters = calcFeetAndInchesToCentimeters(10,10);
        if (centemeters <= 0.0){
            System.out.println("Invalid parameters");
        }
    calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
                double centemeters = ((feet * 12) + inches) * 2.54;
                System.out.println(feet + " feet " + inches + " inches convert to " + centemeters + " centimeters");
                return centemeters;
        }
        System.out.println("Invalid feet or inches parameters.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches convert to " + feet + " feet and " + remainingInches +" inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        System.out.println("Invalid inches parameters.");
        return -1;
    }
}
