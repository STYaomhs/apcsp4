
public class Pickachu {

	public static void main(String[] args) {
		System.out.println("\tPickachu welcomes you to the world of Pokemon!");
		System.out.println("\t\t\t (\\_/)");
		System.out.println("\t\t\t(o^.^)");
		System.out.println("\t\")

	}
	public static void main printPickacu
}

				   
import java.util.*;

public class QuadraticClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer.");
		String cont;
		do {
			System.out.print("Provide vaules for coefficients a, b, and c.\na: ");
			double a = scan.nextDouble();
			System.out.print("b: ");
			double b = scan.nextDouble();
			System.out.print("c: ");
			double c = scan.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a,b,c));
			System.out.print("\nDo you want to keep going? (Type \"quit\" to end): ");
			cont = scan.next();
		}while(!cont.equalsIgnoreCase("quit"));
		scan.close();
	}
}
				   
				   public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String direction;
		if(a>0) {
			direction = "Up";
		}else if(a<0) {
			direction = "Down";
		}else {
			return("This is not a quadratic.");
		}
		double xVertexValue = round2((-b) / (2 * a));
		double yVertexValue = round2((a * xVertexValue * xVertexValue) + (b * xVertexValue) + c);
		String roots = quadForm(a, b, c);
		return("Description of the graph of:\ny = " + a + "x^2 + " + b + "x + " + c + "\n\nOpens: " + direction + "\nAxis of Symmetry: x = " + xVertexValue + "\nVertex: (" + xVertexValue + ", " + yVertexValue + ")\nx-intercept(s): " + roots + "\ny-intercept: " + round2(c));
	}
	
	public static double discriminant(double a, double b, double c) {
		double ans = (b * b) - (4 * a * c);
		return(ans);
	}
	
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
	
	public static String quadForm(double a, double b, double c) { 
		double discrim = discriminant(a, b, c);
		if(discrim < 0) {
			return("No real roots");
		}
		double firstRoot = round2(((-b) - (sqrt(discrim))) / (2 * a));
		double secondRoot = round2(((-b) + (sqrt(discrim))) / (2 * a));
		if(discrim == 0) {
			return("" + firstRoot);
		}else{
			return(firstRoot + " and " + secondRoot);
		}
	}
}
