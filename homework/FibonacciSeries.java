package week2.homework;
public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8; // number of terms to print
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first + " ");
            } else if (i == 2) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
	}
}
