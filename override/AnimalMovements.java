public class Animal{
  public String getMovement(){
     return new String("Movement: Quadrupedal");
  }
}
public class Man extends Animal{
  public String getMovement(){
     return new String("Movement: Bipedal");
  }
}
public class Bird extends Animal{
  public String getMovement(){
     return new String("Movement: Bipedal, Quadrupedal");
  }
}
public class AnimalMovements{
  public static void main(String []args){
     Animal b = new Bird();
     whatAreTheMovements(new Animal());
     whatAreTheMovements(new Man());
     whatAreTheMovements(b);
  }
  private void whatAreTheMovements(Animal ani){
       if(ani instanceof Bird)
          System.out.println("Bird >> " + ani.getMovement());
       else if (ani instanceof Man)
          System.out.println("Man >> " + ani.getMovement());
       else
          System.out.println("Animal >> " + ani.getMovement());
  }
}
