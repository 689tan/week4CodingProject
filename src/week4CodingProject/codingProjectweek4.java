package week4CodingProject;

import java.util.Scanner;

public class codingProjectweek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Question 1
		
	int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
		System.out.println(ages[ages.length - 1] - ages[0] );
		 
	int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 72}	;
	
	// These are the two arrays that I created for question 1 and how you would
	// call that last element in an array. 
	
	System.out.println(ages2[ages2.length - 1] - ages2[0] );
	int agesSum = 0;
	for (int i = 0 ; i < ages.length ; i++) {
		agesSum += ages[i];
	} 
	// I used a for loop to iterate through the first array and calculate
	// sum of all the elements in the array using the += operand.
	
	double agesAverage = agesSum / ages.length;
	System.out.println(agesAverage);
	
	// I then created an additional variable and used that sum divided by the 
	// number of elements in the ages array.

// End Question 1
	
// Question 2	
	String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"} ;
	
	int namesTotalChars = 0;
	double namesAverageChars = 0;
	
	// I created the String array and a couple variables that I would need
	// to be able to calculate how many characters are in each name and the
	// average length of each name.
	
	for (int i = 0 ; i < names.length ; i++) {
		namesTotalChars += names[i].length();
	}
	
	// using the .length() method I was able to calculate the total number of
	// of characters in the array with a for loop.
	
namesAverageChars = namesTotalChars / names.length;
	System.out.println(namesAverageChars);
	
	// Once the total number of characters was calculated I divided that variable
	// by the number of elements in the array using the .length method and set that
	// as one of the variables created at the beginning of the problem.
	
	String  namesConcat = "";
	for (int i = 0 ; i < names.length ; i++) {
		namesConcat += names[i] + " ";
	}System.out.println(namesConcat);
	
	// Using a for loop and a new variable I was able to concatenate the names 
	// in the names array together and using the + operand I was able to add a
	// space between each name.
	
// End Question 2	
	
// Question 3
	
	// You can access the last element of the array in two ways first and
	// the preferred way is to use the name of the array and then use the length method
	// and subtract that by one. Using the names array it would look like this:
	// names.length - 1;
	// The other way to access the last element of the array is to put the name of 
	// the array and then in brackets put the length of the array minus 1, like this:
	// names[5]. This method is far less effective and is prone to errors.

// End Question 3
	
// Question 4
	
	//	To access the first element of the array you simply put the name of the array 
	//	and enclose 0 in brackets as the first element will always have an index of 0.
	//	For example names[0].

// End Question 4
	
// Question5
	
	int namesLength [] = new int[names.length] ;
 		
	int nameLength = 0;
	
	for (int i = 0 ; i < names.length ; i++) {
		nameLength = names[i].length();
		namesLength[i] = nameLength;
	}
	
	// Using a for loop I was able to iterate through each of the names in the
	// names array and pull the length of that name using the .length() method.
	// With that method I set the values of the namesLength array by calling
	// that array and setting it equal to the length of the name in the names 
	// array as it iterated through. 
	
// End Question 5
	
// Question 6
	
	int namesLengthSum = 0;
	
	for (int i = 0 ; i < namesLength.length ; i++) {
		namesLengthSum += namesLength[i];
	}System.out.println(namesLengthSum);
	
	// Using the newly created namesLength array I was able to use a for loop 
	// to iterate over it and calculate the sum of all the elements in the 
	// array. This was done by creating the namesLengthSum variable and using 
	// the += operand adding each element as it iterates in the for loop.
	
// End Question 6
	
	
System.out.println("-------------Method Checks------------");

// This section is all just checks to make sure that my methods are working 
// as intended. Please continue past this section to see the code containing
// the actual methods.
	
// Question 7 Check
	
	String questionCheck = concatNTimes("Winner!", 3);
	System.out.println(questionCheck);

// Question 8 Check	
	String fullName = fullName("Tannon", "Hamilton");
	System.out.println(fullName);
	
// Question 9 Check 
	
	boolean ages100 = greater100(ages);

	System.out.println(ages100);
		
// Question 10 Check
	
	double[] doubleArr = { 5, 10, 13, 5, 15};
	
	double averageDoubleArr = averageArray(doubleArr);
	System.out.println(averageDoubleArr);
	
