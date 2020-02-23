package day43;

import day42.Movie;

public class MovieActions {
    //this class has a lot of static methods to deal with movie object
    //this class does not a serve as template for creating object
    //just like arrays class does not serve as template for creating array object
    public static void main(String[] args) {
        Movie m1 = new Movie ("Joker", 2.5, "Drama");
        printMovieInformation(m1);
        Movie m2 = new Movie ("Cinderella", 1.5, "Family");
        printMovieInformation(m2);

        printShorterDurationMovieName(m1,m2);

        Movie result = getJokerMovieObject();
        System.out.println(result.getName());
        System.out.println(result.getLength());
        System.out.println(getJokerMovieObject().getGenre());
    }

    public static void printMovieInformation (Movie movieObj){
        System.out.print("The movie name "+movieObj.getName());
        System.out.print(" is "+movieObj.getLength()+ " hour long ");
        System.out.println(" and the genre is "+movieObj.getGenre());
    }

    public static void printShorterDurationMovieName (Movie movieObj1, Movie movieObj2){
        if (movieObj1.getLength()>movieObj2.getLength()){
            System.out.println(movieObj2.getName());
        }else{
            System.out.println(movieObj1.getName());
        }
    }

    public static Movie getJokerMovieObject(){
        Movie j = new Movie("Joker", 2.5, "Drama");
        return j;
    }

}


