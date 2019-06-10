public class DistantBarcodes_1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length<2) return barcodes;


    }

    public Boolean check(int[] barcodes) {
        Boolean flag = true;
        for (int i = 0; i < barcodes.length-1; i++) {
            if (barcodes[i] == barcodes[i+1]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public int[] exchange(int[] barcodes) {
        int j = barcodes.length -1;
        for (int i = 0; i < barcodes.length -1; i++) {
            if (barcodes[i] == barcodes[i+1]) {
                barcodes[i+1]
            }
        }
    }

}
