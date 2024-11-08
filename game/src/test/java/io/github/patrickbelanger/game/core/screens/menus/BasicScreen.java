package io.github.patrickbelanger.game.core.screens.menus;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import io.github.patrickbelanger.game.core.utils.MouseUtils;

public abstract class BasicScreen implements Screen {
    protected Game game;
    protected MouseUtils mouseUtils;

    public BasicScreen(Game game) {
        this.game = game;
        this.mouseUtils = new MouseUtils();
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
