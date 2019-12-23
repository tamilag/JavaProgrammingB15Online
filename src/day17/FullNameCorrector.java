package day17;

public class FullNameCorrector {
    public static void main(String[] args) {
       //               12345678901234
       String fullName="tAmIla gAdaEva";
       String firstName=fullName.substring(0,6);
       String lastName=fullName.substring(7);
       String firstNameCorrected=firstName.toUpperCase().substring(0,1)+ //TAMILA>>>>T
               firstName.toLowerCase().substring(1); //tamila>>>>amila
        System.out.println(firstNameCorrected);

//        String lastNameCorrected=lastName.toUpperCase().substring(8,9)+
//                lastName.toLowerCase().substring(9);
//        System.out.println(lastNameCorrected);
        String lastNameCorrected=lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);
        String fullNameCorrected=firstNameCorrected+" "+lastNameCorrected;
        System.out.println(fullNameCorrected);




























    }
}
