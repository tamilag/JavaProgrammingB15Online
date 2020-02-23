package day37;

import java.util.ArrayList;
import java.util.List;

public class C_Swap {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        //swap the first value with last value
        int lastIndex=priceList.size()-1;
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex,temp);
        System.out.println("after swapping first value with last value \n"+priceList);
    }
}
