public class DivideTwoIntegers_29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        long Divisor = Math.abs((long)divisor);
        long Dividend = Math.abs((long)dividend);
        int flag = 1;
        if (divisor < 0) {
            flag = flag * (-1);
        }
        if (dividend < 0) {
            flag = flag * (-1);
        }

        long count = 0;
        while (Dividend >= 0) {
            Dividend = Dividend - Divisor;
            if (Dividend >= 0) count++;
        }
        if (count*flag >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (count*flag <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int)count*flag;

    }
}
