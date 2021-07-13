
public class ArrayDemo {
	public static void main(String[] args) {
		int marks[]= {98,97,99,89};
		
		//how many values is equivalent to the length of the array
		//if array has 3 values then the length/size of array will be 3
		
		System.out.println(marks.length);//length is property of array-which returns the array size
		
		//every box of the array has a address
		//that address is called by its index
		
		System.out.println(marks[0]);//this command can read the value at that index
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);//this will throw an error - ArrayIndexOutofBoundException error
		
		
		//one more way of declaring a array is
		int score[]=new int[3];//declaring a array of size 3 - but not initializing
		System.out.println(score[2]);
		//to initialize
		
	boolean b=true;
	boolean b2=true;
	if(b==b2) {
		System.out.println("soo true...");
	}
		
	int i=1,j=3;
	if(i==1 ||j==2) 
		System.out.println("ok");
		else
			System.out.println("not ok");
	}
		
		
	}



