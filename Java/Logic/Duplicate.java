public class Duplicate{
    public static void duplicate(int arr[]){
        int n = arr.length;
        int count = 0;
        int i,j;

        for(i = 0; i < n; i++) {
            for(j = i + 1; j < n ; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1)
               System.out.println(arr[i]);
            count = 0;
            
        }
        
    }

    public static int missing(int arr[]){
        int n = arr.length;
        int i, total; 
        total  = (n+1)*(n+2)/2;  
        for ( i = 0; i< n; i++) 
           total = total - arr[i];
        return total; 
    }
}