class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        INT32_MIN, INT32_MAX = -2**31, 2**31 - 1
        
        # Handle the sign of the input
        sign = 1 if x >= 0 else -1
        x = abs(x)
        # Reverse the digits
        reversed_x = 0
        while x != 0:
            digit = x % 10
            x //= 10
            
            # Check for overflow before updating reversed_x
            if reversed_x > (INT32_MAX - digit) // 10:
                return 0
            
            reversed_x = reversed_x * 10 + digit
        

        return sign * reversed_x if sign == 1 else sign * reversed_x




        #return x if (x < 2**31-1 and x > -2**31) else 0
        # """
        # :type x: int
        # :rtype: int
        # """
        # integer = 0
        # while x!=0:
        #     reverse = (x%10)
        #     integer = integer*10 + reverse
        #     x= x//10
        # return integer
         # Define the range of a 32-bit signed integer