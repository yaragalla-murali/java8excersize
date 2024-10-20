package bhgame;

import java.math.BigDecimal;

public class Player {
	
	private String name;
	
	public Player(String name) {
		this.name=name;
	}

	
	private BigDecimal currentAmount=new BigDecimal(1000);
	private Integer currentPosition=0;
	
	
	public BigDecimal getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(BigDecimal currentAmount) {
		this.currentAmount = currentAmount;
	}
	public Integer getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Integer currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", currentAmount=" + currentAmount + "]";
	}
	
	
	
}
