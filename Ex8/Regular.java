import java.util.Random;
class Regular extends Employee{
    Regular(){
        super(2000);
    }
  public void generateNumberHours(){
        Random rand = new Random();
        setH(rand.nextInt(2)+8);
    }
}
