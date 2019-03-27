public class Fibonacci{
    int fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int t = 0;
        if (n <= 0){
            return 0;
        }else{
            System.out.println("num1: "+ num1 + " num2: " + num2);
            for (int i=2; i <= n; i++){
                t = num1 + num2;
                num1 = num2;
                num2 = t;
                System.out.println("num"+ i + ": " + t);
            }
        }
        return 1;
    }
}