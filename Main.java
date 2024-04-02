import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Movie theMovie = Movie.getMovie("S", "Star Wars");
        // theMovie.watchMovie();

       Scanner Scanner = new Scanner(System.in);

       while(true) {
        System.out.println("Enter type (A for Adventure, C for Comedy, S for ScienceFiction or q to Quit):");
        String type = Scanner.nextLine();
        if("Qq".contains(type)) {
            break;
        }
        System.out.println("Enter title of the movie?");
        String title = Scanner.nextLine();

        Movie movie = Movie.getMovie(type, title);
        movie.watchMovie();

       }
    }
}