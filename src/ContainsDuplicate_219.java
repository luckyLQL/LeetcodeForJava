public class ContainsDuplicate_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) return false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = k; j > 0 && i + j < nums.length; j--) {
                if (nums[i] == nums[i + j]) return true;
            }

        }
        return false;

    }

//    public boolean contains(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        set.add(k);
//    }
}
