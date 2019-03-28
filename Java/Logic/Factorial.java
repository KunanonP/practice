public class Factorial{
    int factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    static int interativeFactorial(int n){

        int res = 1;
        for (int i=2; i <= n; i++)
            res = res * i;
        return res;
    }
}