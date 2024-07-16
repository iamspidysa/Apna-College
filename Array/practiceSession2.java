package Array;
import java.util.*;
public class practiceSession2 {
    // Container with most Water
    public static int containerWMostWater(int arr[]){
        int max = 0;
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int area = 0;
            int length = Math.min(arr[left], arr[right]);
            int breadth = Math.abs(left-right);
            area = length * breadth;
            max = Math.max(area, max);
            if(arr[left]<=arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }

    public static List<Integer> lonelyNumber(int arr[]){
        //By ChatGPT
        Arrays.sort(arr);
        List<Integer> lonelyNumbers = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean isLonely = true;
            //Check Next Elememt
            if(i<arr.length-1 && (arr[i]==arr[i+1] || arr[i]==arr[i+1]-1)){
                isLonely = false;
            }
            //Check Previous Element
            if(i>0 && (arr[i]==arr[i-1] || arr[i]==arr[i-1]+1)){
                isLonely = false;
            }
            if(isLonely){
                lonelyNumbers.add(arr[i]);
            }
        }
        return lonelyNumbers;
    }
    public static void main(String[] args) {
        // int height[] = {1,8,6,2,5,4,8,3,7};
        // System.out.println(containerWMostWater(height));

        int nums[] = {1,2,4,6,10};
        List<Integer> lonelyNumbers = lonelyNumber(nums);
        System.out.println(lonelyNumbers);
    }
    
}
