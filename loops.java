//loops are used to execute a set of instruction/statement/functions repeatedly

public class loops {

	public static void main(String[] args) {

    //For loop
    //We can initialize and modify multiple value in for loop
    //For loop is used when we know the number of iteration 
		for(int i=0;i<10;i++) {
			System.out.println("java");
		}

    //While loop
		//Initialization is always happens on the while loop
		//Increment/Decrement will always inside the loop
		//It checks the condition first then execute the statement(entry control loop)
		
		int i=0;
		while(i<=5) {
			System.out.println("hello");
			i++;
		}

    //Do-While loop
		//Here execution of body(i,e loops's statement) happens first then checks the condition
		//if you want to execute the statement at least once then use do while
		//It is also called exit control loop
		
		int j=0;
		do {
			System.out.println("world");
			j++;
		}while(j<=5);
		
	}

}
