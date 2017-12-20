package fuelconsumption;
public class AdvancedCar extends SimpleCar{
    private float a_con;
    private int time_b;
    private int time_f;
    public AdvancedCar(String name, float f_con, int distance,float a_con,int time_b, int time_f){
	super(name,f_con,distance);
	this.a_con = a_con;
	this.time_b = time_b;
	this.time_f = time_f;
    }
    public float getA_CON(){ return a_con; };
    public int getTIME_B(){ return time_b; };
    public int getTIME_F(){ return time_f; };
    public float calculateFuelConsumptionOldRegulations(){
	return (float)(time_f - time_b) / a_con + super.calculateFuelConsumptionOldRegulations();
    }
    public float calculateFuelConsumptionNewRegulations(){
	return (float)(time_f - time_b) / a_con + super.calculateFuelConsumptionOldRegulations();
    }
    public String toString(){
	return getClass().getSimpleName() + "\t" + getNAME() + "\t" + getF_CON() + "\t" + a_con + "\t" + getDIS() + "\t    " + time_b + "\t   " + time_f;
    } 
}
