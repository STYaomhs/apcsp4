/*Steven Yao
*8/29/19
*Period 4
*Group of methods that perform math calculations aka library
*/

public class Calculate {
	
	public static int square(int number) {
		/*Method used to square a number*/
		int answer = 0;
		answer= number*number;
		return answer;
	//returns the cube of a number
	public static int cube(int num) {
		int ans = num * num * num;
		return(ans);
	}
	
	//returns the average of two numbers
	public static double average(double num1, double num2) {
		double ans = (num1 + num2)/2;
		return(ans);
	}
	
	//returns the average of three numbers
	public static double average(double num1, double num2, double num3) {
		double ans = (num1 + num2 + num3)/3;
		return(ans);
	}
	
	//converts radians to degrees
	public static double toDegrees(double rad) {
		double ans = rad *(180/3.14159);
		return(ans);
	}
	
	//converts degrees to radians 
	public static double toRadians(double deg) {
		double ans = deg *(3.14159/180);
		return(ans);
	}
	
	//finds the discriminant
	public static double discriminant(double a, double b, double c) {
		double ans = (b * b) - (4 * a * c);
		return(ans);
	}
	
	//converts a mixed number to an improper fraction
	public static String toImproperFrac(int whole, int top, int bottom) {
		int numerator = (whole * bottom) + top;
		String ans = numerator + "/" + bottom;
		return(ans);
	}
	
	//converts an improper fraction to a mixed number
	public static String toMixedNum(int top, int bottom) {
		int whole = top / bottom;
		int numerator = top % bottom;
		String ans = whole + "_" + numerator + "/" + bottom;
		return(ans);
	}
	
	//expands the binomial from the form of (ax + b)(cx + d) into ax^2 + bx +c
	public static String foil(int varOne, int numOne, int varTwo, int numTwo, String variable) {
		int firstCoefficient = varOne * varTwo;
		int secondCoefficient = (varOne * numTwo) + (varTwo * numOne);
		String firstTerm = firstCoefficient + variable + "^2";
		String secondTerm = secondCoefficient + variable;
		int thirdTerm = numOne * numTwo;
		String ans = firstTerm + " + " + secondTerm + " + " + thirdTerm;
		return(ans);
	}
	
	//this determines whether numOne is divisible by numTwo
	public static boolean isDivisibleBy(int numOne, int numTwo) {
		if(numTwo==0) {
			throw new IllegalArgumentException("Cannot divide by zero. Your second number: " + numTwo);
		}
		boolean ans = numOne % numTwo == 0;
		return(ans);
	}
	
	//returns the absolute value of a number
	public static double absValue(double num) {
		double ans;
		if(num < 0){
			ans = num * (-1);
		}else{
			ans = num;
		}
		return(ans);
	}
	
	//returns the higher of two doubles
	public static double max(double numOne, double numTwo) {
		double ans;
		if(numOne > numTwo){
			ans = numOne;
		}else{
			ans = numTwo;
		}
		return(ans);
	}
	
	//returns the higher of three doubles
	public static double max(double numOne, double numTwo, double numThree) {
		double highOne = max(numOne, numTwo);
		double highTwo = max(numOne, numThree);
		double ans = max(highOne, highTwo);
		return(ans);
	}
	
	//returns the lower of two integers
	public static int min(int numOne, int numTwo) {
		int ans;
		if(numOne < numTwo) {
			ans = numOne;
		}else{
			ans = numTwo;
		}
		return(ans);
	}
	
	//rounds a double to two decimal values
	public static double round2(double num) {
		num *= 100;
		if(num < 0) {
			num -= 0.5;
		}else {
			num += 0.5;
		}
		num = (int) num;
		double ans =  num / 100;
		return(ans);
	}
	
	//multiplies a double by itself int times
	public static double exponent(double value, int power) {
		boolean negPower = false;
		if(power<0) {
			negPower = true;
			power *= -1;
		}
		double orig = value;
		value = 1;
		for(int i=0; i<power; i++) {
			value *= orig;
		}
		if(negPower) {
			value = 1 / value;
		}
		return(value);
	}
	
	//returns the factorial of a number
	public static int factorial(int num) {
		if(num < 0) {
			throw new IllegalArgumentException("No negative numbers. Your number: " + num);
		}
		int ans = 1;
		for(int i=num; i>0; i--) {
			ans *= i;
		}
		return(ans);
	}
	
	//returns a true or false for whether a number is prime
	public static boolean isPrime(int num) {
		boolean prime = true;
		for(int i=2; i<num; i++) {
			if(isDivisibleBy(num, i)){
				prime = false;
			}
		}
		if(num<2) {
			prime = false;
		}
		return(prime);
	}
	
	//returns the greatest common factor of two integers
	public static int gcf(int numOne, int numTwo) {
		int ans = 1;
		int lowest = min(numOne, numTwo);
		for(int i=2; i<=lowest; i++){
			if(isDivisibleBy(numOne, i) && isDivisibleBy(numTwo, i)){
				ans = i;
			}
		}
		return(ans);
	}
	
	//returns the square root of a number
	public static double sqrt(double num) {
		if(num<0) {
			throw new IllegalArgumentException("No real square root of a negative number. Your number: " + num);
		}
		double highSquared = 0;
		double ans;
		while(highSquared * highSquared < num) {
			highSquared++;
		}
		if(highSquared * highSquared == num) {
			ans = highSquared;
		}else{
			while(highSquared * highSquared > num) {
				highSquared -= 0.001;
			}
			ans = round2(highSquared);
		}
		return(ans);
	}
	
	//returns the roots of a quadratic
	public static String quadForm(int a, int b, int c) { 
		double discrim = discriminant(a, b, c);
		if(discrim < 0) {
			return("No real roots");
		}
		double xVertexValue = (double) (-b) / (2 * a);
		double firstRoot = round2(xVertexValue - (sqrt(discrim) / (2 * a)));
		double secondRoot = round2(xVertexValue + (sqrt(discrim) / (2 * a)));
		if(discrim == 0) {
			return("" + firstRoot);
		}else{
			return(firstRoot + " and " + secondRoot);
		}
	}
}

	}
}


