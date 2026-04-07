package algorithom.solutions;

/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, 
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * Example:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 */

public class MedianOf2SortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
		if(nums1.length > nums2.length){
			return findMedianSortedArrays(nums2,nums1);
		}
		
		int m = nums1.length;
		int n = nums2.length;
		int low = 0, high = m;
		
		while(low<=high){
			int i = (low + high)/2;
			int j = (m+n+1)/2-i;
			
			int maxLeft1 = (i==0)? Integer.MIN_VALUE : nums1[i-1];
			int minRight1 = (i==m)? Integer.MAX_VALUE : nums1[i];
			
			int maxLeft2 = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
			int minRight2 = (j==n) ? Integer.MAX_VALUE : nums2[j];
			
			if(maxLeft1 <= minRight2 && maxLeft2 <= minRight1){
				if((m+n)%2 == 0){
					return (Math.max(maxLeft1, maxLeft2)+Math.min(minRight1, minRight2))/2.0;
				}else{
					return Math.max(maxLeft1, maxLeft2);
				}
			}else if( maxLeft1 > minRight2){
				high = i-1;
			}else{
				low = i+1;
			}
			
			
		}
		
		return 0.0;
	}
	
	public static void main(String[] args) {
		int[] nums1 ={1,3,4,6,8};
		int[] nums2={3,5,7,9};
		
		double result = findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}
