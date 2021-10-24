abstract class Dog{
     //String breed;

    void bark(){
         System.out.println("Bark!");
     }

     public abstract void poop();
 }

 class Danger extends Dog{


     public void poop() {
         System.out.println("Bark 2");
     }
 }

public class AbstractClass {

    public static void main(String[] args) {
        Danger d = new Danger();

        d.bark();
        d.poop();





    }



}
