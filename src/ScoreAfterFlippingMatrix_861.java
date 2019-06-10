public class ScoreAfterFlippingMatrix_861 {
    public int matrixScore(int[][] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += translate(A[i]);
        }
        return sum;
    }

    public int translate(int[] B) {
        int s = 0;
        for (int j = 0; j < B.length; j++) {
            s += B[j] * Math.pow(2, B.length-j);
        }
        System.out.println(s);
        return s;
    }
}
