import java.util.HashSet;
import java.util.Set;

public class InputArrayIsSorted_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left < right && numbers[left] + numbers[right] != target) {
            int value = numbers[left] + numbers[right];
            if (value > target) right--;
            else left++;
        }
        return new int[]{left+1, right+1};

    }

    public static void main(String[] args) {
        InputArrayIsSorted_167 obj = new InputArrayIsSorted_167();
        int[] param = {1,2,11,15};
        obj.twoSum(param, 26);
    }

}
