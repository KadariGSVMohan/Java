package Walk_in_Swaping;

public class SwapUsing_Xor {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("Aftere Swaping : a "+a+", b "+b);

	}

}
