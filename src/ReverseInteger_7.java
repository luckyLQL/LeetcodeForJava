public class ReverseInteger_7 {
    public int reverse(int x) {
        String str = String.valueOf(x);
        int length = str.length();
        String result = "";
        String flag = "";
        int rev = 0;
        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == '-'){
                flag = "-";
            } else {
                result = str.charAt(i) + result;
            }
        }
        result = flag + result;
        try {
            rev = Integer.valueOf(result);
        } catch (NumberFormatException e) {
            System.out.println("overflow");
        } finally {
            return rev;
        }

    }

    // wuyan
    public  int reverse_xw(int x) {
        char[] elements = new char[10];
        boolean signFlag = true;
        int pos = 0;
        int ret = 0;

        if (x == 0x80000000) {
            return 0;
        }
        if (x < 0) {
            signFlag = false;
            x *= -1;
        }
        while ((x / 10 != 0) || (x % 10 != 0)) {
            elements[pos++] = (char) (x % 10 + '0');
            if (elements[0] != '0') {
                if (pos == 10 && ret > 214748364) {
                    return 0;
                }
                ret *= 10;
                ret += (elements[pos - 1] - '0');
            } else {
                pos--;
            }
            x /= 10;
        }
        return signFlag ? ret : -1 * ret;
    }

    // clever
    public int reverse_cc(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newReverse = result * 10 + tail;
            if (result != (newReverse - tail) / 10) {
                return 0;
            } else {
                result = newReverse;
                x = x / 10;
            }
        }
        return result;
    }
}
