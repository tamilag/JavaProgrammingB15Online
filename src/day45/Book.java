package day45;
//IF WE DON'T EXPLICITLY (VISIBLY, MANUALLY) EXTEND ANOTHER CLASS
//WE ALWAYS AUTOMATICALLY EXTENDS OBJECT CLASS
//OBJECT CLASS IS SUPER CLASS OF ALL THE CLASSES IN JAVA
public class Book extends Object{


    public static void main(String[] args) {
        Book b1 = new Book ();
        System.out.println(b1.toString());

    }
    @Override // this is called annotation , it means that it is making it obvious
    //to declare we are rewriting the inherited super class method
    public String toString (){
        return "my own version of toString";
    }
}
