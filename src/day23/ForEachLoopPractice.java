package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
 /*create long array or 5 items called salaries
 put your salary amounts that ok for your offer
 use for each loop to iterate over them
 optionally : print only the salary more than 100k
  */
        long[] salaries = {60000, 70000, 80000, 100000, 120000};
        for (long eachSalary : salaries) {
            System.out.println("My preferred salary is : " + eachSalary);
        }

        for (long salary :salaries) {
            //how can i skip salaries less than or equal 100000, see above
            if (salary<=100000){
                continue;
            }
            System.out.println("Salary over 100k is: "+salary);
        }
        //to find out what is the max salary, you need to pick any salary and that compare it to every salary located in array indexes
        //than you assign variable called salary and start comparing
        //after that you need to
        long maxSalary = salaries[0];
        for (long salary:salaries) {
            if (salary>maxSalary){
                maxSalary=salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
        
        
        
        
     



    }


}
