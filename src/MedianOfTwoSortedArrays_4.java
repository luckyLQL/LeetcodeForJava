//import Math;
//public class MedianOfTwoSortedArrays_4 {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        int merge[] = new int[(nums1.length + nums2.length)/2+1];
//        while (i < nums1.length && j < nums2.length && k < merge.length) {
//            if (nums1[i] <= nums2[j]) {
//                merge[k++] = nums1[i++];
//            } else {
//                merge[k++] = nums2[j++];
//            }
//        }
//        if (i != nums1.length && k < merge.length) {
//            while (i<nums1.length) {
//                merge[k++] = nums1[i++];
//            }
//        } else {
//            while (j<nums2.length && k < merge.length) {
//                merge[k++] = nums2[j++];
//            }
//        }
//        for (int index = 0; index < merge.length; index++) {
//            System.out.println(merge[index]);
//        }
//
//        if (merge.length % 2 == 0) {
//            return (merge[merge.length - 2] + merge[merge.length - 1]) / 2.0;
//        } else {
//            return merge[merge.length - 1];
//        }
//    }
//}