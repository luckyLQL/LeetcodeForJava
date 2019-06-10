public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += ((int)s.charAt(i)-64) * Math.pow(26, s.length()-i-1);
        }
        return sum;

    }
}
