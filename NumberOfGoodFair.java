public class NumberOfGoodFair {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count =0;
         for(int i = 0;i<nums2.length;i++){
             int num = k * nums2[i];
            for(int j = 0; j<nums1.length;j++){
               
                if(nums1[j]%num==0){
                    count++;
                }
        } 
        }   
        return count; //5
    }
    public static void main(String [] args){
        NumberOfGoodFair nope = new NumberOfGoodFair();
        int [] nums1 = {1,3,4}; //input
        int [] nums2= {1,3,4};
        int k = 1;
        System.out.println("Good Pairs are : " + nope.numberOfPairs(nums1 , nums2 , k)); // output - 5
 
    }
}
// You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.

// A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).

// Return the total number of good pairs.

