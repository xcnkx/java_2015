import fuelconsumption.*;
public class TestPackage{
    public static void main(String[] args){

	SimpleCar[] cars = new SimpleCar[5];
	cars[0] = new SimpleCar("Nissan   ",13.0f,350);
	cars[1] = new AdvancedCar("Toyota   ",15.5f,200,9.5f,7,18);
	cars[2] = new DeluxeCar("Honda   ",14.0f,300,10.5f,7,18,10);
	cars[3] = new BusTaxi("Mercedes",6.6f,200,11.5f,7,18,10,10);
	cars[4] = new BusTaxi("Mitsubishi",7.7f,200,11.5f,7,18,10,10);

	FuelConsumptionCalculation c1 = new FuelConsumptionCalculation(cars);

	float result = c1.getFuelConsumptionOldRegulations() - c1.getFuelConsumptionNewRegulations();
	System.out.println("CarType        maker            燃費    AC燃費  Distance   Begin   End   TimeWith      Minimum");
	System.out.println("                                                            Work   Work  Passengers     passenger");
	System.out.println("----------------------------------------------------------------------------------------------------");
	for(int i=0;i<cars.length;i++) System.out.println(cars[i].toString());
	System.out.println("計算結果：");
	System.out.println("Old regulationで消費したガソリン " + c1.getFuelConsumptionOldRegulations() + " Liters");
      	System.out.println("New regulationで消費したガソリン " + c1.getFuelConsumptionNewRegulations() + " Liters");
	System.out.println("                節約したガソリン " + result + " Liters");
    }
}