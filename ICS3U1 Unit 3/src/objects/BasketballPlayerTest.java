package objects;

public class BasketballPlayerTest {

	public static void main(String[] args) {
		
		BasketballPlayer player1 = new BasketballPlayer("LeBron James", "Los Angeles Lakers", 6, 2.05, 39);
		BasketballPlayer player2 = new BasketballPlayer("Michael Jordan", "Chicago Bulls", 23, 2.03, 53);

		System.out.println(player1.toString());
		System.out.println(player2); // implicit call to toString()
		
		player1.setTeam("Toronto Raptors");
		System.out.println(player1.getTeam());
	}

}
