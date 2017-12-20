import java.util.Random;
 
public class CalculatingWorkingHours {
    public static void main(String[] args) {
      Employee[] e;
      Random rand = new Random();
      e = new Employee[rand.nextInt(500)]; //0~499のランダムなINT
      for(int i = 0; i< e.length; i++) {
         switch (rand.nextInt(4)) { //0~3
           case 0:
            e[i] = new Regular();
            break;
           case 1:
            e[i] = new PartTime();
            break;
           case 2:
            e[i] = new Engineer();
            break;
           case 3:
            e[i] = new Manager();
            break;
         }
      }
      int total=0;
          for(int i = 0; i < e.length; i++){
              e[i].generateNumberHours();
              total += e[i].getDayPayment();
          }
 
      System.out.println("Test: Number of workers: "+e.length+" Amount of money to pay: "+total);
 
   } // the end of the main method
}    // the end of the class CalculatingWorkingHours
