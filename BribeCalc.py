#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.
def minimumBribes(q):
    bribes = 0
    i = len(q) - 1
    while i >= 0:
        if q[i] - (i + 1) > 2:
            print("Too chaotic")
            return
        j = max(0, q[i] - 2);
        while j < i:
            if q[j] > q[i]:
                bribes += 1
            j += 1
        i -= 1
    print(bribes)

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, raw_input().rstrip().split()))

        minimumBribes(q)
