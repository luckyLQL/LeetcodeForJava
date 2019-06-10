public class ComplexNumberMultiplication_537 {
    public String complexNumberMultiply(String a, String b) {
        int c = Integer.valueOf(stripStr(a)[0]);
        int d = Integer.valueOf(stripStr(a)[1]);
        int e = Integer.valueOf(stripStr(b)[0]);
        int f = Integer.valueOf(stripStr(b)[1]);

        // ce + (de + cf) * i + fd(-1)
        int prefix = c * e + (-1) * f * d ;
        int end = d * e + c* f;

        return prefix + "+" + end + "i";

    }

    public String[] stripStr(String a) {
        String[] cs = new String[2];
        if (a.contains("+")) {
            cs[0] = a.substring(0, a.indexOf("+"));
            cs[1] = a.substring(a.indexOf("+")+1, a.length()-1);
            return cs;
        } else if (a.contains("i")) {
            cs[0] = "0";
            cs[1] = a.substring(0, a.length()-1) ;
            return cs;
        } else {
            cs[0] = a;
            cs[1] = "0";
            return cs;
        }


    }

    public static void main(String[] args) {
        ComplexNumberMultiplication_537 test = new ComplexNumberMultiplication_537();
        String[] aa = test.stripStr("1+-2i");
        System.out.println(aa[0] + "*" + aa[1]);
        System.out.println(test.complexNumberMultiply("1+2i", "3+4i"));
    }

}
