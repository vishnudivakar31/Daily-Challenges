"""

Problem: Provided an array, check whether the array is non-decreasing, if it is can it be done in 1 change
Author: Vishnu Divakar

"""


class Solution:

    def __init__(self, list):
        self.list = list

    def check_list(self):
        list = self.list
        count = 0
        prev = list[0]
        for i in range(1, len(list)):
            if list[i] < prev:
                count += 1
            if count > 1:
                return False
            prev = list[i]
        return True

list = [5, 1, 3, 2, 5]
sol = Solution(list)
print sol.check_list()