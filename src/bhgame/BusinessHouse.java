package bhgame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bhgame.cells.Cell;

public class BusinessHouse {
	
	
	
	

	public static void main(String[] args) {
		start();

	}
	
	
	
	private static void start() {
		BusinessHouseGrid bhg=new BusinessHouseGrid();
		
		Player player1=new Player("hari");
		Player player2=new Player("ram");
		Player player3=new Player("lakshman");
		
		List<Player> players=new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		
		int[] diceoutput= {4,4,4,6,7,8,5,11,10,12,2,3,5,
				6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12};
		
		int[] flag= {0};
		
		for(int i=0; i<10;i++) {
			System.out.println("Current set : "+(i+1));
			players.forEach(
					player -> {
						int counter=flag[0];
						int currPositionOnGrid=player.getCurrentPosition()+diceoutput[counter];
						int maxCellsInGrid=45;
						if(currPositionOnGrid >= maxCellsInGrid)
							currPositionOnGrid=currPositionOnGrid-maxCellsInGrid;
						player.setCurrentPosition(currPositionOnGrid);
						Cell cell=bhg.getCells().get(currPositionOnGrid);
						cell.applyRules(player);
						System.out.println("player Name : "+player.getName()
							+"  Current position : "+player.getCurrentPosition()
							+"  current balance : "+player.getCurrentAmount());
						flag[0]=flag[0]+1;
					}
				);			
			
		}
		
		
		  System.out.println("--------------------The final results are as below------------------------------------");
		  
		  
		  Comparator<Player> comprtr=(a,b) ->
		  a.getCurrentAmount().compareTo(b.getCurrentAmount());
		  players.stream().sorted(comprtr.reversed())
		  	.forEach( player -> {System.out.println(player.getName()
		  				+" has total worth of "
		  				+player.getCurrentAmount());});
		  
		  
		 
	}

}
