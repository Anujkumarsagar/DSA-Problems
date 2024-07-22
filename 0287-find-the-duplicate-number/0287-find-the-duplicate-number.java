class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int result = -1;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // correct index for nums[i]
            if (nums[i] != nums[correctIndex]) {
                // swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }

            if (i != correctIndex) {
                result = nums[correctIndex];

            }

        }

        return result;
    }
}