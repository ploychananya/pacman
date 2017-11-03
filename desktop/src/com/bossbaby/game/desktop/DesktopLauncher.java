package com.bossbaby.game.desktop;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bossbaby.game.PacmanGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
        config.height = 600;
		new LwjglApplication(new PacmanGame(), config);
	}
}
public class GameScreen extends ScreenAdapter {
	 
	private PacmanGame pacmanGame;
	 
	public GameScreen(PacmanGame pacmanGame) {
	    this.pacmanGame = pacmanGame;
	}
}
