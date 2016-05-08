class Calc{
   public int add(int x, int y){
     return x + y;
   }
   public int sub(int x, int y){
     return x - y;
   }
}
public class MyCalc extends Calc{
 public int mul(int x, int y){
   return x * y;
 }
 public static void main(String args[]){
    int x = 3, y = 5;
    MyCalc calc = new MyCalc();
    System.out.println(x + " + " + y + " = " + calc.add(x,y));
    System.out.println(x + " - " + y + " = " + calc.sub(x,y));
    System.out.println(x + " * " + y + " = " + calc.mul(x,y));
 }
}
