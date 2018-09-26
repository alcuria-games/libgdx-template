package net.alcuria.bulls;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import net.alcuria.bulls.app.MatadorGame;

public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new MatadorGame(), config);
    }
}
