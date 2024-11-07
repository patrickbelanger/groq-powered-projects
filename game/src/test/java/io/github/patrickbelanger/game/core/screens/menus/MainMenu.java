package io.github.patrickbelanger.game.core.screens.menus;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.GL20;
import io.github.patrickbelanger.game.core.GameAssetManager;

public class MainMenu extends BasicScreen {
    private GameAssetManager assetManager;
    private BitmapFont font;
    private TextureRegion mainMenuBackground;
    private TextureRegion mainMenuTitle;
    private SpriteBatch batch;

    public MainMenu(Game game) {
        super(game);
    }

    @Override
    public void show() {
        assetManager = new GameAssetManager();
        batch = new SpriteBatch();

        assetManager.loadFont("minecraft", "Minecraft.ttf", 16);
        assetManager.loadTexture("main-menu.png");
        assetManager.loadTexture("main-menu-title.png");
        assetManager.finishLoading();

        mainMenuBackground = new TextureRegion(assetManager.getTexture("main-menu.png"), 0, 0, 800, 600);
        mainMenuTitle = new TextureRegion(assetManager.getTexture("main-menu-title.png"), 0, 0, 800, 600);
        font = assetManager.getFont("minecraft");

        batch.getProjectionMatrix().setToOrtho2D(0, 0, 800, 600);
    }

    @Override
    public void render(float v) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(mainMenuBackground, 0, 0);
        batch.draw(mainMenuTitle, 0, 0);
        font.draw(batch, "Copyright (c) Patrick Belanger 2024. All rights reserved.", 190, 50);
        batch.end();
    }

    @Override
    public void hide() {
        Gdx.app.debug("EOTAK", "dispose main menu");
        batch.dispose();
        mainMenuBackground.getTexture().dispose();
        assetManager.dispose();
    }
}
