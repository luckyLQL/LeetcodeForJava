public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int plus[] = new int[digits.length + 1];
        digits[digits.length-1] = digits[digits.length -1] + 1;
        for (int i = digits.length-1 ; i > 0 ; i--) {
            if (digits[i] < 10) {
                plus[i+1] = digits[i];
            } else {
                digits[i] = digits[i] - 10;
                digits[i-1] = digits[i-1] + 1;
                plus[i+1] = digits[i];
            }

        }
        if (digits[0] < 10) {
            return digits;
        } else {
            plus[1] = 0;
            plus[0] = 1;
            return plus;
        }

    }

    public int[] plusOne_1(int[] digits) {
        for (int i = digits.length -1 ; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return  digits;
            } else {
                digits[i] = 0;
            }
        }

        int plus[] = new int[digits.length + 1];
        plus[0] = 1;
        return plus;
    }

}
