package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carType="tesla";
        int carPrice=41000;
        int budget=40000;
//        if(carType.equals("corolla")||carType.equals("Tesla") && carPrice<=budget) {
//            System.out.println("Car purchased");
//        }else{
//            System.out.println("Not what I was looking for");
//        }
    if (carType.equals("corolla")){
        System.out.println("car acquired");
    }else if (carType.equals("tesla") && carPrice<=budget){
        System.out.println("car acquired");
    }else{
        System.out.println("not what was looking for");
    }
        //DRY - DO NOT REPEAT YOURSELF
        // IN 1ST VERSION WE PUT 2 FIRST STEPS OF THE 2ND VERSION IN ONE LINE

































    }
}
