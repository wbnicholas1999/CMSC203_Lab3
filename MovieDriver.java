import java.util.Scanner;

/**
 * 
 * @author William Nicholas
 *
 */

public class MovieDriver
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		
		char loop;
		
		do
		{
			System.out.print("Enter the title name of a movie: ");
			String film = keyboard.nextLine();
			movie.setTitle(film);
			System.out.print("Enter the rating of a movie: ");
			String MPAA = keyboard.nextLine();
			movie.setRating(MPAA);
			System.out.print("Enter the number of tickets sold: ");
			int tix = keyboard.nextInt();
			movie.setSoldTickets(tix);
			
			System.out.println(movie.toString());
			
			System.out.print("Want to test the program again? (Y or N) ");
			loop = keyboard.next().charAt(0);
			
			while (loop != 'Y' && loop != 'y' && loop != 'N' && loop != 'n')
			{
				System.out.print("You have to select Y or N, try again: ");
				loop = keyboard.next().charAt(0);
			}
			
			keyboard.nextLine();
			System.out.print("\n");
		} while (loop == 'Y' || loop == 'y');
		
		System.out.print("Thank you!");
	}
}
