class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        self.nums = nums
        self.target = target  
        for i in range(len(self.nums)):
           
            for j in range(1,len(self.nums)):

                    if self.nums[i] +self.nums[j] == target:
                        
                        if i == j:
                            continue
                        return i,j
        