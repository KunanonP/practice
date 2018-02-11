import java.util.Scanner;

public class Main {
    public static void tryLoop(int n){
        int result = 0;
        for (int i = 0; i <= n; i++){
            result = result + i;
            System.out.println("i = " + i);
        }
        System.out.println("result: " + result);
        System.out.println("done");
    }
    public static void tryFibonacci(int n){
        int first = 0, second = 1, next, i;
        for (i = 0; i <= n; i++){
            if (i <= 1){
                next = i;
            }else{
            next = first + second;
            first = next;
            second = first;
            }
            if (next % 2 == 0 && next != 0){
                System.out.println(" " + next);
            }
        }

    }
    public static void printChar(char fromC, char toC){
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.print(" " + c);
        }
        System.out.println(" ");
        for (int c2 = 65; c2 <= 90; c2++){
            System.out.printf("%d->%c\n", c2, (char)c2 );
        }
        System.out.println(" ");
        for (char c3 = fromC; c3 <= toC; c3++){
            System.out.printf("character number: %d = %04X = %c \n", (int)c3, (int)c3, c3);
        }

    }
    public static void printChar2(){
        for (int c2 = 65; c2 <= 90; c2++){
            System.out.printf("%d->%c", c2, (char)c2 );
        }
    }
    public static void main(String[] args) {
        int n;
//        Scanner in = new Scanner(System.in);
//        System.out.print("put your number: ");
//        n = in.nextInt();
//        tryLoop(n);
//        tryFibonacci(n);
        printChar('A', 'ฮ');
    }
}
