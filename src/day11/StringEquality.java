package day11;

public class StringEquality {
    public static void main(String[] args) {
        //every object have their attribute like: car has model, make and year
        //also behavior like: car drive, make noise, change direction

        String name="Tamila"; //String literal
        String name2=new String("Tamila");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name==name2);
        String name3="Tamila";
        System.out.println(name==name3);
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
