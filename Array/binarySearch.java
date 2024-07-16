package Array;

public class binarySearch {
    public static void binarySearching(int arr[], int target){

        int lo = 0;
        int hi = arr.length-1;
        int index = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                index = mid;
                break;
            }
            else if(arr[mid]>target){
                hi = mid -1;
            }
            else{
                lo = mid +1;
            }
        }
        if(index > 0){
            System.out.println("target Element Fount at "+index);
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,4,5,7,9,10,45,50,60};
        int target = 50;
        binarySearching(array,target);
    }
}
