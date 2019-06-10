public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2 || nums == null) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j;
    }

}
