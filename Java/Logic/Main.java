public class Main{
    public static void main(String[] args){

        binSearch(4);
        fibo(20);
        factorial(6);
        interativeFactorial(6);
        palindrome("bright");
        palindrome2("level");
        binaryTree();

        int arr[] = {20,40,30,10,5};
        bubbleSort(arr);

        trim("           Kunanon PT    ");

        int arr2[] = {20,20,40,40,100,10,5,90,90,50,30,10,50,50,50,20};
        duplicate(arr2);

        int arr3[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        missing(arr3);
    }

    //Binary Search
    private static void binSearch(int x){
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9,10,20,50,60,80,90,99};
        int l = 0;
        int r = arr.length - 1;
        int result = ob.binarySearch(arr, l, r, x);
        if(result != 0){
            System.out.println("index: " + result + " left: " + l + " right: " + r);
        }
        
    }

    //Fibonacci number
    private static void fibo(int n){
        Fibonacci ab = new Fibonacci();
        int fiboResult = ab.fibonacci(n);
        if(fiboResult != 0){
            System.out.println("done");
        }
    }

    //Factorial
    private static void factorial(int n){
        Factorial fr = new Factorial();
        System.out.println(fr.factorial(n));
    }

    private static void interativeFactorial(int n){
        Factorial fr = new Factorial();
        System.out.println(fr.interativeFactorial(n));
    }

    // Palindrome check
    private static void palindrome(String s){
        Palindrome pd = new Palindrome();
        pd.palindrome(s);
    }

    private static void palindrome2(String s){
        Palindrome pd = new Palindrome();
        pd.palindrome2(s);
    }

    private static void binaryTree(){

        /*BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        */
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);

        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
        root.printLevelOrder(root);
    }

    private static void bubbleSort(int arr[]){
        Sort sort = new Sort();
        sort.bubbleSort(arr);
        sort.printArray(arr);
    }

    private static void trim(String s){
        System.out.println(s.trim());
    }

    private static void duplicate(int arr[]){
        Duplicate dup = new Duplicate();
        dup.duplicate(arr);
    }

    private static void missing(int arr[]){
        Duplicate dup2 = new Duplicate();
        int result = dup2.missing(arr);
        System.out.println("The missing number is: " + result);
    }
}