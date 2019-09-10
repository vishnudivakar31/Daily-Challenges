#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    max_sum = 0
    sums = [0] * n
    for i in queries:
        low = i[0] - 1
        high = i[1] - 1
        k_value = i[2]
        while low <= high:
            temp = sums[low] + k_value
            if temp > max_sum:
                max_sum = temp
            sums[low] = temp
            low += 1
    print(max_sum)

if __name__ == '__main__':
   # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = raw_input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, raw_input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()
