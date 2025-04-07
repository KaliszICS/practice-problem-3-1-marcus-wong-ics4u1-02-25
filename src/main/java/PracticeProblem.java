public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sumOfDigits(7777));

	}
	public static int sumOfDigits(int x) {
		if (x < 0) {
			x = -x;
		}
		if (x >= 0 && x <= 9) {
			return x;
		}
		return sumOfDigits(x / 10) + (x % 10);

		}
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return n * factorial(n - 1);
		}
}
