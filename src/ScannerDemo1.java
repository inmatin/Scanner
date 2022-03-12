import java.util.Scanner;
public class ScannerDemo1 {

	public static void main(String[] args) 
	{
		
		double x;
		int y;
		String z;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the decimal no: ");
		x = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.print("Enter the Non- decimal no: ");
		y = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Enter the String value: ");
		z = keyboard.next();
		keyboard.nextLine();
		
		
		System.out.println();
		System.out.println("Print X = "+ x);
		System.out.println("Print Y = "+ y);
		System.out.println("Print String = "+ z);
		
		keyboard.close();
			

	}

}
