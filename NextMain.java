public class NextMain {
    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("A", "Star wars");
        theMovie.watchMovie();

       if(theMovie instanceof Adventure)  {
            ((Adventure)theMovie).watchMovie();
       }

       System.out.println("_____________________");

       Adventure jaws = (Adventure) Movie.getMovie("A", "Airplane");
       jaws.watchMovie();
       jaws.watchAdventure();
       System.out.println("________________");

       Comedy carry = (Comedy )Movie.getMovie("C", "Carry on Jatta");
       carry.watchMovie();
       System.out.println("____________");

       Object comedy = Movie.getMovie("C", "Airplane");
       Movie comedyM = (Movie) comedy;
       comedyM.watchMovie();
       Comedy comedyMovie = (Comedy) comedy;
       comedyMovie.watchComedy();

       var airplane = Movie.getMovie("C", "Airplane");
       airplane.watchMovie();

       var plane = new Comedy("Carry on Jatta");
       plane.watchComedy();
       System.out.println("_________");

       Object unknownObject = Movie.getMovie("S", "Airplane");
       if(unknownObject.getClass().getSimpleName() == "Comedy") {
        Comedy c = (Comedy) unknownObject;
        c.watchComedy();
       } else if(unknownObject instanceof Adventure) {
        ((Adventure)unknownObject).watchAdventure();
       } else if(unknownObject instanceof ScienceFiction syfy) {
        syfy.watchScienceFiction();
       }
    }
}
