package com.imageloader.mhlistener.imageloadersimple;

import android.app.Application;

/**
 * Created by JohnsonFan on 2017/12/9.
 */

public class App extends Application {

	public static App gApp;

	@Override
	public void onCreate() {
		super.onCreate();
		gApp = this;
	}
}
