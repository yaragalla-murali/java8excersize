package bhgame.cells;

import java.math.BigDecimal;
import java.util.Optional;

import bhgame.Player;

public class HotelCell implements Cell {
	
	private final BigDecimal worth=new BigDecimal(200);
	private final BigDecimal tenantPenality=new BigDecimal(50);
	private String owner;

	@Override
	public void applyRules(Player player) {
		Optional<Player> optPlayer=Optional.ofNullable(player);
		if(optPlayer.isPresent()) {
			Optional<String> optOwner=Optional.ofNullable(owner);
			if(!optOwner.isPresent() ) {
				if(canPurchaseHotel(player)) {
					BigDecimal finalAmt=player.getCurrentAmount().subtract(worth);
					player.setCurrentAmount(finalAmt);
					this.owner=player.getName();
				}
			}else {
				BigDecimal finalAmt=player.getCurrentAmount().subtract(tenantPenality);
				player.setCurrentAmount(finalAmt);
			}
		}

	}
	
	private Boolean canPurchaseHotel(Player currentPlayer) {
		int purchaseFlag=currentPlayer.getCurrentAmount().compareTo(worth);
		if(purchaseFlag>=0)
			return true;
		return false;
	}

}
