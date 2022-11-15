#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    pos_count = 0
    neg_count = 0
    for elt in arr:
        if elt > 0:
            pos_count += 1
        elif elt < 0:
            neg_count += 1
    print(pos_count/len(arr))
    print(neg_count/len(arr))
    print((len(arr)-(pos_count + neg_count))/len(arr))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
