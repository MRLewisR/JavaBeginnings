import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");

        double fahrenheit = myObj.nextDouble();
        myObj.close();
        double celcius = (((fahrenheit - 32)*5))/9;
        System.out.println(fahrenheit + "F is " + celcius + "C");
    }
}