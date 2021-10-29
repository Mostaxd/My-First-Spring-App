
public class MercedesCar implements Car {

	//define a private field for Spring dependency injection
	private CarEngineService carEngineService;

	
	//define a constructor for dependency injection
	public MercedesCar(CarEngineService carEngineService) {
		this.carEngineService = carEngineService;
	}
	@Override
	public String checkCar() {
	return "Checked the Mercedes car";
	}

	@Override
	public String getEngineStats() {
		// Check engine stats 
		return carEngineService.getEngineStats();
	}

}
