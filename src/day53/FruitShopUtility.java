package day53;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f1 = new Apple ("sweet", "yellow", "Golden");
        Fruit f2 = new Orange ("sour", "red", 12);
        displayFruit(new Apple ("sweet", "yellow", "Golden")); // YOU CAN DIRECTLY PASS THE OBJECT
        displayFruit(f2);
        digestBetter(new Orange ("sour", "red", 12));
        digestBetter(new Apple ("sour", "green", "Semerenko")); //you can create a new Fruit Object inside
        Fruit x = getMyFavoriteFruit();
        System.out.println("my favorite fruit - " + x);
        x.getDigested();
        System.out.println(x.taste);
        System.out.println(getFavoriteByType(1));
        System.out.println(getFavoriteByType(2));
        System.out.println(getFavoriteByType(3));

    }

    //display fruit
    public static void displayFruit (Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }
    //create static void method called digestBetter
    // it accepts a Fruit as parameter type
    //and inside the method , it will digest the Fruit Object 2 TIMES

    public static void digestBetter (Fruit blabla){
       blabla.getDigested();
       blabla.getDigested();
    }

    //create static method called getMyFavouriteFruit
    //accept no parameter and return your favorite Fruit Object
    public static Fruit getMyFavoriteFruit (){
        //Fruit f = new Orange ("sour", "red", 12);
        //return f; OR>>>
        return new Orange ("sour", "red", 12);
    }

    //create a static method called GetFavoriteByType
    //it has int parameter
    //return fav apple object if type is 1, orange object - 2
    public static Fruit getFavoriteByType (int type ){
        if (type == 1){
            return new Apple ("sweet", "yellow", "Golden");
        }else if ( type == 2){
            return new Orange ("sour", "red", 12);
        }else{
            return null;
        }
    }
}
