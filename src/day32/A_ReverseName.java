package day32;

public class A_ReverseName {
// reversePrintMyOwnName
// create a method that has no parameter
// and print your name in reversed order

    public static void main(String[] args) {
        reversePrintMyownName();
        nameDashPrint("Jojoshka Sladkiy Kotik");
        printAtoZAndZtoA();
    }

    public static void reversePrintMyownName() {
        String name = "Tamila";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void nameDashPrint(String name) {
        //print name with dashes in between
        //logic: keep concatenating, when last char - don't add it

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    
    public static void printAtoZAndZtoA (){
        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A' ;  i--) {
            System.out.print(i+"-");
        }
    }

    public static void printAlphabetInRange(char beginning, char ending) {
//* create a method that have 2 char as parameters: beginning, ending
//if beginning character is before ending character
//	for example beginning A , ending D  -->> ABCD
//if beginning character is after ending character
//	for example beginning D , ending A  -->> DCBA
// this mean beginning character comes before ending character
        // in ascii table
        if (beginning < ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();
            // this mean beginning character comes after ending character
            // in ascii table
        } else if (beginning > ending) {
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();

        } else {
            System.out.println("THEY ARE SAME CHARACTER!!!!");
        }
    }


    /*
    * printAtoZ
    * create a method that has no parameter
	    and print A-Z in one line
    *
    * */












    }


