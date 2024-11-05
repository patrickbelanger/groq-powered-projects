package io.github.patrickbelanger.game;

import de.gurkenlabs.litiengine.Game;
import io.github.patrickbelanger.game.screens.MainMenuScreen;

public class GameRuntime {
    public static void main(String[] args) {
        Game.info().setName("Echoes of the Ancient Kingdom");
        Game.info().setSubTitle("A medieval AI powered game (Powered by Groq)");
        Game.info().setCompany("");
        Game.info().setDescription("An AI powered game");
        Game.info().setVersion("1.0.0");

        Game.init(args);

        Game.screens().add(new MainMenuScreen());
        Game.screens().display("mainmenu");

        Game.start();
    }
}
