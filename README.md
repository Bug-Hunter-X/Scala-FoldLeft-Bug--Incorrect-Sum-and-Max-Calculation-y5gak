# Scala FoldLeft Bug: Incorrect Sum and Max Calculation

This repository demonstrates a common Scala programming error involving the incorrect use of `foldLeft` to perform multiple operations (summation and finding the maximum) simultaneously. The provided code attempts to calculate the sum and maximum of a list using a single `foldLeft` operation, but the approach is flawed, leading to incorrect results.  The solution demonstrates a more appropriate way to achieve the desired outcome.

## Bug Description:
The bug arises from trying to simultaneously calculate the sum and maximum value within the `foldLeft` function. The accumulator tuple `(acc._1 + elem, math.max(acc._2, elem))` is not correctly accumulating the sum and maximum value at each step, leading to an incorrect final result.

## Solution:
The corrected approach calculates the sum and maximum separately using cleaner and more understandable functions.  This method avoids the complexity and potential for errors encountered in attempting to combine both operations in one `foldLeft` call.
