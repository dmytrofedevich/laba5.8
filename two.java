package Package;
public class two {
	public static void main(String[] args) {
		int n=632;
		int a=n-630;
		int b=(n-602)/10;
		int c=(n-32)/100;
		if (a>b && a>c) {
			System.out.print("�������� ����� "+a);
		}
		else if(b>a && b>c) {
			System.out.print("�������� ����� "+b);
		}
		else {
			System.out.println("�������� ����� "+c);
		}

	}
}
