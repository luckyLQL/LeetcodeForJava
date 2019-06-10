public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String resv = new StringBuffer(str).reverse().toString();
        if (str.equals(resv)) {
            return true;
        } else {
            return false;
        }
    }
}
