package day49;

public interface Edible {
    //interface is like a contract , once someone signed anything must have all details
    //in interface fields are automatically public static final if not defined otherwise
    //naming convention is ALL CAPS
    //if a method with no body defined public abstract, it's automatically public abstract
    //INTERFACE IS NOT A CLASS
    //IT CANNOT HAVE CONSTRUCTOR

    boolean IS_HUMAN_FOOD=true;
    public abstract void eat ();
    public abstract void drink();
    //default method was added since Java 8 to provide default implementation to not break existing
    // implementing classes have an option to use it as is
    //or override it accoring to their own requirements
    //the default method ONLY EXIST IN INTERFACE
    //DEFAULT KEYWORD HERE IS NOT ACCESS MODIFIER
    //DEFAULT METHOD IS ALWAYS PUBLIC
    public default void digest(){
        System.out.println("You implement the code yourself");
    }

}
