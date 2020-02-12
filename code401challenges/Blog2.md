# Merge Sort
Merge Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence.

##Pseudo Code

    ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

    ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
## Visual
    [8,4,23,42,16,15] input
    [4,8,15,16,23,42] output
    
In this algorithm we are going to split array in half until the single element and then merge them in the same order in order
    O(logN) for space
    O(N) for time
       
![Image description](/code401challenges/assets/merge.jpg)
    