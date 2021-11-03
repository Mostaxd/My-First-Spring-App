
public class MercedesCar implements Car {


	private String carName;
	private EngineService engine;
	

	
	//define a constructor for dependency injection
	public MercedesCar(String carName, EngineService engine) {
		this.carName = carName;
		this.engine = engine;
	}
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String checkCar() {
	return "Checked the Mercedes car";
	}

	@Override
	public void setEngine(EngineService newEngine) {
		this.engine = newEngine;
		System.out.println("A new Engine has been installed in car");
	}
	
	@Override
	public String getEngineStats() {
     // Check engine stats 
		return engine.getEngineStats();
	}

	
	

}
