public class PowXN_50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        double half = StrictMath.pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * StrictMath.pow(x, n/(Math.abs(n)));
        }


    }

    public double myPow2(double x, int n) {
        if (n == 0) return 1;
        long p = n;
        return Math.pow(x, p);
    }

}
