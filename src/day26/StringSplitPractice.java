package day26;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge,Orhan,Susan";
        //first get all names into String array called namesArray
        //Spell the name of each person in this format:
        //A-b-b-o-s...
        //Z-u-l-y-a-r
        //Optionally count a from each name and print
        students = students.replace(" ", "");
        String[] namesArray = students.split(",");
        int studentCount = namesArray.length;
        for (int x = 0; x < studentCount; x++) {
            String name = namesArray[x];
            System.out.println("Spelling of name " + name);
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");
            }
            System.out.println();

        }
    }
}
