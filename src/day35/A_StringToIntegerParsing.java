package day35;

public class A_StringToIntegerParsing {
    public static void main(String[] args) {
        //interview question
        //I have employee ID: "FB-457"
        //give me the number and store it to int
        String strNum="100";
        int num=Integer.parseInt(strNum);

        String empID="FB-457";

        //Integer is a class from java.lang
        //It's primarily used for wrapping up primitive value and treat it as an object
        //parseInt is a static method of Integer class
        //it will turn a String that has only numbers and return int result
        //if we have non-numerical character - it will give error NumberFormatException

        //int id =Integer.parseInt((empID.split("-")[1]));
        //----------------OR------------------------
        String [] empIdSplit=empID.split("-");
        String idStr = empIdSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id= "+id);

        //--------------TASK------------------
        String num1="100";
        String num2="600";
        //add these 2 nums and get the result
        int sum =Integer.parseInt(num1)+Integer.parseInt(num2);
        System.out.println(sum);
        //-------------TASK 2 -----------------
        String twoNums="100, 600";
        int sumOfTwoNums=Integer.parseInt((twoNums.split(",")[0]+twoNums.split(",")[1]));


    }
}
