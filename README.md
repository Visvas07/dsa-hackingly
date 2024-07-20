# DSA Hackingly 30 days challenge 

This repository holds the details about the Hackingly DSA challenge.

Week One:

Problem 1:

Write a program to find the second largest number in an array.

Example:
Input: array = [12, 35, 1, 10, 34, 1]

Output: The second largest element is 34.

Approach:
1. Initialize two variables firstMax as 0 and SecondMax as 1.
2. Traverse through the array and check whether arr[i] > firstMax.
   1. If true, then assign firstMax = i, where i is the index of the largest element. This will indicate the largest element of the array.
3. Next, traverse through the array again and only do the following steps if arr[i] != firstMax. We are not considering the largest element.
   1. Check if secondMax = -1. if yes assign the index to the secondMax.
   2. Else check whether arr[i] > secondMax. If yes then assign the index to secondMax.
4. Return arr[secondMax] to return the second largest number to the main method in Main class.

Problem 2:

Write a program to remove duplicates from an unsorted linked list.

Input: array =  3->5->3->7->8->5->10
Output: 3->5->7->8->10

Approach:
1. Create a static class Node which contains the data of int data type and a Node object pointing to the next node.
2. Initiliaze a constructor Node with value so that once a Node object is created, it could be initialized with a constructor.
3. Create two node objects current and previous. Assign current to the head of the list and previous to null.
4. In order to get the duplicates, we need to have a HashSet which do not contain any duplicates even if we add more than one occurence of the data.
5. Traverse the list
   1. Get the data from the current node.
   2. Check if the data is present in hashset.
      1. If yes, skip the node by assigning previous.next to current.next so that the node gets skipped.
      2. If no, then add the data to the set and assign previous to current.
      3. Assign the current node to next node in order to visit the next node.
6. Add an helper function to print the list.
7. Once the removeDuplicates function is called, the duplicates will be removed.


Problem 3:

Write a program to move the zeroes to the end of the array.

Example:
Input: array = [1,2,0,4,3,0,5,0];
Output : array = [1, 2, 4, 3, 5, 0, 0, 0];.

Approach:
1. Initalize two pointers namely i and j. 
2. Let n be the length of the array.
3. Traverse the loop till the end of the array.
   1. Check if arr[i]!=0 and arr[j]=0. If yes, then swap both arr[i] and arr[j] with help of third variable.
   2. Check if arr[j]!=0. This is because after the swap operation, the value will change. If true, increment j.
4. Print the array in order to see the output.

