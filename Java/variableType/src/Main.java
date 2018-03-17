public class Main {

    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 50000L;

        long myResult = myLong + 10L * (myByte + myShort + myInt);
        short totalShort = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("result: " + myResult);
        System.out.println("Total Short: " + totalShort);

        double weightInPound = 200d;
        double poundToKilogram = weightInPound * 0.45359237d;
//        double convertToKilo = weightInPound * poundToKilogram;
        System.out.printf("%.4f", poundToKilogram);


    }
}
