package week1.day1;

public class LearnIF {

	public static void main(String[] args) {
		int number = 1;
		if (number % 3 == 0 && number% 5 ==0) {
			System.out.println("The both number is divisible TRIZZ AND FIZZ");
		} else if (number % 3 == 0) {
			System.out.println("The number is divisible TRIZZ");
		} else if (number % 5 == 0) {
			System.out.println("The number is divisible FIZZ");
		}else
		 System.out.println("The both numbers are not divisible");
	} 
}
