package fuelconsumption;
public class SimpleCar{
    private String name;
    private float f_con;
    private int distance;
    public SimpleCar(String name, float f_con, int distance){
	this.name = name;
	this.f_con = f_con;
	this.distance = distance;
    }
    public String getNAME(){ return name; };
    public float getF_CON(){ return f_con; };
    public int getDIS(){ return distance; };
    public float calculateFuelConsumptionOldRegulations(){
	return (float)distance / f_con;
    }
    public float calculateFuelConsumptionNewRegulations(){
	return (float)distance / f_con;
    }
    public String toString(){
	return getClass().getSimpleName() + "\t" + name + "\t" + f_con + "\t\t" + distance; 
    }
}