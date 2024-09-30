package Lab1;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s);
            }
        }
    }

    public static String reverseString(String s) {
        String h = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            h += s.charAt(i);
        }
        return h;
    }

    public static boolean isPalindrome(String s) {
        String h = reverseString(s);
        return ((s.length() == 4) & (s.equals(h)));
    }
}

