package com.imageloader.mhlistener.imageloadersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.imageloader.mhlistener.imageloaderlib.ImageLoader;
import com.imageloader.mhlistener.imageloaderlib.LoaderOptions;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imageView = findViewById(R.id.imageview);
		ImageLoader.getInstance().loadImage(imageView, R.mipmap.test, LoaderOptions.builder().resize(300, 200)
				.centerInside().build());
	}
}
