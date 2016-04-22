package it.polito.tdp.sudoku.model;

public class Level {
	
	private int levelNumber;
	private String levelName;
	
	public Level(int levelNumber, String levelName) {
		this.levelNumber = levelNumber;
		this.levelName = levelName;
	}

	public int getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Override
	public String toString() {
		return levelName;
	}
	
	
}
