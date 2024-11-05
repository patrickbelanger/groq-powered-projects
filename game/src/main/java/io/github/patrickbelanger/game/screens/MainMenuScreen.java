package io.github.patrickbelanger.game.screens;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.gui.ImageComponent;
import de.gurkenlabs.litiengine.gui.ImageScaleMode;
import de.gurkenlabs.litiengine.gui.screens.Screen;
import de.gurkenlabs.litiengine.resources.Resources;

public class MainMenuScreen extends Screen {

    public MainMenuScreen() {
        super("mainmenu");
    }

    @Override
    public void prepare() {
        super.prepare();
        Game.audio().playMusic(Resources.sounds().get("game/sounds/main-menu.mp3"));
    }

    @Override
    protected void initializeComponents() {
        super.initializeComponents();
        ImageComponent background = new ImageComponent(0, 0, Resources.images().get("game/resources/ui/main-menu.png"));
        background.setDimension(Game.config().graphics().getResolutionWidth(), Game.config().graphics().getResolutionHeight());
        background.setImageScaleMode(ImageScaleMode.STRETCH);
        getComponents().add(background);
    }

}
