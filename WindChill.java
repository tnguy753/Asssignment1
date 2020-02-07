import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		System.out.println("Wind Chill Calculator \n");
		Scanner input = new Scanner(System.in);
		double temp,speed,calc,power;
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		
		temp = input.nextDouble();
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
		speed = input.nextDouble(); System.out.println();
		
		power=Math.pow(speed, 0.16);
		calc= 35.74 + 0.6215*temp - 35.75*power + 0.4275*temp*power;
		System.out.println("Wind chill temperature: " + calc + " degrees Fahrenheit \n");
		System.out.print("Programmer: Thao Nguyen");
		
		


	}

}
