package repls;

import java.util.Scanner;

public class Repl51_52_54_58 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n1 = 1; //s.nextInt();
//        int n2 = 2; //s.nextInt();
//        int n3 = 3; //s.nextInt();
//        if (n1>n2 && n1>n3){
//            System.out.println("n1 is bigger");
//        }else if (n2>n1 && n2>n3){
//            System.out.println("n2 is bigger");
//        }else {
//            System.out.println("n3 is bigger");
//        }

//        Scanner s = new Scanner(System.in);
//        System.out.println("what is the farthest planet in the solar system:" );
//        System.out.println("a)venus" );
//        System.out.println("b)pluto" );
//        System.out.println("c)neptune" );
//        String a = s.nextLine();
//        if (a.equals("a")||a.equals("c")){
//            System.out.println(a+" is wrong");
//        }else if (a.equals("b")) {
//            System.out.println(a+" is correct");
//        }else{
//            System.out.println(a+"is not a valid answer");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter status code:");
//        int status = scan.nextInt();
//        switch (status){
//            case 200:
//                System.out.println("OK"); break;
//            case 201:
//                System.out.println("Created"); break;
//            case 202:
//                System.out.println("Accepted"); break;
//            case 301:
//                System.out.println("Moved Permanently"); break;
//            case 303:
//                System.out.println("See Other"); break;
//            case 304:
//                System.out.println("Not Modified"); break;
//            case 307:
//                System.out.println("Temporary Redirect"); break;
//            case 400:
//                System.out.println("Bad Request"); break;
//            case 401:
//                System.out.println("Unauthorized"); break;
//            case 403:
//                System.out.println("Forbidden"); break;
//            case 404:
//                System.out.println("Not Found");break;
//            case 410:
//                System.out.println("Gone"); break;
//            case 500:
//                System.out.println("Internal Server Error");break;
//            case 503:
//                System.out.println("Server Unavailable"); break;
//            default:
//                System.out.println("Invalid status code");
//        }


        Scanner scan=new Scanner (System.in);
        System.out.println("Enter month number:");
        int input=scan.nextInt();
        switch (input){
            case 1:
                System.out.println("January");break;
            case 2:
                System.out.println("February");break;
            case 3:
                System.out.println("March");break;
            case 4:
                System.out.println("April");break;
            case 5:
                System.out.println("May");break;
            case 6:
                System.out.println("June");break;
            case 7:
                System.out.println("July");break;
            case 8:
                System.out.println("August");break; case 9:
                System.out.println("September");break; case 10:
                System.out.println("October");break; case 11:
                System.out.println("November");break; case 12:
                System.out.println("December");break;
            default:
                System.out.println("Invalid number!");
        }

































    }
}
