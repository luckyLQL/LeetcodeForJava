public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int j = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                j = i;
                break;
            }
        }
        return j;

    }

    // 58题
    public int lengthOfLastWord(String s) {
         String[] newStr = s.split(" ");
         return newStr.length > 0 ?  newStr[newStr.length-1].length():0;
    }
}
