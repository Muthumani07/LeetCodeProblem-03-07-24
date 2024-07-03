
class XorNumberOpr {
    public int duplicateNumbersXOR(int[] nums) {
        int n = 0;
        // int x =0;
        // int n[] = new int[nums.length];
        // for(int i =0;i<nums.length; i++){
        //     n[i] = 0;
        // }
        for(int i =0;i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                        n = n^nums[j];
                        nums[j] =0;
                        // System.out.println(n);
                    }
                }
            }
           
            // for(int k = 0; k < x.length();k++){

            // }
        }
        // System.out.println(Arrays.toString(n));
        // for(int k =0;k<n.length;k++){
        //     if(n[k]!=0 && n[k]!=k){
        //         x = x ^ n[k];
        //     }
           
        // }
    
    return n;
    }
    public static void main(String args[]){
        XorNumberOpr xobj = new XorNumberOpr();
        int nums[] = { 1,2,1,3};
        int nums1[] = {1,2,3};
        int nums2[] = {1,2,2,1};
        System.out.println(xobj.duplicateNumbersXOR(nums));
        System.out.println(xobj.duplicateNumbersXOR(nums1));
        System.out.println(xobj.duplicateNumbersXOR(nums2));
    }
}