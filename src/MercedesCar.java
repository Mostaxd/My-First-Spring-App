
public class MercedesCar implements Car {

	//define a private field for Spring dependency injection
	private EngineService engine;
	

	
	//define a constructor for dependency injection
	public MercedesCar(EngineService engine) {
		this.engine = engine;
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
