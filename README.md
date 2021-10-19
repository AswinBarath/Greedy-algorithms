# Greedy-algorithms 

Problems based on greedy algorithms


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
- Compare the arrival and departure time
- 
- Time Complexity: O(N*logN) <= `O(2N*logN) + O(2N)` | Space Complexity: O(1)


---

### Job Sequencing Problem

- Given: Job Id, Deadline, Profit
- 
