public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String pre = strs[0];
        for (int i = 0 ; i < strs.length; i++){
            if (pre.length() == 0){
                break;
            } else {
                while (!strs[i].startsWith(pre)) {
                    pre = pre.substring(0, pre.length()-1);
                }
            }

        }
        return pre.length() > 0 ? pre:"";
    }
}
