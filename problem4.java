package problem4;
import java.util.Scanner;
public class problem4 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your first integer");
	int number1 = input.nextInt();
	System.out.println("Enter your sconed integer");
	int number2 = input.nextInt();
	if(number1%number2==0)
		System.out.println("number1 is multiple of number2");
	else
		System.out.println("number1 is not multiple of number2");
	int multiple = number1 * number2;
	System.out.println(multiple);

	}
}
