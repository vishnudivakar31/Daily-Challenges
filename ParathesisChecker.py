"""
Problem is verify a equation is properly parathesised or not

Author: Vishnu Divakar

"""


class Solution:
    OPENING_CURLY = '{'
    CLOSING_CURLY = '}'

    OPENING_SQUARE = '['
    CLOSING_SQUARE = ']'

    OPENING_BRAC = '('
    CLOSING_BRAC = ')'

    def __init__(self, s):
        self.data = s

    def is_valid(self):
        stack = []
        for i in self.data:
            if i is self.OPENING_BRAC or i is self.OPENING_CURLY or i is self.OPENING_SQUARE:
                stack.append(i)

            if i is self.CLOSING_BRAC and stack[len(stack) - 1] is self.OPENING_BRAC:
                stack.pop()

            if i is self.CLOSING_CURLY and stack[len(stack) - 1] is self.OPENING_CURLY:
                stack.pop()

            if i is self.CLOSING_SQUARE and stack[len(stack) - 1] is self.OPENING_SQUARE:
                stack.pop()

        return len(stack) == 0


eq = raw_input("Enter an equation: ")

print eq

sol = Solution(eq)
print "Equation is ", sol.is_valid
