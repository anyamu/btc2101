class Animal{
  private String character = "Wild";
  public Animal(){}
  public Animal(String character){
    this.character = character;
  }
  public String getCharacter(){
    return character;
  }
}
class Man extends Animal{
  private String name;
  public Man(String name){
    super("Tame");
    this.name = name;
  }
  public String getCharacter(){
    return "The man " + name + " is " + super.getCharacter(); 
  }
}
public class VirtualMethod{
  public static void main(String []args){
    Animal anim = new Man("Bob");
    Man man = new Man("Tom");
    Animal ani = new Animal();
    System.out.println("Animal: " + anim.getCharacter());
    System.out.println("Man: " + man.getCharacter());
    System.out.println("Animal2: " + ani.getCharacter());
  }
}
