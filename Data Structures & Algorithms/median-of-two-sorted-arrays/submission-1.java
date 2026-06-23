class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int[] arr=new int [n1+n2];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        int n =arr.length;
        double median =0;
        if(n%2==0){
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        else{
            median = arr[n / 2];
        }
        return median;
    }
}
