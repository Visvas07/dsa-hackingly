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

Saturday problems (21/07/2024)

Problem 1: Reverse a Number

Write a program to reverse a number.

Example:
Input: 1998
Output : 8991

Approach:
1. Declare two variables,rem for remainder and rev for storing the reverse number.
2. Continue the following steps until N!=0
   1. Get the remainder of the number when divided by 10.
   2. Get the reverse of the digit by multiplying rev by 10 and adding rem to it.
   3. Divide n by 10 to go to the next digit.
3. Once done, return the reverse number.

Problem 2: Merge 2 sorted linked list

Example: 
Input : 3->4->8->12
1->6->15->19
Output: 1->3->4->6->8->12->15->19

Approach:
1. Declare two nodes . Head for storing the list and tail for traversing both lists.
2. Check if the data of first node (let us say A) is less than data of the second node (let us say B).
   1. If true, assign A to head and traverse A to next node in A list.
   2. If false, assign B node to head and traverse B to next node in B List.
3. Assign tail to head.
4. Follow these steps until both list have been traversed
   1. If A.data < B.Data then assign tail.next to A and A to A.next (moving to next node)
   2. Else assign tail.next to B and B to B.next (moving to next node)
   3. Assign tail = tail.next to go to the next node.
5. If A is null, then assign tail.next to B.
6. If B is null, then assign tail.next to A.
7. Return head to get the resultant list.

Problem 3: Count the number of vowels
Example Input: Hackingly
Count :2

Approach:
1. Declare the variable count as 0 to count the no of vowels
2. Create a character array to extract the characters from the string.
3. Traverse till the end of loop:
   1. If the character matches any fo the vowels (AaEeIiOoUu), then increment count.
4. Return count.


Week Two:

Problem :
Write a problem to find the min and max elements of the array.
Input: array =  [3,1,4,6,2,7]
Output: 1,7

Approach:

1. Initialize two variables min and max to the first element of the array.
2. Iterate through the array to find the min element first by using Math.min method.
3. Next, iterate through the array to find the max element by using the Math.max method.
4. Print the max and min elements.

Problem 2:
Write a program to find the most frequent character in an array. if there are multiple element maximum number of times, print any of them
For example -:
Input: array = [1,3,2,1,4,1]
output: 1 appears three times in array.

Approach:
1. Create a hashmap with both key and value as Integer. 
2. Initialize maxCount variable as 0 and element with most frequency as -1.
3. Iterate through the array.
   1. Check if the hashmap contains the element. If yes, then create the frequency variable and assign the frequency value of the element to it.
   2. Increment the frequency and update the same in the hashmap.
   3. If the hashmap doesn't contain , then update the hashmap with frequency as value and element as key.
4. After that , iterate through the entryset of hashmap
   1. Check if max count is less than the frequency value of the element. If yes, then update the max count with the frequency of the element and the elementMaxFreq with the key.
   2. Check with all elements.
5. Return the element.


Problem 3:
write a program that where you have to find the sum of Even odd
For example -:      
Input: array = [1,2,3,4,5,6,7]
Output : array = 12 16

Approach:
1. Initialize two variables sumEven to store sum of even numbers and sumOdd to store sum of odd numbers.
2. Iterate through the array.
   1. Check if element is divisible by 2, if yes, add to sumEven.
   2. Else, add to sumOdd.
3. Print both sumEven and SumOdd.

Saturday

Problem 1: Write a program to find out whether the given year is a Leap year or not
For example -:
Input: 1990
Output: Non Leap Year
Input: 2024
Output: Leap Year

Approach:
1. Check whether the year is divisible by 400.
2. If yes, then check whether the year is divisible by 4.
3. If yes, then check whether the year is not divisible by 100.
4. If all conditions are true then it is a leap year. If not, then it is not a leap year.


Problem 2:Write a program to check whether the given number is a Perfect Number or not.
For example -:
Input: 1
Output: YES
Input: 96345
Output: NO

Approach:
1. Initialize sum as 0.
2. Iterate from 1 to num/2 . This is done because all the divisors of a number will come before num/2.
   1. Check if i divides num to give 0 as reminder. If yes, then add i to sum.
3. Check if sum is equal to num. If yes, return true. Else, return false.


Problem 3: Write a program check whether the Package is Dream Package or not
Note :-- if the salary is maximum than 5 lakh than return 'Dream' otherwise return 'NotDream'
For example -:
Input: 100000
Output: NOTDREAM

Approach:

We can use a conditional statement to print the result like:

   if(salary > 500000) ? "DREAM" : "NOTDREAM".

