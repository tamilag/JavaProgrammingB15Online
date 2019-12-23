package day12;

public class LoginTest_IgnoreCase {
    public static void main(String[] args) {
        String userName="abc123";
        boolean userNameCorrect= userName.equals("ABC123");
        System.out.println(userNameCorrect);
        boolean userNameCorrect2=userName.equalsIgnoreCase("ABC123"); //case ignored, you will get true
        System.out.println(userNameCorrect2);

        String name="Tamila";
        boolean nameSpellCorrect=name.equals ("tamilaGadaeva");
        System.out.println(nameSpellCorrect);
        boolean nameSpellCorrect2=name.equalsIgnoreCase("TaMiLa");
        System.out.println(nameSpellCorrect2);









    }
}
