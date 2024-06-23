package model;

public class Score {
	private int scoreX;
	private int scoreO;
	private int drawCount;
	
	private static final Score instance = new Score();
	
	private Score() {
		clearScore();
	}
	
	public static Score getInstance() {
		return instance;
	}

	public int getScoreX() {
		return scoreX;
	}

	public void setScoreX(int scoreX) {
		this.scoreX = scoreX;
	}

	public int getScoreO() {
		return scoreO;
	}

	public void setScoreO(int scoreO) {
		this.scoreO = scoreO;
	}

	public int getDrawCount() {
		return drawCount;
	}

	public void setDrawCount(int drawCount) {
		this.drawCount = drawCount;
	}
	
	public void incrementScoreX() {
		scoreX++;
	}
	
	public void incrementScoreO() {
		scoreO++;
	}
	
	public void incrementDrawCount() {
		drawCount++;
	}
	
	public void clearScore() {
		scoreX = 0;
		scoreO = 0;
		drawCount = 0;
	}
}
