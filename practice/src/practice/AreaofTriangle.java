package practice;
import java.util.Scanner;
public class AreaofTriangle {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the Triangle:");
		double width = scanner.nextDouble();
		System.out.println("Enter the height of the Triangle:");
		double height = scanner.nextDouble();
		//Area = (width*height)/2
		double area =(width* height)/2;
		System.out.println("Area of Triangle is: " + area);
		}
}