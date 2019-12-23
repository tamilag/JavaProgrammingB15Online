package day27;

public class C_MultiDArray3 {
    public static void main(String[] args) {

        //task: find max comparing values in the array
        int[][] numbers = {{12,11,10,19}, {19,20,15}, {100,90,89,7888}};
        int max = numbers[0][0]; // assume that first element is the max.
        for (int i = 0; i<numbers.length; i++){ // checks each single dimensional array.
            for(int j=0; j< numbers[i].length;j++){ // checks each element in the single dimensional array.
                if (max<numbers[i][j]){ // compares index 0 of the array with each indexes
                    max = numbers [i][j]; // assigns the maximum number
                }
            }
        }
        System.out.println(max);

        // solution 2
        int max2 = numbers [0][0];
        for(int[] each1DArray : numbers ){ // variable each1DArray represents each single D array
            for(int eachInt: each1DArray){
                if (max2<eachInt){
                    max2 = eachInt;
                }
            }
        }
        System.out.println(max2);

        // finding the minimum number
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for(int j=0; j <numbers[i].length; j++){
                if(min>numbers[i][j]){
                    min = numbers[i][j];
                }
            }
            System.out.println("Minimum number is "+min);
        }
        System.out.println("--------------Find the longest name-------------");
        //TASK : find the longest name
        String [] developersTeam={"Timfgeg", "Tomewgdf'gpok", "Temfifjwrqewrw", "Tumak"};
        String [] testersTeam={"Yoewf", "Yuregergj;wdlkjasd", "Yaawlfiuhwe;iuhF;WEIU"};
        String [] businessAnalystsTeam = {"Myawei", "Miuk", "Maok"};

        String [][] scrumTeam={developersTeam, testersTeam, businessAnalystsTeam};
        int maxLength = scrumTeam[0][0].length();
        String longestString="";
        for (String [] each1dArray:scrumTeam) {
            for (String eachElement:each1dArray) {
                if (maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }
            }
        }
            System.out.println(maxLength);
        System.out.println(longestString);
        //TASK: find th shortest name
        System.out.println("-------------Find the shortest Name------------");
        int minLength=scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];
        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLength>scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortestString=scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);






















    }
}
