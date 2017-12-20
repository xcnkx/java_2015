import java.util.Random;
class Engineer extends Employee{
    Engineer(){
        super(2500);
    }
  public void generateNumberHours(){
        Random rand = new Random();
        setH(rand.nextInt(3)+8);
    }
}
