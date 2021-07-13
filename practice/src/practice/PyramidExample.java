package practice;
import java.util.Scanner;
public class PyramidExample {
	//12. Pyramid Examples
	public static void main(String[] args) {
		
//Pyramid

		for(int i =1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print("* ");
					}
				System.out.println();
				}
		
//Reverse Pyramid
		int rows = 6;
		for(int i=1; i<=rows; i++) {
			for(int j = rows; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
 //Floyd Triangle
		
		int i,  row, number = 1, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in Floyd Triangle:");
		row = sc.nextInt();
		System.out.println("**************************");
		
		for(i=1; i<=row; i++) {
			for(j=1; j<=i; j++ ) {
				System.out.print(number+" ");
				number++; //Incrementing the number
			}
			System.out.println();
		}		
		
	}

}
