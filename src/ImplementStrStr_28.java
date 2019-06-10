public class ImplementStrStr_28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || needle == null) return 0;
        else {
            int strstr = -1;
            for (int i = 0; i <= haystack.length()-needle.length(); i++) {
                if (haystack.substring(i, i+needle.length()).equals(needle)) {
                    strstr = i;
                    break;
                }
            }
            return strstr;
        }

    }
}
