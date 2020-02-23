package day39;

public class A_SplitPractice {
    public static void main(String[] args) {
        String itemDetails = "iPhone 6s Plus,549,22.88";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = "+name);
        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);
        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = "+monthly);

        //SAME THING IN ONE SHOT

        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = "+ Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));

    }
}
