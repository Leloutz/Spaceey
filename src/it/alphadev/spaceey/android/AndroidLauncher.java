package it.alphadev.spaceey.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import it.alphadev.spaceey.Spaceey;

public class AndroidLauncher extends AndroidApplication {

    @Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Spaceey(), config);

       /* new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              //  Intent i = new Intent(AndroidLauncher.this, MainActivity.class);
                //startActivity(i);
                finish();
            }
        }, 3000);
        */
	}
}
