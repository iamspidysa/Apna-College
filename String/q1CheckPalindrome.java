package String;

public class q1CheckPalindrome {
    public static boolean palindrome(String str){
        // boolean check = false;
        // int n = str.length();
        // for (int i = 0; i < n/2; i++) {
        //     if(str.charAt(i)==str.charAt(n-1-i)){
        //         check = true;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return check;

        //Less Complex way.
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
