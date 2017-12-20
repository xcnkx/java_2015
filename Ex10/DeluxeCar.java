package fuelconsumption;
public class DeluxeCar extends AdvancedCar{
    private int time_p;
    public DeluxeCar(String name, float f_con, int distance,float a_con,int time_b, int time_f,int time_p){
	super(name,f_con,distance,a_con,time_b,time_f);
	this.time_p = time_p;
    }
    public int getTIME_P(){ return time_p; };
    public float calculateFuelConsumptionNewRegulations(){
	return (float)time_p / getA_CON() + (float)getDIS() / getF_CON();
    }
    public String toString(){
	return super.toString() + "\t " + time_p;
    }
}
