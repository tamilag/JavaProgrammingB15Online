package day18;

public class ForLoopIntro {
    public static void main(String[] args) {
        //count 1 to 5
        //for loop () has 3 parts separated by;
        //first part initialization: it will run only once when you enter the loop
        //second part: loop will stop if it's false, it will be checked every time
        //third part increment or decrement to change condition ..
        //
        for (int i=1;i<=5; i++){
            System.out.println("i= "+i);
            System.out.println("Happy Birthday, Roksana");
        }
        
        //count from 10 to 1
        for (int counter =10; counter>0; counter--){
            System.out.println("counter = " + counter);
        }
        

        
    }
}
