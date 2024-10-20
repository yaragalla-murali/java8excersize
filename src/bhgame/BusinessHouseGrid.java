package bhgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bhgame.cells.Cell;
import bhgame.cells.EmptyCell;
import bhgame.cells.HotelCell;
import bhgame.cells.JailCell;
import bhgame.cells.TreasureCell;

public class BusinessHouseGrid {

	private final List<Cell> cells;
	
	public BusinessHouseGrid() {
		this.cells=Arrays.asList(
				new EmptyCell(),
				new EmptyCell(),
				new JailCell(),
				new HotelCell(),
				new EmptyCell(),
				new TreasureCell(),
				new JailCell(),
				new TreasureCell(),
				new EmptyCell(),
				new EmptyCell(),
				new HotelCell(),
				new JailCell(),
				new TreasureCell(),
				new HotelCell(),
				new EmptyCell(),
				new EmptyCell(),
				new JailCell(),
				new HotelCell(),
				new EmptyCell(),
				new TreasureCell(),
				new JailCell(),
				new TreasureCell(),
				new EmptyCell(),
				new EmptyCell(),
				new HotelCell(),
				new JailCell(),
				new TreasureCell(),
				new HotelCell(),
				new JailCell(),
				new EmptyCell(),
				new EmptyCell(),
				new JailCell(),
				new HotelCell(),
				new EmptyCell(),
				new TreasureCell(),
				new JailCell(),
				new TreasureCell(),
				new EmptyCell(),
				new EmptyCell(),
				new HotelCell(),
				new JailCell(),
				new TreasureCell(),
				new EmptyCell(),
				new HotelCell(),
				new EmptyCell()
				
				);
	}

	public List<Cell> getCells() {
		return cells;
	}

	
}
