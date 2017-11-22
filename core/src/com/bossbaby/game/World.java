package com.bossbaby.game;

public class World {
		private Maze maze;
	    Pacman pacman;
	    PacmanGame pacmanGame;
	    private int score;
	
	 
	    World(PacmanGame pacmanGame) {
	        this.pacmanGame = pacmanGame;
	        maze = new Maze();
	        pacman = new Pacman(60,60,this);
	        registerDotEattenListener();
	        score = 0;
	      
	    }
	    
	    private void registerDotEattenListener() {
	        pacman.registerDotEattenListener(new Pacman.DotEattenListener() {
	            @Override
	            public void notifyDotEatten() {
	                score += 1;
	            }
	        });
	    }
	    
	    public void increaseScore() {
	        score += 1;
	    }
	    
	    public int getScore() {
	        return score;
	    }
	    
	    Pacman getPacman() {
	        return pacman;
	    }
	    Maze getMaze() { //for worldrenderer
	        return maze;
	    }
	    
	    public void update(float delta) {
	        pacman.update();
	    }
	
}
