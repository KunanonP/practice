public class Main{
    public static void main(String[] args){
        //Binary Search
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9,10,20,50,60,80,90,99};
        int l = 0;
        int r = arr.length - 1;
        int x = 4;
        int result = ob.binarySearch(arr, l, r, x);
        System.out.println("index: " + result + " left: " + l + " right: " + r);

        //Fibonacci number
        Fibonacci ab = new Fibonacci();
        int fiboResult = ab.fibonacci(20);
        System.out.println(fiboResult);


    }
}