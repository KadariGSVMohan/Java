package Walk_in_Swaping;

public class Swap_UsingAdd_Sub_method {
	public static void main(String[] args) {
	int a = 2;
	int b = 3;
	System.out.println("Before Swaping : a "+a+", b "+b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("Aftere Swaping : a "+a+", b "+b);
	}
}
