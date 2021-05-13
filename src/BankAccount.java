//STATIC VARIABLES are SHARED among all objects of the class

public class BankAccount {
	private String name;
	
	//All BankAccounts will share this variable because it is static
	private static double balance;
	
	
	
    public static void welcome(){
    	//We cannot refer to instance data from a static method
    	//Static methods are not associated with an object
        System.out.println("Welcome" /* + name*/);
    }        

}
