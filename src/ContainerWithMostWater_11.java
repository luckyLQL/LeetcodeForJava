public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int maxSize = 0;
        if (height.length < 2) return maxSize;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j<height.length; j++) {
                maxSize = Math.max(maxSize, area(i, height[i], j, height[j]));
            }
        }
        return maxSize;
    }

    public int area(int pix1, int value1, int pix2, int value2) {
        return Math.abs(pix1-pix2) * Math.min(value1, value2);
    }


    // 改进后的时间复杂度为O(n)
    public int maxArea1(int[] height) {
        return height[0];
    }

}
