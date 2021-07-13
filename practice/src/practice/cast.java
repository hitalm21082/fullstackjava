package practice;

public class cast {
	public static void main(String[] args) {
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		long ll=257;
		System.out.println("long value is "+ll);
		short ss=(short)ll;
		System.out.println("short value is "+ss);
		int ii=(int)ss;
		System.out.println("int vlue is "+ii);
		byte bb=(byte)ii;
		System.out.println("byte value is "+bb);
	    double d=23.47;
	    System.out.println("double value is "+d);
	    float f=(float)d;
	    System.out.println("float value is "+f);
	    int myint=(int)f;
	    System.out.println("my int value is "+myint);
	    int myascii=169;
	    char mychar= (char)myascii;
	    System.out.println((char)169);
	    System.out.println(mychar);
	    int mmm=0;
	    System.out.println(mmm);
	byte cc=20;
	byte dd=2;
	int ee=cc*dd;
	System.out.println(ee);
	int myintvalue=257;
	byte mybytevalue=(byte)myintvalue;
	System.out.println(mybytevalue );
	float myfloat=12.37f;
	int k=(int)myfloat;
	System.out.println(k);
	int g=160;
	char ch='a';
	System.out.println((char)160);
	System.out.println((int)ch);
	}
	
}
