public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] T) {
        int[] daily = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int k = 1;
            for (int j = i+1; j < T.length; j++) {
                if (T[i] >= T[j]) {
                    k++;
                } else {
                    daily[i] = k;
                    break;
                }
            }
        }
        return daily;

    }
}
