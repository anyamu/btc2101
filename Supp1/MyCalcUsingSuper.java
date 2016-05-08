class Calc{
   int result;
   String operation;
   Calc(){
      operation = "superclass: none";
   } 
   public int add(int x, int y){
     operation = "superclass: add";
     return x + y;
   }
   public int sub(int x, int y){
     operation = "superclass: sub";
     return x - y;
   }
   public String getLastOp(){
     return operation;
   }
}
public class MyCalcUsingSuper extends Calc{
 String operation;
 MyCalcUsingSuper(){
   super();
   operation = "subclass: none";
 }
 public int mul(int x, int y){
   operation = "subclass: mul";
   return x * y;
 }
 public String getLastOp(){
   return "<<" + super.operation + ">> *** <<" 
          + operation + ">>";
 }
 public static void main(String args[]){
    int x = 3, y = 5;
    MyCalcUsingSuper calc = new MyCalcUsingSuper();
    System.out.println(calc.getLastOp());
    System.out.println(x + " + " + y + " = " + calc.add(x,y));
    System.out.println(calc.getLastOp());
    System.out.println(x + " - " + y + " = " + calc.sub(x,y));
    System.out.println(calc.getLastOp());
    System.out.println(x + " * " + y + " = " + calc.mul(x,y));
    System.out.println(calc.getLastOp());
 }
}
