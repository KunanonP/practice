public class BinarySearch{
    int binarySearch(int arr[], int l, int r, int x){
        
        if (r >= l){
            int mid = l + (r - l)/2;
            System.out.println(mid + " " + arr[mid]);
            if (arr[mid] == x){
                return mid;
            }else if (arr[mid] > x){
                r = mid - 1;
                return binarySearch(arr, l, r, x);
            }else if (arr[mid] < x){
                l = mid + 1;
                return binarySearch(arr, l, r, x);
            }
        }
        return 0;
    }
}