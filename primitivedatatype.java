//Data types
//Data type is a facility that provided by every programming language to convert the given data into binary form so that they can store in RAM
public class datatypes {

	public static void main(String[] args) {
		
		
		/*integers data types
		 integer data types are used to store the integer data i,e numbers does not having decimal point
		 
		 Basically there are 4 different integer data types are they; 
		 
		 formula for finding range (-2^(n-1) to 2^(n-1)-1) where n=number of bits
		   => byte(store=8 bits,range= -128 to +127)
		   => short (store=16 bits,range= -32768 to +32767)
		   => int (store=32 bits,range= -2147483648 to +2147483647)
		   =>long (store=64 bits,-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		*/
		
		
		//Declaring and initializing data types
		
		byte a=127;
		short b=32767;
		int c=2147483647;
		long d=922372036854775807L; //in long you need to add suffix l or L after value
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		//Checking minimum and maximum value
		
		byte e=Byte.MAX_VALUE;
		byte e1=Byte.MIN_VALUE;
		
	    short f=Short.MAX_VALUE;
	    short f1=Short.MIN_VALUE;
	    
	    int g=Integer.MAX_VALUE;
	    int g1=Integer.MIN_VALUE;
	    
		long h=Long.MAX_VALUE;
		long h1=Long.MIN_VALUE;
		
		System.out.println("byte max="+e);
		System.out.println("byte min="+e1);
		
		System.out.println("short max="+f);
		System.out.println("short min="+f1);
		
		System.out.println("int max="+g);
		System.out.println("int min="+g1);
		
		System.out.println("long max="+h);
		System.out.println("long min="+h1);
		
		
		/*Real number data types
		 Real number data type is used to store the number with decimal point.
		 
		 Basically there are 2 different real number data types are they; 
		 
		 formula for finding range for float (-3.4 E^38 to +3.4 E^38) 
		   => float(store=32 bits,range= 1.4E-45 to 3.4028235E38)
		 formula for finding range for double (-1.7 E^308 to +1.7 E^308) 
		   => double(store=64 bits,range= 1.4E-45 to 3.4028235E38)
		   
		*/
		
		//Declaring and initializing data types
		
		float i =12.4f;    //if you do not specify float value with F or f or declare it as float a=(float)12.4 it gives error
		double j=12.5;
		
		System.out.println(i);
		System.out.println(j);
		
		//Checking minimum and maximum value
		
		float k=Float.MAX_VALUE;
		float k1=Float.MIN_VALUE;
		
		double l=Double.MAX_VALUE;
		double l1=Double.MIN_VALUE;
		
		System.out.println("float max="+k);
		System.out.println("float min="+k1);
		System.out.println("double max="+l);
		System.out.println("double min="+l1);
		
		/*Character Data Type(char)
		=>Character data type is used to store a single character enclosed with quote.
		=>Java follows 16 bit UNICODE format rather than 7 bit ASCII so the Character stores 2 bytes  
		=>we usually write character in single quotes
		*/
		
		char m='a';
		System.out.println(m);
		
		//we can get a character by giving ASCII value i,e (48-57=>0 to 9),(65-90=>A to Z),(97-122=>a to z)
		
		char n=65;
		System.out.println(n);
		
		/*Boolean Data Type(boolean)
		Boolean data type can only have 2 values:true or false */
		
		boolean isJava=true;
		boolean isC=false;
		System.out.println(isJava);
		System.out.println(isC);
		
		//we can also use comparative operators to get boolean value
		
		int p=3;
		int q=5;
		System.out.println(p>q);
		System.out.println(q>p);
		
		
		
	}

}
