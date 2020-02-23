package day35;

public class C_WrapperTypePrimitiveConversion {
    public static void main(String[] args) {
        Integer num1=100; //autoboxing > primitive 100 become object
        int num2=Integer.valueOf("200"); //auto-unboxing into 200
        int num3=Integer.parseInt("200");
        //-----------parseInt VS valueOf------------------
        /*
        parseInt - RETURN AN INT VALUE CONVERTED FROM STRING
        valueOf - RETURN INTEGER OBJECT BY WRAPPING UP THE NUMBER

        YOU MAY USE WHICHEVER YOU WANT BECAUSE
        AUTO-BOXING AND UNBOXING WILL TAKE CARE OF IT AUTOMATICALLY
         */
        //----------------TASK-----------------
        //use this number IPR2012-00001 and store the year into an int variable
        //this case number always start with 3 characters either IPR,PGR, CBM, DER
        //followed by year, dash and 5 digit number

        String caseNumber = "IPR2012-00001";
        int year;
        String strYear=caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);

        //-----------------TASK-----------------
        //create method
        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));
    }
    public static int getYearOutOfCaseNumber(String caseNumber){
//        int year;
//        String strYear=caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;
        //------------one shot way------------------
        //do validation on case number
        //TODO: Case number should always start with either CBM, IPR, PGR, DER,
        // followed by 4 dig num, followed by - and by 5 digits number
        return Integer.parseInt(caseNumber.substring(3,7));
    }
}
