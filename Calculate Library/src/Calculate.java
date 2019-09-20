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
		
	}
	public static int cube(int num) {
		/*This method is used to cube a number*/
		int answer = 0
		answer = num*num*num;
		return answer;
	}
	public static double average(double num1, double num2){
		/*This method creates the average of two numbers by adding them then dividng by two*/
		int answer = 0;
		answer = (num1*num2)/2;
		return answer;
	}
	public static double todegrees(int rad) {
		/*Method used to convert radians to degrees, by multiplying 180 degrees, then dividing by pi as 180 degrees = pi*/
		double degrees = 0;
		degree = (rad*180)/3.14159;
		/*3.14159 represents pi*/
		return degree;
	}
	public static double toRadians(double degree){
		/*This method does the opposite of toDegrees*/
		double radians = 0;
		radians = (degree*3.14159)/180
		return radians;
	}
	public static double discriminant(double num1, double num2, double num3){
		/*the Discriminant uses the coeffiecients(a,b,c) of quadratic formula, and helps determine the number of solutions in the equation*/
		discrim = 0;
		discrim = (num2*num2)-(4*num1*num3);
		/*the equation for discriminant is b squared minus four a c*/
		return discrim;
	}
	public static int toImproperFrac(int num1,int num2,int num3){
		/*This method turns an mixed number into an improper fraction*/
		int numerator = 0;
		int numerator = (num1*num3)+num2;
		/*the numerator is solved by multiplying the whole number and the denominator. Then you add the numerator in the mixed number*/
		System.out.println(numerator + "/" + num3);
	}
	public static int toMixedNum(int num1,int num2){
		/*Method that does opposite of previous method*/
		int whole = num1-(num1%num2);
		/*whole refering to whole number next to fraction in mixed number*/
		int numerator = num1 - whole;
		int denomerator = num2;
		System.out.println(whole + " " + numerator + "/" + denom);
	}
	public static void foil(String args[]){
		String 
	}
	public static int isDivisbleBy(int num1,int num2){
		boolean divide = num1%num2 == 0;
		return divide;
	}
	public static double absValue(double num){
		double answer = 0;
		if(num<-1){
			answer = num*-1
		}else{
			answer= num
		}
		return answer
	}
	public static double max(double num1,double num2){
		if(num1<num2){
			return num2;
		}else{
			return num1;
		}
	}
	public static double max(double num21, double num22, double num3){
		if(num21>num22){
			return num21;
		}else if(num23>num22){
			return num23;
		}else{
			return num22;
		}
		
	}
   	public static int min(int num1, int num2){
		if(num1>num2){
			return num2;
		}else{
			return num1;
		}
	}
   	public static double round2(double num){
		double answer = 0;
		answer = 
	}
	public static {
	}
	public static int factorial(int num){
		int i = 1;
		int factval = 1;
		while(i <= num){
			factval = factval*i;
			i++;
		}
		return factval;		
	}
	public static int isPrime(int num){
		boolean bool;
		if(num==0||num==1){  
   			bool == false;      
  		}else{
			for(int i=1;i<=num;i++){
				if(n%i==0){
					bool == false;
				}
			}
   		}       
	}
}


