package String;

public class assignmentQuestions {
    /* Q1 - Lower Case Vovels in a String */
    // Brute Force
    public static int countVovel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean checkAnagrams(String str1, String str2) {
        boolean anag = false;
        if (str1.length() != str2.length()) {
            return anag;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    anag = true;
                    i++;
                } else {
                    anag = false;
                }
            }
        }
        return anag;
    }

    public static void main(String[] args) {
        // String name = "Saurabh Anand";
        // System.out.println(countVovel(name));
        //System.out.println(checkAnagrams("qace", "care"));

        String a = "saurabh";
        String b = a.replace(a.charAt(0), a.charAt(6));
        System.out.println(a+" "+b);

    }
}
