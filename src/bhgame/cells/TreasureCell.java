package bhgame.cells;

import java.math.BigDecimal;
import java.util.Optional;

import bhgame.Player;

public class TreasureCell implements Cell {

	@Override
	public void applyRules(Player player) {
		Optional<Player> optPlayer=Optional.ofNullable(player);
		if(optPlayer.isPresent()) {
			BigDecimal finalAmount=player.getCurrentAmount().add(new BigDecimal(200));
			player.setCurrentAmount(finalAmount);
		}
		
		
	}

}
