package bhgame.cells;

import java.math.BigDecimal;
import java.util.Optional;

import bhgame.Player;

public class JailCell implements Cell {
	
	private final BigDecimal penality=new BigDecimal(150);
	

	@Override
	public void applyRules(Player player) {
		Optional<Player> playerOpt=Optional.ofNullable(player);
		if(playerOpt.isPresent()) {		
			BigDecimal finalAmt=player.getCurrentAmount().subtract(penality);
			player.setCurrentAmount(finalAmt);
			
		}
		
	}

}