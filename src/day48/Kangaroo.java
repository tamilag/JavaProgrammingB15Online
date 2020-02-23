package day48;
//a class can implement more than one interface
public class Kangaroo implements Bouncible, BoxerWithBellyPouch {
    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public void eat (){
        System.out.println("Kangaroo " + name+ " is eating");
    }

    @Override
    public void bounce() {
        System.out.println(name + " can jump " + jumpDistance
                + " meters forward and it is good that there is " + GRAVITY + " gravity");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBoxing () {
        System.out.println("Kangaroo "+ name + " is boxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println(name + " is carrying a child in the pocket");
    }
}
