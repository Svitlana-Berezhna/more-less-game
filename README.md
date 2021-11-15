# Task 1 - TDD + Junit

## More Less Game

Write a game on JAVA - a program that guesses a number according to the "more - less" principle:

1.	The program must guess an any number in the range from 0 to 100.

	The rand function. Description:

	`int `**`rand`**` ([int min, int max])`

	For example, if you want a random number between 5 and 15 (inclusive), call *`rand(5, 15)`*.
    
	Note: When called without the *min* and *max* parameters, it returns a pseudo-random integer number in the range from 0 to **RAND_MAX**.

2. The user is offered to try to guess the number by sequentially entering numbers from the range limited first to the numbers 0 and 100, and on further attempts - taking into account the previously entered numbers. The program must analyze the input for any erroneous user actions.

3. The screen must display the previous attempts, the range in which the required number is and the result of the previous user action.

4. If the numbers match - the program must inform the user about this and display all statistics on the user actions.
