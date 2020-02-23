package day59;

public class FinallyBlock {
    public static void main(String[] args) {
        //in some cases we want to run certain code
        //no matter exception happen or not
        //as part of try catch

        int [] arr = {1,4,6};

        try {
            System.out.println("arr [[5]] = " + arr [5]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception caught " + e.getMessage() );
        }finally {
            System.out.println("This code will always run no matter we have exception or not");
        }
        System.out.println("The End");

    }
}
