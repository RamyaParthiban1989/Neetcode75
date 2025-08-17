package dsalgo.TwoPointers.ValidPalindrome;
/*
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:

1 <= s.length <= 1000
s is made up of only printable ASCII characters.


 */
public class ValidPalindrome {
    int i,j=0;

    public static void main(String[] args) {
        String s1 = "Was it a car or a cat I saw?";
        String s2 = "tab a cat";
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome(s1));
        System.out.println(v.isPalindrome(s2));
    }

    public boolean isPalindrome(String s) {
        s=s.replace(" ","").toLowerCase();

        char[] c = s.toCharArray();
        int n=c.length;
        i=0;
        j=n-1;
        for(int i=0;i<n/2; i++){
            while(!alphaNum(c[i]) && i<n){ i++;}
            while(!alphaNum(c[j]) && j>0){j--;}
                if (c[i] == c[j]) {
                    j--;
                    continue;
                }

           else{
               return false;
            }
        }
        return true;
    }


    public  boolean isPalindrome1(String s) {
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

}
