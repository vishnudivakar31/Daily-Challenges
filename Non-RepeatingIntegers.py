"""

Problem: Find the integer which is not repeating itself.
Author: Vishnu Divakar

"""


class Solution:

    def __init__(self, list):
        self.list = list

    def find_non_repeating_integer(self):
        list = self.list
        for i in range(len(list)):
            flag = False
            for j in range(0, len(list)):
                if list[i] == list[j] and i != j:
                    flag = False
                    break
                flag = True
            if flag is True:
                return list[i]
        return None

list = [4, 3, 2, 4, 1, 3, 2]
sol = Solution(list)
print sol.find_non_repeating_integer()