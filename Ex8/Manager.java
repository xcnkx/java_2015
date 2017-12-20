import java.util.Random;
class Manager extends Employee{
    Manager(){
        super(2900);
    }
    public void generateNumberHours(){
        Random rand = new Random();
        setH(rand.nextInt(6)+6);
    }
}
