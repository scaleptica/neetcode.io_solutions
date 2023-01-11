class Solution {
    public boolean containsDuplicate(int[] nums) {

        //HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<Integer> (); 

        for(int i=0; i<nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
