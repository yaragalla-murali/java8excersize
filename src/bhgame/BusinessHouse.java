package bhgame;

import java.util.Arrays;
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
		
		int[] diceoutput= {4,4,4,6,7,8,5,11,10,12,2,3,5,
				6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12};
		
		int flag=0; int set=0;
		
		for(int i=0; i<diceoutput.length;i++) {
			flag=flag+1;
			if(flag==1) {
				int currPositionOnGrid=player1.getCurrentPosition()+diceoutput[i];
				player1.setCurrentPosition(currPositionOnGrid);
				Cell cell=bhg.getCells().get(currPositionOnGrid);
				cell.applyRules(player1);
				System.out.println("player Name : "+player1.getName());				
			}
			
			if(flag==2) {
				int currPositionOnGrid=player2.getCurrentPosition()+diceoutput[i];
				player2.setCurrentPosition(currPositionOnGrid);
				Cell cell=bhg.getCells().get(currPositionOnGrid);
				cell.applyRules(player2);
				System.out.println("player Name : "+player2.getName());				
			}
			
			if(flag==3) {
				int currPositionOnGrid=player3.getCurrentPosition()+diceoutput[i];
				player3.setCurrentPosition(currPositionOnGrid);
				Cell cell=bhg.getCells().get(currPositionOnGrid);
				cell.applyRules(player3);
				System.out.println("player Name : "+player3.getName());				
			}
			
			
			if(flag/3==0) {
				flag=0;
				set=set+1;
			}
			
			System.out.println("Total sets played : "+set);
			
			List<Player> players=Arrays.asList(player1,player2,player3);
			Comparator<Player> comprtr=(a,b) -> a.getCurrentAmount().compareTo(b.getCurrentAmount());
			players.stream().sorted(comprtr.reversed()).forEach(
					System.out::println
					
					);
			
			
		}
	}

}
