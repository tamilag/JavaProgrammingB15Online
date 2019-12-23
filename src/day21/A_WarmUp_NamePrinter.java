package day21;

public class A_WarmUp_NamePrinter {
    public static void main(String[] args) {
//        Create a class called WakeUpTask1_NamePrinter
//        Given your name stored in a variable myName as String
//        for example :  String myName = "My name is Yourname here" :
//        1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
//        put arrow in between the character
//        Optionally
//        2 , print the sentence by 2 character at a time
//        just by incrementing by 1
//        3 , print the sentence by 3 character at a time
//        4 , print the sentence by 4 character at a time
        String myName="My name is Tamila";
        for (int x = 0; x <= myName.length()-1; x++) {
            System.out.print(myName.substring(x, x+1)+"->");
        }




























    }
}
