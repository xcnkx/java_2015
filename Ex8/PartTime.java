import java.util.Random;
class PartTime extends Employee{
    PartTime(){
        super(1000);
    }
  public void generateNumberHours(){
        Random rand = new Random();
        setH(rand.nextInt(5));
    }
}
