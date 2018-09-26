package net.alcuria.bulls.app;

import com.badlogic.gdx.Game;
import net.alcuria.bulls.screens.main.MainScreen;

public class MatadorGame extends Game {
    private MainScreen mainScreen;

    @Override
    public void create() {
        mainScreen = new MainScreen();
        setScreen(mainScreen);
    }

    @Override
    public void dispose() {
        super.dispose();
        if (mainScreen != null) {
            mainScreen.dispose();
        }
    }
}
