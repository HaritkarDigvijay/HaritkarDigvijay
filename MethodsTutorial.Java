package _20220525;

public class MethodsTutorial {

	
	public static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName +" managed to get into position " + playerPosition + " on the high score table");
	}
	
	public static int calculateHighScoreposition(int playerScore) {
		
		if(playerScore >= 1000)
			return 1;
		else if((playerScore >= 500) && (playerScore < 1000))
			return 2;
		else if((playerScore >= 100) && (playerScore < 500))
			return 3;
		else
			return 4;
	}
	
	public static void main(String[] args) {
		String playerName = "Digvijay";
		
		displayHighScorePosition(playerName, calculateHighScoreposition(1000));
		displayHighScorePosition(playerName, calculateHighScoreposition(500));
		displayHighScorePosition(playerName, calculateHighScoreposition(100));
		displayHighScorePosition(playerName, calculateHighScoreposition(50));
	}
}
