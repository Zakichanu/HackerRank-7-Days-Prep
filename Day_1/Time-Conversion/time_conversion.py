#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    hours = int(s[:2])
    rest = s[2:-2] # :mm:ss

    hours24 = (hours + 12) % 12 if s.endswith("AM") else (hours % 12) + 12
    
    return f"{hours24:02}{rest}"
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
