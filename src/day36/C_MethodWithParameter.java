package day36;

public class C_MethodWithParameter {
    public static void main(String[] args) {
    addOneHundred(25);
    addOneHundred(100);
    int num = 10;
    addOneHundred(num);
        System.out.println(num);

        System.out.println(addOneHundred2(100));
    }

//    public static void addOneHundreed (int x){
//        System.out.println(x+100);

      public static void addOneHundred (int x){
        x=x+100;
          System.out.println(x+100);
    }

    public static int addOneHundred2 (int x){
        x+=100;

        return x;
    }
}
