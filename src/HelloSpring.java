import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Car car = context.getBean("myCar", Car.class);
		
		// Call methods on the bean
		System.out.println(car.checkCar());
		System.out.println(car.getEngineStats());
		

	}
	
	//Conclusion: we can control the  type of object using the XML file, without changing the
	//source code. (Spring Inversion Of Control)

}
