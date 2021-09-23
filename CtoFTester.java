/* These functions should take in doubles as a parameter. This will be the
fahrenheit or celsius value and the function will return a double in the 
opposite unit as a parameter */

class CtoFTester {
    public static void main(String[] args){
        System.out.println("0 degrees celsius in fahrenheit is: " + celsiusToFahrenheit(0));
        System.out.println("0 degrees celsius in fahrenheit is: " + celsiusToFahrenheit(32));
        System.out.println("0 degrees celsius in fahrenheit is: " + celsiusToFahrenheit(64));
        System.out.println("0 degrees fahrenheit in celsius is: " + fahrenheitToCelsius(0));
        System.out.println("0 degrees fahrenheit in celsius is: " + fahrenheitToCelsius(32));
        System.out.println("0 degrees fahrenheit in celsius is: " + fahrenheitToCelsius(64));
    }
    public static double celsiusToFahrenheit(double a){
        return ((a * (9.0/5.0))+32.0);
    }

    public static double fahrenheitToCelsius(double a){
        return ((a-32.0) * (5.0/9.0));
    }
    
}