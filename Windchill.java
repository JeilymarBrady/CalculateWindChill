/* 
Jeilymar Brady
Sec 1 MWF Hauser
Lab #1 - windchill
02/13/14
This program calculates windchill temperature
	Included Creativity: 	User's name (input & output) - 3 points
				Format to 2 decimal places - 5 points
				If statement - 10 points
			
*/
import java.util.Scanner ;	//to be able to read from the keyboard

public class Windchill {
	public static void main(String[] args) {
		
		//create a Scanner object to read from the keyboard
		Scanner kbd = new Scanner(System.in) ;
		
		// identifier declarations
		double temperature ; 		//ambient temperature
		double windSpeed ;		//Wind speed
		double windChill = 0.0 ;	//Calculated sind
		String name = "Jeily" ;		//user's name
		
		//display prompts and get input
		System.out.print("Enter your name: ") ;
		name = kbd.nextLine() ;
		System.out.print("Enter the ambient temperature: ") ;
		temperature = kbd.nextDouble() ;
		System.out.print("Enter the wind speed: ") ;
		windSpeed = kbd.nextDouble() ;
		
		//error message if input is not valid
		if ( temperature <= -58 || temperature >= 41 || windSpeed <= 2 ) {
			System.out.println("Please enter a temperature greater than -58 and less than 41 and a wind speed greater than 2") ;
			System.exit(0) ;
		}
		
		// calculations
		windChill = 35.74+0.6215*temperature-35.75*Math.pow(windSpeed, 0.16)+0.4275*temperature*Math.pow(windSpeed, 0.16) ;

		//display results
		System.out.print(name + ", the wind chill temperature is: ") ;
		System.out.printf("%.2f", windChill) ;
		System.out.println(" degrees Farenheit.") ;
	}
}
