import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set2.contains(nums[i]) && !set1.contains(nums[i])) {
                set1.add(nums[i]);
            } else if (!set2.contains(nums[i]) && set1.contains(nums[i])) {
                set1.remove(nums[i]);
                set2.add(nums[i]);
            }
        }

        return set1.iterator().next();

    }

    public int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if (map.get(nums[i]) > 1) {
                map.remove(nums[i]);
            }
        }

        return map.keySet().iterator().next();
    }

    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    public int singleNumber3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;

    }

}
