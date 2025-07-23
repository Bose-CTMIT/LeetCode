class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> name =new HashSet<>();
        for(int num : nums){
            if(name.contains(num)){
                return true;
            }
            name.add(num);
        }
        return false;
    }
}