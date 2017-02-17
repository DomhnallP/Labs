package atm;
public class BankAccount {

	/**
	 * This class stores the methods for the Transactions class.
	 * It includes 2 methods to withdraw and deposit money into the users account.
	 * @author Domhnall ó Póil
	 * @version 1.0
	 * @since 08 Feb 2017
	 */
	
    private static double balance;

	//Constructors
	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	// Methods
	

	/**
	 * add the value 'amount' to 'balance'
	 * @param amount double 
	 */
	
	public static void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	/**
	 * remove the value of 'amount' from 'balance'
	 * @param amount double 
	 * @return trueFalse boolean
	 */
	public static boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	/**
	 * checks the current value of 'balance'
	 * @param amount double 
	 */
	public double getBalance() 
	{ 
		return balance;
	}
}