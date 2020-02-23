package day42;

public class Movie {
    String name;
    double length;
    String genre;

    //default constructor - is a constructor that is given by a compiler
    //only if you don't have any in your class
    //it's invisible and it has no parameter , and no code inside
    public Movie () { //THE CONSTRUCTOR WITHOUT ARGUMENTS
        System.out.println("Empty movie");
    }

    //write a constructor to set all the fields value

    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    //toString method so we can directly print out
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }
}
