package com.imageloader.mhlistener.imageloaderlib;

/**
 * Created by JohnsonFan on 2017/12/9.
 */

public interface Callback {

	void onSuccess();

	void onError(Exception e);

	class EmptyCallback implements Callback {

		@Override public void onSuccess() {
		}

		@Override public void onError(Exception e) {

		}
	}

}