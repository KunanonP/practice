public class Palindrome{
    static void palindrome(String s){
        char[] reverse = s.toCharArray();
        char[] string = s.toCharArray();
        int j = reverse.length-1;
        int i = 0;
        int check = 1;

        for (i = 0; i < j; i++, j--){
            char temp = reverse[i];
            reverse[i] = reverse[j];
            reverse[j] = temp;
        }

        for(i=0; i <= reverse.length-1; i++){
            if(string[i] == reverse[i]){
                check = 1;
            }else{
                check = 0;
            }
        }
        System.out.println("reversed: ");
        System.out.println(reverse);
        if (check == 1){
            System.out.println(s + " is palindrome");
        }else{
            System.out.println(s + " is not palindrome");
        }
    }

    static void palindrome2(String s){
        String reverse = new StringBuffer(s).reverse().toString();
        if(s.equals(reverse)){
            System.out.println(s + " is palindrome");
        }else{
            System.out.println(s + " is not palindrome");
        }
    }
}