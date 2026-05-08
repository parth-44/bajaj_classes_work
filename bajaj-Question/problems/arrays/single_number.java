class single_number {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int n : nums){
            result^=n;
        }
        return result ;
    }
}