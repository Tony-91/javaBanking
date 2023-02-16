# Withdraw, Deposit & check your balance in the NEW Java Banking App 

## public class bankAccount

First, we create a bankAccount class with 4 instance variables we'll be using thorughout the program:
1. int balance;
2. int previousBalance; 
3. String customerName;
4. String customerID;

![](images/S1.png)
> underneath that, we create our bankAccount constructor with 2 params.

## deposit, withdraw & getPreviousTransaction methods 

Next we create 3 methods that give our application functionaility yo do things.
- deposit(), withdraw() and getPreviousTransaction() are comprised of math equations that fulfill each of their expected functions. 
- Later down the line the `int amount` variable will equal `scan.nextInt()` - the user's next int input.

![](images/S2.png)

## showMenu()

The first block of code executed that acts as our aesthetics in terminal 
- initializes `char option`;

![](images/S3.png)

## showMenu() - cont.

This methods also coninueously runs a do/while loop with 5 different switch options

![](images/S4.png)

## Main 

Stylistically - I like to keep my Main clean as possible.
- Here, we create a new bankAccount instance and execute showMenu()

![](images/bank4.png)

## Finish product

![](images/bank5.png)


