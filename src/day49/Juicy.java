package day49;
//Interface can achieve loosely coupling between implementing classes
//for example: when we say flyable
//all implementing classes like Plane , Insects , Superman
//can be all Flyable and has nothing to do with each other
//and almost no knowledge about each other : known as loosely coupling
//this is why it's always preferred in design
public interface Juicy {
    public abstract void melt();
    //ANOTHER TYPE OF METHOD INTERFACE HAS IS :
    //STATIC METHOD, IT MUST HAVE A BODY
    //AND IT'S THERE TO PROVIDE SOME UTILITY METHODS
    //THAT DOES NOT BELONG TO ANY CLASS
    //STATIC METHODS OF INTERFACE ARE NOT INHERITED!

    public static void squeeze () {
        System.out.println("static squeezing"); //see Main class
    }
}
