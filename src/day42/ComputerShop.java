package day42;

public class ComputerShop {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setBrand("apple");
        c1.setRam(32);
        c1.setPrice(2000);

        c1.runProgram();
        c1.calculate();

        c1.setPrice(12); //invalid, java ignores it
        c1.setRam(1000); //invalid, java ignores it
        System.out.println("c1 = "+c1.toString() );

        int myRam = c1.getRam();
        System.out.println("myRam is = " + myRam);

        System.out.println("----- HP -----");
        Computer c2 = new Computer();
        c2.setBrand("HP");
        //set HP price to half of apple price
        c2.setPrice(c1.getPrice()/2);
        //set HP price to quarter of apple ram
        c2.setRam(myRam/4);
        c2.runProgram();
        c2.calculate();
        System.out.println(c2.toString());

    }
}
