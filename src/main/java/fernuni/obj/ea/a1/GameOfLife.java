package fernuni.obj.ea.a1;

public class GameOfLife {
	boolean[][] feld = { { false, false, false, false, false },
			{ false, false, true, false, false },
			{ false, false, true, false, false },
			{ false, false, true, false, false },
			{ false, false, false, false, false } };

	public static void main(String[] args) {
		GameOfLife myGame = new GameOfLife();
		
		//print start generation
		myGame.print();		
		
		for (int i = 0; i < 10; i++) {
			myGame.nextGeneration();
			myGame.print();
			System.out.println();
		}
	}

	void print() {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				if (feld[i][j] == true)
					System.out.print("o ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}

	void nextGeneration() {
		//kopiere Feld
		boolean[][] copyField = copyField();
		
		//Werte aus und setzte neue Generation ins Feld
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				
				int livingNeighbors = countLivingNeighbors(copyField, i, j);
				
				/**
				 * Eine lebende Zelle lebt auch in der Folgegeneration, wenn genau zwei oder drei der acht
  				 * benachbarten Zellen in der aktuellen Generation leben.
				 */				
				if (feld[i][j] && (livingNeighbors == 2 || livingNeighbors == 3)) {
					feld[i][j] = true;
				}
				
				/**
				 * Eine lebende Zelle stirbt in der Folgegeneration an Einsamkeit oder Überbevölkerung, wenn
				 * in der aktuellen Generation weniger als zwei oder mehr als drei der acht Nachbarzellen
				 * leben.
				 */
				if (feld[i][j] && (livingNeighbors < 2 || livingNeighbors > 3)) {
					feld[i][j] = false;
				}
				
				/**
				 * Eine tote Zelle wird in der Folgegeneration lebendig, wenn genau drei ihrer acht Nachbarn
				 * in der aktuellen Generation lebendig sind.
				 */
				if (feld[i][j] == false && (livingNeighbors == 3)) {
					feld[i][j] = true;
				}
			}
		}
	}
	
	private int countLivingNeighbors(boolean[][] copyField, int i, int j) {

		//Checke Nachbarn oberhalb
		int livingNeighbors = 0;
		if (i-1 > 0) {
			if (copyField[i-1][j]) {
				livingNeighbors++;
			}
			if (j-1 > 0 && copyField[i-1][j-1]) {
				livingNeighbors++;
			}
			if (j+1 < copyField[i-1].length && copyField[i-1][j+1]) {
				livingNeighbors++;
			}
		}
		
		//Checke Nachbarn unterhalb
		if (i+1 < copyField.length) {
			if (copyField[i+1][j]) {
				livingNeighbors++;
			}
			if (j-1 > 0 && copyField[i+1][j-1]) {
				livingNeighbors++;
			}
			if (j+1 < copyField[i+1].length && copyField[i+1][j+1]) {
				livingNeighbors++;
			}
		}
			
		//Checke Nachbarn rechts und links in der selben Zeile
		if (j-1 > 0) {
			if (copyField[i][j-1]) {
				livingNeighbors++;
			}
		}
		
		if (j+1 < copyField[i].length) {
			if (copyField[i][j+1]) {
				livingNeighbors++;
			}
		}
		
		return livingNeighbors;
	}

	boolean[][] copyField() {
		
		int rows = feld.length;
		int cols = feld[0].length;

		boolean[][] fieldCopy = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				fieldCopy[i][j] = feld[i][j];				
			}
		}
		
		return fieldCopy;
		
	}
}