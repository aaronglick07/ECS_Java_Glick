
public class EvennessMethod {
	public static void main(String[] args) {
	for (int i = 1; i <= 100; i++) {
		System.out.print(i + " ");
		isEven(i);
		isDivBy3(i);
		if (isEven(i) == true) {
			System.out.print("<");
		}
		if (isDivBy3(i) == true) {
			System.out.print("=");
		}
		System.out.println("");
	}
	}
	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isDivBy3(int x){
		if (x % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
