//!NOTE: 'AbsClass' below has been explicitly set
//       as 'abstract'. Since this class, 'AbsClass'
//       has a method with a body (method 'getOther()'),
//       you CANNOT come up with an equivalent interface.
abstract class AbsClass {
    //!NOTE: Not all the methods below are
    //       'abstract'. If you need to declare
    //       a method as such you have to specify
    //       that explicitly with the 'abstract'
    //       keyword.
    public abstract String getName();
    public abstract int  getNumber();
    //!NOTE: 'getOther' below is perfectly legal!
    public String getOther(){
        return "extends AbsClass";
    }
}
public class AbsClassTest extends AbsClass{
    private AbsClassTest(){
        AbstractClassCalls(this);
    }
    //!NOTE: Take note of the parameter in the method below:
    //       It is a reference to the Abstract class!
    private void AbstractClassCalls(AbsClass a){
        System.out.println("Number: " + a.getNumber() +
                           '\t' + a.getName() +
                           '\t' + a.getOther());
    }
    //!NOTE: The '@Override' methods below were declared
    //       'abstract' in the abstract class 'AbsClass'.
    @Override
    public int getNumber(){
        return 1;
    }
    @Override
    public String getName(){
        return "AbsClassTest";
    }
    public static void main(String []args){
        new AbsClassTest();
    }
}
