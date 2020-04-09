import java.util.Scanner;

public class Deliverable2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		String newInput = userInput.next();
		String upperInput = newInput.toUpperCase();
		String newMessage = "";
		int nameLength = upperInput.length();
		
		System.out.println("What is your message?");
		
		
		for (int i = 0; i < newInput.length(); ++i) {
		    char ch = newInput.charAt(i);
		    if (!newMessage.isEmpty()) {
		        newMessage += "-";
		    }
		    int n = (int)ch - (int)'a' + 1;
		    newMessage += String.valueOf(n);
		}
		System.out.println("");
		System.out.println("Your encoded message is " + newMessage);
		
		int asciiSum = 0;
		for (int i = 0; i < upperInput.length(); i++){
		    asciiSum += (int)upperInput.charAt(i);
		}
		
		var checkSum = asciiSum;
		 
		System.out.println("");
		System.out.println("Message checksum is " + checkSum);
		
	}
		
		

	}


