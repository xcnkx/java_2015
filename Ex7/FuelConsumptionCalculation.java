public class FuelConsumptionCalculation {
  public static void main(String[] args) {
    float fuelConsumptionOldRegulations = 0;
    float fuelConsumptionNewRegulations = 0;
    SimpleCar[] cars = { new DeluxeCar("Honda", 14.0F, 10.5F, 7, 18, 200, 8),
                         new AdvancedCar("Toyota", 15.5F, 9.5F, 7, 18, 200),
                         new SimpleCar("Nissan", 13.0F, 200),
                         new DeluxeCar("Van (Nissan)", 10.5F, 6.0F, 7, 18, 200, 8) };
    for (SimpleCar car : cars) {
      fuelConsumptionOldRegulations += car.calculateFuelConsumptionOldRegulations();
      fuelConsumptionNewRegulations += car.calculateFuelConsumptionNewRegulations();
    }
    System.out.println("Fuel Consumption OLD regulations: " + fuelConsumptionOldRegulations);
    System.out.println("Fuel Consumption NEW regulations: " + fuelConsumptionNewRegulations);
    double save = fuelConsumptionOldRegulations - fuelConsumptionNewRegulations;
    System.out.println("The company save " + save + " Liters of gasoline");
}
}
 
class SimpleCar{
    private float fuelConsumption;
    private float distance;
    protected String maker;
 
    public SimpleCar(String maker, float fuelConsumption, int distance){
    this.maker = maker;
    this.fuelConsumption = fuelConsumption;
    this.distance = distance;
        }
    public float getfuel() {
        return fuelConsumption;
  }
    public float getdis(){
        return distance;
    }
  
    public float calculateFuelConsumptionOldRegulations(){
    return getdis()/getfuel(); //走った距離を燃費で割る -> 走行に使用したガソリン量
  }
    public float calculateFuelConsumptionNewRegulations(){
    return getdis()/getfuel();
    }
}
 
class AdvancedCar extends SimpleCar{
    private float acFuel;
    private float beginWork;
    private float endWork;
 
    public AdvancedCar(String maker, float fuelConsumption, float acFuel,int beginWork,int endWork, int distance){
        super(maker,fuelConsumption,distance);
        this.acFuel = acFuel;
        this.beginWork = beginWork;
        this.endWork = endWork;
    }
    public float getbegin() {
        return beginWork;
  }
    public float getend(){
        return endWork;
    }
    public float getacFuel(){
        return acFuel;
    }
 
    public float calculateFuelConsumptionOldRegulations(){
        return super.calculateFuelConsumptionOldRegulations()+(getend() - getbegin())/acFuel; //走行に使用したガソリン＋走った距離/エアコンの燃費
    }
    public float calculateFuelConsumptionNewRegulations(){
        return super.calculateFuelConsumptionNewRegulations()+(getend() - getbegin())/acFuel;
    }
}
 
class DeluxeCar extends AdvancedCar{
    private float timeWithPassengers;
    public DeluxeCar(String maker,float fuelConsumption, float acFuel,int beginWork, int endWork, int distance, int timeWithPassengers){
        super(maker,fuelConsumption,acFuel,beginWork,endWork,distance);
        this.timeWithPassengers = timeWithPassengers;
    }
    public float gettimeWith(){
        return timeWithPassengers;
    }
    public float calculateFuelConsumptionOldRegulations(){
    return super.calculateFuelConsumptionOldRegulations(); //走行に使用したガソリン＋エアコンに使用したガソリン
    }
    public float calculateFuelConsumptionNewRegulations(){
        return  (getdis()/getfuel())+(gettimeWith()/getacFuel()); //走行に使用したガソリン＋客を乗せてた時間/エアコンの燃費。
    }
}
