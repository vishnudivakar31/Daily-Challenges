"""

Problem: Find whether any integer from the list can make the given sum k
Author: Vishnu Divakar

"""


class Solution:

    def __init__(self, list):
        self.data = list
        self.data.sort()

    def check_sum(self, target):
        for i in self.data:
            if self.data[i] > target:
                return False
            item = target - self.data[i]
            for j in range(i + 1, len(self.data)):
                if self.data[j] == item:
                    return True
                if self.data[j] > item:
                    break
        return False


list = [4, 7, 1, -3, 2]
target = 5

sol = Solution(list)

print sol.check_sum(target)
