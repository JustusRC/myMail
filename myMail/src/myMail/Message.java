package myMail;


public class Message {
	
	    //Based on P8.15 and P8.16
		//Justus Contreras
		//CS234
	
	//Variable Declaration

String sender,recipient,Text;

	
	//Constructor that takes the sender and recipient
	public Message(String sender, String recipient) {
		this.sender = sender;
		this.recipient = recipient;
		Text="";
		
}
	//Appends a line of text
	public void append(String t) {
	       Text = Text + "\n" + t ;
		}
	//Prints the emails
	 public void printMessage()
	 	{
		 
	     System.out.print("\n##Getting the email\n");
		 System.out.print("\nFrom: "+sender+"\nTo: "+recipient+"\n " +Text);
		  
		}

}




  
