package SingletonDesign;

import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String[] args){
		
		
		Singleton newInstance = Singleton.getInstance();
		
		
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
		
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		
		Singleton instanceTwo = Singleton.getInstance();
		
		
		System.out.println("2nd Instance ID: " + System.identityHashCode(instanceTwo));
		
	
		
		System.out.println(instanceTwo.getLetterList());
		

		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("Player 2: " + playerTwoTiles);
		
	}
	
}