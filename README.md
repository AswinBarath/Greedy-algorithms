# Greedy Algorithms 

*This Repository provides an overview of different approaches on problems to apply greedy algorithms*

## SDE Sheet problems on Greedy Algorithms

[Sheet Link](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)

### Day 8

| Completion Status | Problems on Greedy Algorithms | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [N meetings in one room](https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#) | [Brute, Better & Optimal Approaches](#N-meetings-In-One-Room) | [Java Soultion](./src/sde_sheet/NmeetingsInOneRoom.java) |
| ✅ | [Minimum Platforms](https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#) | [Brute, Better & Optimal Approaches](#Minimum-Platforms) | [Java Soultion](./src/sde_sheet/MinimumPlatforms.java) |
| ✅ | [Job Sequencing Problem](https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#) | [Brute, Better & Optimal Approaches](#Job-Sequencing-Problem) | [Java Soultion](./src/sde_sheet/JobSequencing.java) |
| ✅ | [Fractional Knapsack](https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1#) | [Brute, Better & Optimal Approaches](#Fractional-Knapsack) | [Java Soultion](./src/sde_sheet/FractionalKnapsack.java) |
| ✅ | [Greedy Algorithm to find Minimum number of Coins](https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/) | [Brute, Better & Optimal Approaches](#Minimum-Coins) | [Java Soultion](./src/sde_sheet/MinimumCoins.java) |

---

## What is a Greedy Algorithm ?

- An algorithm which makes greedy/optimal choice at every single step in a problem
- Greedy choice is defined by some rule like 
	- Select the largest number
	- Select the smallest number
	- Select an element that has a certain property

## A greedy example

- *Find n elements that provides the largest sum*
- Given: **[3,4,-1,2,-3,0]** , **n=4**
- Greedy choices: 4, 3, 2, 0 (Answer)

---

## Patterns in Greedy Problem Solving

- Sort the given input in ascending or descending order
- Use a custom class to create custom objects so that we can group multiple inputs
- Use a comparator to sort custom objects of inputs
- Generally, Time Complexity is O(NlogN) due to sorting

---


## Greedy algo problems Rundown
### (Approaches to Solve)

### N meetings In One Room
####  Amazon, Flipkart, MakeMyTrip, Microsoft 

- Given: Starting time in array and ending time in array 
- To return: Maximum meetings possible in given room 
- Conditions:
	- Only one meeting can be held in the meeting room at a particular time
	- Start time of one chosen meeting can't be equal to the end time of the other chosen meeting


#### Greedy solution

- Sort the meetings with respect to shortest finishing time
- (That is, sorting the meetings whose finishing time is early)
- Store start time, end time and order of meeting in a ArrayList of objects
- Maintain a endTime variable to update previous meeting's end time
	- If start time of the meeting is greater than endTime, then increase the count
	- Else skip the current meeting
- Time Complexity: O(N*logN) <= `O(N) + O(N*logN) + O(N)` | Space Complexity: O(N)


---


### Minimum Platforms

- Given: Arrival time in array and departure time in array 
- To return: 
- Conditions:
	- Same platform can not be used for both departure of a train and arrival of another train. 
- Ask the Interviewer: Is starting time of the trains sorted or not?
- Possible Answer: No, it's not sorted

#### Greedy solution

- Sort the Arrival time and departure time arrays
- (That is, sorting the timings for the entire day in the station)
- Create two variables:
	- `platformsNeeded` - to store the current no. of platforms in use
	-  `maxPlatforms` - to store the maximum platforms required for the entire day
- Compare the arrival and departure time, and keep updating the above two variables
- Return maxPlatforms
- Time Complexity: O(N*logN) <= `O(2N*logN) + O(2N)` | Space Complexity: O(1)


---


### Job Sequencing Problem

- Given: Job Id, Deadline, Profit
- Return max jobs done with total max profit

#### Greedy Solution

- Sort jobs with respect to profit in decreasing order
- Use an array of size m, (where m is the maximum deadline from given data) to store jobs with max profit
- Take the jobs according to max profit, and insert job id in this array at the index = deadline or smaller index (i.e, insert at a free slot from index <= deadline)
- Return the total jobs done and max profit
- Time Complexity: O(N*logN) <= `O(2N*logN) + O(N) + O(N)` | Space Complexity: O(M)


---

### Minimum Coins

- Given: Array of denominations of coins and a Value
- To return: Minimum no. of coins to result the Value

#### Greedy Solution

- Start from the end of the array of denominations and compare with value
	- If, the denomination is greater, skip it and decrement
	- Else, save denomination, subtract the value and check this denomination again
- Time Complexity: O(V) (Where V is the no. of denominations used for given value) 
- Space Complexity: O(1)


---

### Fractional Knapsack

- Given: Item Weights and values associated to it and the target weight
- Return: Maximum value possible to pick from given items

#### Greedy Solution

- Find the value to weight ratio and sort it
- Start taking the items with respect to the sorted order of max value to weight ratios
- Subtract accordingly if the target weight is lower
- Return the max value gained

- Time Complexity: O(N*logN) <= `O(N*logN) + O(N)` | Space Complexity: O(1)

---
