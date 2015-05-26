public class Netflix {
	public static void main(String[] args) {
		
		NetflixQueue Queue1 = new NetflixQueue();
		Movie Anchorman2 = new Movie("Anchorman 2", 5);
		Queue1.addMovie(Anchorman2);
		Movie Anchorman = new Movie("Anchorman", 5);
		Queue1.addMovie(Anchorman);
		Movie HarryPotter = new Movie("HarryPotter 2", 4);
		Queue1.addMovie(HarryPotter);
		Movie Hobbit = new Movie("Hobbit", 3);
		Queue1.addMovie(Hobbit);
		Movie TheInterview = new Movie("TheInterview", 5);
		Queue1.addMovie(TheInterview);
		Queue1.printMovies();
		String AT = Anchorman2.getTitle();
		int AR = Anchorman2.getRating();
		String HT = HarryPotter.getTitle();
		int HR = HarryPotter.getRating();
		String HT2 = HarryPotter.getTitle();
		int HR2 = HarryPotter.getRating();
		String HT3 = Hobbit.getTitle();
		int HR3 = Hobbit.getRating();
		String IT = TheInterview.getTitle();
		int IR = TheInterview.getRating();
		System.out.println(HT + " " + HR + " Stars");
		System.out.println(AT + " " + AR + " Stars");
		System.out.println(HT2 + " " + HR2 + " Stars");
		System.out.println(IT + " " + IR + " Stars");
		System.out.println(HT3 + " " + HR3 + " Stars");
		Queue1.sortMoviesByRating();
		System.out.println(" The best movie is " + Queue1.getMovie(0));
		System.out.println("The second best movie is " + Queue1.getMovie(1));
	
		//System.out.println("The best movie is Anchorman 2, Anchorman, and TheInterview");
		//System.out.println("The second best movie is Harry Potter");
	}
}
