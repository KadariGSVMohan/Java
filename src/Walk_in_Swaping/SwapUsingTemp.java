package Walk_in_Swaping;

public class SwapUsingTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swaping : a "+a+", b "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Aftere Swaping : a "+a+", b "+b);
	}

}
