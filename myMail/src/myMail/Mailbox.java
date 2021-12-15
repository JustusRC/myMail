import java.util.ArrayList;
public class Mailbox {
	
	
	//Based on P8.15 and P8.16
	//Justus Contreras
	//CS234
	
	ArrayList<Message> messages;
	
	
	
	//Constructor that initializes an variable and stores email in an ArrayList
	public Mailbox() 
	{
		messages = new ArrayList<Message>();
	}
	//Adds an message/object
	public void addMessage(Message m) 
	{

		messages.add(m);
		
	}
	//Uses the .size function to get the size from the array lust
	public void getSize() 
	{
		
		System.out.println("The mailbox has: "+messages.size()+" email(s)"); 

		
	}
	//Removes the message
	public void removeMessage(int i)
	{
		
		//Validates that the email exist
		if (i <= 0 || i > messages.size())
		{
			System.out.println("That email number "+(i)+" does not exist");
			return;
		}
		
		System.out.println("##Removing the email"); 

		messages.remove(i-1);
	}
	//Stores the message
	public void getMessage(int i) 
	{
		//Validates that the email exist
		if (i <= 0 || i > messages.size())
		{
		     System.out.print("\n##Getting the email\n");

			System.out.println("That email number "+"("+(i)+") does not exist");
			return;
		}
		
		
		
	messages.get(i-1).printMessage();

	
	}
}
