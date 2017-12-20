package fuelconsumption;
public class FuelConsumptionCalculation {
    private float fuelConsumptionOldRegulation = 0.0f;
    private float fuelConsumptionNewRegulation = 0.0f;
    private SimpleCar[] cars;
    
    public FuelConsumptionCalculation(){
	cars = new SimpleCar[4];
	cars[0] = new SimpleCar("Nissan   ",13.0f,350);
	cars[1] = new AdvancedCar("Toyota   ",15.5f,200,9.5f,7,18);
	cars[2] = new DeluxeCar("Honda   ",14.0f,300,10.5f,7,18,10);
	cars[3] = new DeluxeCar("VanNissan",10.5f,400,6.0f,7,18,7);

	calculateFuelConsumption();
    }
    public FuelConsumptionCalculation(SimpleCar[] cars) {
	this.cars = cars;
	calculateFuelConsumption();
    }
    private void calculateFuelConsumption() {
	fuelConsumptionOldRegulation = 0;
	fuelConsumptionNewRegulation = 0;
	for(int i=0;i<cars.length;i++){
	    fuelConsumptionOldRegulation += cars[i].calculateFuelConsumptionOldRegulations();
	    fuelConsumptionNewRegulation += cars[i].calculateFuelConsumptionNewRegulations();
	}       
    }
    public float getFuelConsumptionOldRegulations() {
	return fuelConsumptionOldRegulation;
    }
    public float getFuelConsumptionNewRegulations() {
	return fuelConsumptionNewRegulation;
    }
}