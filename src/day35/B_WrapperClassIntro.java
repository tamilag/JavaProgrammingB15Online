package day35;

public class B_WrapperClassIntro {
    public static void main(String[] args) {
        int x =10;
        //primitive data types are pure value that has no attribute or behaviour
        //each primitive type has wrapper class that turn it into object
        //THIS IS AN OLD WAY OF WRAPPING
        Integer xObj1=new Integer(12);
        //NEW WAY:
        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("10");
        byte bValue = xObj2.byteValue();
        System.out.println("byte value = "+bValue);
        double dValue = xObj2.doubleValue();
        System.out.println("dValue = " + dValue);
    }
}
