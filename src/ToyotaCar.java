
public class ToyotaCar implements Car {
	
	//define a private field for Spring dependency injection
		private CarEngineService carEngineService;
		
		
	//define a constructor for dependency injection
		public ToyotaCar(CarEngineService carEngineService) {
			this.carEngineService = carEngineService;
		}
	

		
	@Override
	public String checkCar() {
		// TODO Auto-generated method stub
		return "Checked the Toyota car";
	}

	public String getEngineStats() {
		// Check engine stats 
		return carEngineService.getEngineStats();
	}
	

}
