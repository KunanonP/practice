public class Main {

    public static void main(String[] args) {

        double varOne = 20d;
        double varTwo = 80;
        double summ = (varOne + varTwo) * 25;
        System.out.println("Total is: " + summ);
        double remain = summ % 40;
        System.out.println("Remainder is: " + remain);
        if (remain <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
