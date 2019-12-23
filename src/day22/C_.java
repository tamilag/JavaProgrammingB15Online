package day22;

public class C_ {
    public static void main(String[] args) {

        String msg="I Struggle with Java";
        //loop thru each character, print letter at even index
        //use continue for this task
        //when you reach letter a break
        //break when you see third A case sensitive (optionally)

        for (int i = 0; i <= msg.length()-1 ; i++) {
            if (msg.substring(i, i+1).equals("a")){
                break;
            }
            if (i%2!=0){
             continue   ;
            }
            System.out.print(msg.charAt(i));
            }




































    }
}
