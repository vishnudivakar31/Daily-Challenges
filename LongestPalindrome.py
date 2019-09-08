"""

Problem: Find the longest palindrome substring from a given string
Author: Vishnu Divakar

"""


class Solution:

    def __init__(self, s):
        self.data = s

    def __find_palindrome(self, start, stop):
        j = stop
        while j != start:
            temp = j
            i = start
            mid = start + temp / 2
            while i < mid:
                if self.data[i] == self.data[j]:
                    i += 1
                    j -= 1
                else:
                    break
            if i == mid:
                return self.data[start: temp + 1]
            j = temp - 1
        return ''

    def find_longest_palindrome(self):
        if len(self.data) == 0 or len(self.data) == 1:
            return self.data
        palindrome = self.data[: 1]
        for i in range(len(self.data) - 3):
            temp = self.__find_palindrome(i, len(self.data) - 1)
            if len(temp) > len(palindrome):
                palindrome = temp
        return palindrome


s = raw_input("Enter the string: ")
sol = Solution(s)
print sol.find_longest_palindrome()


