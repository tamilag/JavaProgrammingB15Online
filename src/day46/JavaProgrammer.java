package day46;

public class JavaProgrammer extends Programmer {

    @Override
    public void code() {
        System.out.println("Java developer code Java!");
        super.code();
    }

    @Override
    public void test() {
        super.test();
        System.out.println("Java programmer do unit test");
    }

    public void drinkCoffee () {
        System.out.println("Java developer drink coffee");
    }
    public void doRepl (){
        System.out.println("Java developer do repl tasks");
    }
}
