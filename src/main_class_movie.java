public class main_class_movie {
    public static void main(String[] args){
        movie mymovie=new movie();
        mymovie.title="Ugram";
        mymovie.genre="Action";
        mymovie.rating=10.0f;
        mymovie.displayMovieInfo();
        System.out.println("name :"+mymovie.title);
        System.out.println("genre :"+mymovie.genre);
        System.out.println("rating :"+mymovie.rating);
    }
}
