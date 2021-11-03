
public class ToyotaCar implements Car {
	
	//define a private field for Spring dependency injection
	    
	private String carName;
	private Engine engine;
		
		
	//define a constructor for dependency injection
		
	public ToyotaCar(Engine newEngine) {
			this.engine = newEngine;
		}
		
	@Override
	public String getCarName() {
		return "Car: "+ carName;
	}

	@Override
	public void setCarName(String carName) {
		this.carName = carName;
	}

		
	@Override
	public String checkCar() {
		// TODO Auto-generated method stub
			return "Checked the Toyota car";
	}
		
	@Override
	public void setEngine(Engine newEngine) {
		this.engine = newEngine;
		System.out.println("A new Engine has been installed in car");
		
	}
	
	public String getEngineStats() {
		// Check engine stats 
		return engine.getEngineStats() ;
	}



	


	



	
	

}