// Question 11 Check
	
	double [] doubleArr2 = { 4, 9, 12, 4, 14};
	
	boolean arr1GreaterArr2 = arr1GreaterArr2(doubleArr, doubleArr2);
	System.out.println(arr1GreaterArr2);
	
	
// Question 12 Check
	
	int temp = 76;
	boolean a = true;
	
	
	if (temp > 75) {
		a = true;
	}else { a = false;
	}

	boolean isHot = a;
	double money = 13;
	boolean buyDrink = willBuyDrink(isHot, money);
	System.out.println(buyDrink);
	
// Question 13 Check
	
		Scanner object = new Scanner(System.in);
		
		System.out.println("Please enter new password");
		
		String password = object.nextLine();
		
		String newPassword = passwordCheck(password);
		
		System.out.println(newPassword);
		
		
		
	
	
	
}

	

	
	
// Question 7
	
public static String concatNTimes(String word, int n) {
	
	String wordConcat = "";
	for (int i = 0 ; i < n ; i++) {
		wordConcat += word ;
		
	} return wordConcat;
}

// In the question I create a method that would return a String from
// a word that had been concatenated a certain number of times. 
// This was accomplished using a for loop that was set to loop the
// number of times of the parameter in the method. During that loop 
// each iteration added the String parameter to the new String variable.

// End Question 7

// Question 8

public static String fullName (String firstName , String lastName) {
	
	return firstName + " " + lastName;
}

// This method simply takes two String parameters and the returns those 
// concatenated with a space between them.

// End Question 8

// Question 9

public static boolean greater100 (int arr[]) {
	
	int sumOfArray = 0;
	for (int i = 0 ; i < arr.length ; i++) {
		sumOfArray += arr[i];}
	 if (sumOfArray > 100) {
		 return true;
		}else {
			return false;
		}
	} 
 
// In this method I set it to return a boolean. Once an int array has been added
// as the parameter a for loop iterates through and adds the values to each 
// other. Then an if statement checks to see if that number is greater than 
// 100, if it is then it will return true, if it is not then it will return false.

// End Question 9	

// Question 10

public static double averageArray (double arr[]) { 
	
	
	double sumArray = 0;
	double averageArray = 0;
	for (int i = 0 ; i < arr.length ; i++) {
		sumArray += arr[i];
		
	}averageArray = sumArray / arr.length;
	
	return averageArray;
}

// This method is set to return a double. Once the double array parameter is 
// entered a for loop iterates through and adds the values of the array together.
// once that is done the average is calculated by dividing the sumArray variable by
// the number of elements in the array using the .length method.
// It will then return the averageArray variable.

// End Question 10

// Question 11

public static boolean arr1GreaterArr2 (double arr1[] , double arr2[]) {
	
	double averageArr1 = 0;
	double averageArr2 = 0;
	double sumArr1 = 0;
	double sumArr2 = 0 ;
	
	for (int i = 0 ; i < arr1.length ; i++) {
		sumArr1 += arr1[i];
	} averageArr1 = sumArr1 / arr1.length;
	for ( int index = 0 ; index < arr2.length ; index++) {
		sumArr2 += arr2[index];
	} averageArr2 = sumArr2 / arr2.length;
	
	if (averageArr1 > averageArr2) {
		return true;
	} else {
		return false;
		
	}
	
}
	
// This method is very similar to the previous method but finding the average of the arrays is done
// for each array given. Once the average is found an if statement is set to determine if the average
// of the first array is greater than the average of the second array. If the first is greater than 
// the second then it returns true, otherwise it will return false.

// End Question 11	
	
// Question 12

public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	
	if (isHotOutside && moneyInPocket > 10.50) {
		return true;
	}else {
		return false;
	}
}

// This method will return a boolean and take a boolean and a double as its parameters. By using
// an if statement it determines if it is hot outside and you have more than $10.50 in your pocket,
// it will return true, and you will buy a drink, otherwise it will return false, and you won't buy a drink.

// End Question 12

// Question 13

public static String passwordCheck (String password) {
	
	if ((password.length() >= 8) && ( password.contains("!") || password.contains("@") ||  password.contains("#"))) {
		return "Strong Password";
	}else {return "Please enter a valid password";
}
	
// This method will allow you to check a string to see if certain parameters
// are met, like when you are creating a new password. If feel like a method 
// like this will be used quite frequently in on the job coding, albeit more 
// in depth and looped to require it a new password input if it does not meet 
// the parameters. 	
	
}

// End Question 13

}
