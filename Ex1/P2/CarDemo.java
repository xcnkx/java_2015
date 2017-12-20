class Car{

    int horsePower = 0;
    int speed = 0;
    int fuelConsumption = 0;
    int gasTank = 0;
    int travelledTime = 0;
    
    Car(){ //constructor
	horsePower = 315;
	speed = 0;
	fuelConsumption = 8;
	gasTank = 80;
	travelledTime = 0;
    }
    
    void speedUp(int increment){
	speed = speed + increment;
    }
    
    void applyBrakes(int decrement){
	speed = speed - decrement;
    }
    
    void travelledTimeUp(int increment){
	travelledTime = travelledTime + increment;
    }
    
    double getTankinfo(){
	double remain=0;
	remain = gasTank - ((speed*travelledTime)/fuelConsumption);
	if(remain<=0) return 0;
	else return remain;
    }
    
    void printStateTank(){
	if(getTankinfo()==0){
	    System.out.println("out of gas !");
	}
	else	System.out.println("Fuelmeter:"+ getTankinfo() + "L");
    }
}
	
class CarDemo{
    
    public static void main(String[] args){
	
	Car car1 = new Car();
	Car car2 = new Car();
	Car car3 = new Car();

	car1.speedUp(100);
	car1.travelledTimeUp(2);
	car1.printStateTank();
	car2.speedUp(50);
	car2.travelledTimeUp(3);
	car2.printStateTank();
	car3.speedUp(200);
	car3.travelledTimeUp(4);
	car3.printStateTank();
    }
}
	
