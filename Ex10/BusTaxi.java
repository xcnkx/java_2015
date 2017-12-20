import fuelconsumption.*;
public class BusTaxi extends DeluxeCar{
    private int min;
    public BusTaxi(String name, float f_con, int distance,float a_con,int time_b, int time_f,int time_p,int min){
	super(name,f_con,distance,a_con,time_b,time_f,time_p);
	this.min = min;
    }
    public float calculateFuelConsumptionOldRegulations(){
	return (float)(getTIME_F() - getTIME_B()) /(getA_CON()/min) + super.calculateFuelConsumptionOldRegulations();
    }
    public float calculateFuelConsumptionNewRegulations(){
	return (float)getTIME_P() / (getA_CON()/min) + (float)getDIS() / getF_CON();
    }

    public int getMIN(){return min;}
    public String toString(){
	return getClass().getSimpleName() + "\t\t" + getNAME() + "\t" + getF_CON() + "\t" + getA_CON() + "\t" + getDIS() + "\t    " + getTIME_B() + "\t   " + getTIME_F() + "\t " + getTIME_P() + "\t\t" + min;
    }
}