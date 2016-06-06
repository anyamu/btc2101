//!NOTE: 'AbsInterface' below is an interface. It
//       is ALWAYS possible to come up with an
//       'abstract' class that is equivalent to an
//       interface. It is not so vice-versa!
interface AbsInterface {
    //!NOTE: All the methods below are 'abstract'
    //       though not explicitly set so via the
    //       'abstract' keyword. Therefore, they
    //       should ALL be implemented.
    public String getName();
    public int    getNumber();
    //!NOTE: 'getOther' below is ILLEGAL! You cannot
    //       have method bodies with interfaces.
    public String getOther(){
        return "interface AbsInterface";
    }
}
//!NOTE: Below is the equivalent 'abstract' class
//       implementation of the above interface without
//       the ILLEGAL method 'getOther()'. To use it you'll
//       have to use the 'extends' keyword!
// abstract class AbsInterface{
//     public abstract String getName();
//     public abstract int    getNumber();
// }
public class AbsInterfaceTest implements AbsInterface{
    private AbsInterfaceTest(){
        InterfaceCalls(this);
    }
    //!NOTE: Take note of the parameter in the method below:
    //       It is a reference to the interface!
    private void InterfaceCalls(AbsInterface a){
        System.out.println("Number: " + a.getName() +
                           "\t " + a.getName() +
                           "\t " + a.getOther());
    }
    //!NOTE: The '@Override' annotated methods below
    //       came from the interface.
    @Override
    public int getNumber(){
        return 2;
    }
    @Override
    public String getName(){
        return "AbsInterfaceTest";
    }
    public static void main(String []args){
        new AbsInterfaceTest();
    }
}
