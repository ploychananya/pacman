package com.bossbaby.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {
	private Maze maze;
    private SpriteBatch batch;
    private Texture wallImage;
    private Texture dotImage;
    World world;
 
    public MazeRenderer(SpriteBatch batch, Maze maze) {
        wallImage = new Texture("wall.png");
        dotImage = new Texture("dot.png");
        this.maze = maze;
        this.batch = batch;
      
  
    }
 
    public void render(float delta) {
    	//this.batch.begin();
        for(int r = 0; r < maze.getHeight(); r++) {
            for(int c = 0; c < maze.getWidth(); c++) {
                int x = c * WorldRenderer.BLOCK_SIZE;
                int y = PacmanGame.HEIGHT - (r * WorldRenderer.BLOCK_SIZE) - WorldRenderer.BLOCK_SIZE;
         
                if(maze.hasWallAt(r, c)) {
                    batch.draw(wallImage, x, y);
                } else if(maze.hasDotAt(r, c)) {
                    batch.draw(dotImage, x, y);
                }
              
            }
        }
       // this.batch.end();
    }
}
