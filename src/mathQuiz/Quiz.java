package mathQuiz;
import java.util.Scanner;
import java.util.Arrays;

public class Quiz {
	static int input () {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	static void Quiz(int cantidad) {
		int counter = 0;
		do {
			int num = (int) (Math.random()*10)+1;
			int num2 = (int) (Math.random()*10)+1;
			int num3 = num + num2;
			int input;
			System.out.println(num + " + " + num2 + " = " );
			do {
				input = input();
			} while (input != num3);
			counter +=1;
		}while (counter <= cantidad);
	}
	
	public static void main(String[] args) {
		Quiz(3);
	}
}
