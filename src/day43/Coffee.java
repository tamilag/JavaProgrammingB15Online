package day43;

public class Coffee {
    private String type ;
    private int caffeineLevel ;
    private double price;

    public Coffee () {
        System.out.println("no arg constructor");
    }
    //2 args constructor to set type and caffeine level
    public Coffee (String type, int level){
        this.type = type;
        caffeineLevel=level;
    }

    //create 3 args constructor, do not let the price go below 0, if it is less than 0 make it $1
    public Coffee (String type, int caffeineLevel, double price){
        this.type = type;
        this.caffeineLevel=caffeineLevel;
//        if (price < 0) {
//            this.price = 1;
//        }else{
//            this.price=price;
//        }COMMENTED OUT BECAUSE THIS CONDITION AWS USED IN setPrice
//        METHOD, AND I JUST CAN USE THAT METHOD INSIDE THIS METHOD
          setPrice(price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }else{
            this.price=1;
        }
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
