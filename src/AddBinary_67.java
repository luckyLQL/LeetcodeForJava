public class AddBinary_67 {
    public String addBinary(String a, String b) {
        int newlength = Math.max(a.length(), b.length());
        int sum[] = new int[newlength+1];
        String result = " ";
        for (int i = a.length()-1, j = b.length() -1, k = newlength; i > 0 && j > 0; i--, j--, k--) {
            if (i < a.length() && j < b.length()) {
                sum[k] = (sum[k]+(int)a.charAt(i) + (int)b.charAt(j))%2;
                sum[k-1] += (sum[k]+(int)a.charAt(i) + (int)b.charAt(j))/2;
                result = sum[k] + result;
                System.out.println(sum[k-1]);
            } else if (i < a.length() && j >= b.length()) {
                sum[k] = (sum[k]+(int)a.charAt(i))%2;
                sum[k-1] += (sum[k]+(int)a.charAt(i))/2;
                result = sum[k] + result;
                System.out.println(sum[k-1]);
            } else if (i >= a.length() ) {
                sum[k] = (sum[k]+(int)b.charAt(j))%2;
                sum[k-1] += (sum[k]+(int)b.charAt(j))/2;
                result = sum[k] + result;
                System.out.println(sum[k-1]);
            }
        }


        if (sum[0] == 0){
            return result;
        }else {
            return result;
        }


    }

}
