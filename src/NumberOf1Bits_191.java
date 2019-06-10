public class NumberOf1Bits_191 {
    public int hammingWeight(int n) {
        String by = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < by.length(); i++) {
            if (by.charAt(i) == '1') {
                count++;
            }
        }
        return count;

    }

    public int hamingWeight1(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            System.out.println(count);
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits_191 test = new NumberOf1Bits_191();
        System.out.println(test.hammingWeight(1010));
    }

}
