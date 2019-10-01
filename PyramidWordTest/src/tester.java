import java.util.Scanner;
import java.util.Arrays;


public class tester {


	
	public static void main(String[] args) {
		
		//here is where we take input from the user
		 Scanner text = new Scanner(System.in);
		 System.out.println("Please enter a word: ");
		 
		 String word = text.next();
		 
		//String to char array converter
		 char testArray[] = word.toCharArray();
		 
		 //Sort testArray
		 Arrays.sort(testArray);
		 
		 //New string to hold the new order
		 String result = new  String(testArray);
		 
		 System.out.println(" You entered " + result);
		 
		 
		

			
//					System.out.println("It appears that this word is not a 'pyramid' word. ");
//				}
//					System.out.println("It looks like this word is a 'pyramid' word!");
			
		}
		

	} 
	


