package myMail;



public class myMail {

	public static void main(String[] args) {
		//Create a new mailbox
		Mailbox myMail = new Mailbox();
		
		// Create a new email (1)
		Message email1= new Message("Emma", "Eduardo");
		// Add lines to the email
		email1.append("Hello");
		email1.append("This is confirmation email");
		email1.append("Please do not reply it");
		email1.append("");
		email1.append("Bye");
		// Add the email to the mailbox
		myMail.addMessage(email1);
		
		Message email2 = new Message("Thomas", "Eduardo");
		//Add lines to email
		email2.append("Hello Thomas");
		email2.append("Let's go to the park tomorrow");
		email2.append("");
		email2.append("Bye");
		//Add email to the mailbox
		myMail.addMessage(email2);
		
		// Create a new email (3)
		Message email3= new Message("Mary", "Eduardo");
		// Add lines to the email
		email3.append("Hi!");
		email3.append("I've learned something cool about Java");
		email3.append("You can use an object that uses another object");
		email3.append("Do you want to know how?");
		email3.append("I'll tell you tomorrow");
		// Add the email to the mailbox
		myMail.addMessage(email3);
		
		// Get the mailbox size
		myMail.getSize();
		
		// Remove an email from the mailbox
		myMail.removeMessage(2);
		
		// Get the mailbox size
		myMail.getSize();
		
		// Print the email
		myMail.getMessage(0);
		
		// Print the email
		myMail.getMessage(1);
		
		// Print the email
		myMail.getMessage(2);
		
		// Print the email
		myMail.getMessage(5);
		
	}

}
