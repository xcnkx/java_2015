abstract class Animal {
    private static int count_dog,count_cat;
    public static void increment_dog() { count_dog++; }
    public static void increment_cat() { count_cat++; }
    public static int getCount_dog() { return count_dog; } 
    public static int getCount_cat() { return count_cat; } 
    abstract void noise();
}
class Dog extends Animal {
   public Dog() {};
   public void noise() {
      System.out.println("Woof");
      increment_dog();
   }
}
class Cat extends Animal {
   public Cat() {};
   public void noise() {
      System.out.println("Meow");
      increment_cat();
   }
}
public class Counter{
    public static void main(String[] args) {
      Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()};
      for (int i = 0; i < a.length; i++)
         a[i].noise();
     System.out.println(Dog.getCount_dog() + " woofs and " + Cat.getCount_cat() + " meow");
    }
}
