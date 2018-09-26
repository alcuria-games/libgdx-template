package net.alcuria.bulls.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import net.alcuria.bulls.app.MatadorGame;

public class DesktopLauncher {
    public static void main(String[] args) {
        final Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

        config.setResizable(false);
        config.setWindowedMode(320, 480);

        new Lwjgl3Application(new MatadorGame(), config);
    }
}
