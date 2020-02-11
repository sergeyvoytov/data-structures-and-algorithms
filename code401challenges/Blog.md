# Selection Sort
Insert Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence.

## Pseudocode

    InsertionSort(int[] arr)
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
      
## Visual
    [8,4,23,42,16,15] input
    [4,8,15,16,23,42] output

    
#### 1st RUN
On the 1st run our variable i would be 1 and out temporary array would be the length of 1 and will be storing first value {8}
    
#### 2nd RUN
On the second run our temporary array will have length of 2 and values {4,8}

#### 3rd RUN
On the third run our temporary array will have length of 3 and values {4,8,23}


#### 4th RUN
On the 4th run our temporary array will have length of 4 and values {4,8,23,42}


#### 5th RUN
On the 5th run our temporary array will have length of 5 and values {4,8,16,23,42}


#### 6th RUN
On the 5th run our temporary array will have length of 6 and values {4,8,15,16,23,42}

After that run our counter i will be 6 and match length of array and the for loop will stop. 
    O(n2) for space
    O(1) for time
       
![Image description](/code401challenges/assets/1sort.jpg)

