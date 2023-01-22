//Fahrenheit to celsius:
import java.util.*;
class FahrenheitToCelsius
{
 private static Scanner in = new Scanner(System.in);

public static void main(String[] args)
 {
    float temperature;
    System.out.println("Enter temperature in Farhenheit:");
   temperature = in.nextInt();
   temperature = ((temperature-32)*5)/9;
   System.out.println("temperature in celius ="+temperature);
 }
}