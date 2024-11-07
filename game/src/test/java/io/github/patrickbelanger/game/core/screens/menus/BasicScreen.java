package io.github.patrickbelanger.game.core.screens.menus;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public abstract class BasicScreen implements Screen {
    protected Game game;

    public BasicScreen(Game game) {
        this.game = game;
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
