package day54;

public class Clothes implements Wearable{
    int size;

    @Override
    public void wear() {
        System.out.println("who doesn't like to wear clothes");
    }
}

class Watch implements Wearable{
    @Override
    public void wear() {
        System.out.println("we wear watch on a left hand");
    }

}

class Perfume implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("I wear \"creed\" perfume");
    }
}

class MakeUp implements Wearable, Cosmetics{
    @Override
    public void wear() {
        System.out.println("girls who wear makeup look neat");
    }

    //------------ MAIN METHOD ---------------
    public static void main(String[] args) {
        Wearable c1= new Clothes();
        Clothes c2 = new Clothes();
        Object c3 = new Clothes();

        Wearable w1 = new Watch ();
        Watch w2 = new Watch();
        Object w3 = new Watch();

        Wearable p1 = new Perfume();
        Cosmetics p2 = new Perfume();
        Perfume p3 = new Perfume();
        Object p4 = new Perfume();

        Wearable m1 = new MakeUp();
        Cosmetics m2 = new MakeUp();
        MakeUp m3 = new MakeUp();
        Object m4 = new MakeUp();

    }


}
