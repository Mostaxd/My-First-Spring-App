
public class MyApp {

// This is a prototype of how the spring app will work.
	
	
	public static void main(String[] args) {
		
// 1- Creating Objects
		Car mercedes = new MercedesCar();
		Car toyota = new ToyotaCar();
		
// 2- Checking if the objects are working
		System.out.println(mercedes.checkCar());
		System.out.println(toyota.checkCar());
		
	}
	
	
// ==> Conclusion: This is a good program but its' problem is that it needs the source code in main
//				   to be changed. Why Can't we make just ONE object Car and change the type of it
//				   using an XML config file to configure which car is it?

}
