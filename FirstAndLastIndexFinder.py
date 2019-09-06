"""
Problem is to find the first and last index of a target integer from a list of integer
"""


def find_ranges(items, target):
    result = [-1, -1]
    for i in range(len(items)):
        if items[i] == target:
            if result[0] == -1:
                result[0] = i
            result[1] = i
    return result


print("Enter the number of items: ")
size = int(input())

items = []

for i in range(size):
    print("Enter item: ")
    items.append(int(input()))

print "Enter the target"
target = int(input())

indices = find_ranges(items, target)

print indices
