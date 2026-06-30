class Solution {
    public int[] twoSum(int[] nums, int target) {
        // value, index
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int approachVal = target - nums[i];
            if(map.containsKey(approachVal)) return new int [] {map.get(approachVal), i};
            map.put(nums[i], i);
        }
        return null;

    }
}
