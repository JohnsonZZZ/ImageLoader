package com.imageloader.mhlistener.imageloadersimple;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.imageloader.mhlistener.imageloaderlib.ImageLoader;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//使用方式
		ImageView imageView = findViewById(R.id.imageview);
		String url = "http://ww2.sinaimg.cn/large/7a8aed7bgw1eutsd0pgiwj20go0p0djn.jpg";
		ImageLoader.getInstance()
				.load(url)
				.angle(80)
				.resize(400, 600)
				.centerCrop()
				.config(Bitmap.Config.RGB_565)
				.placeholder(R.mipmap.test)
				.error(R.mipmap.test)
				.skipLocalCache(true)
				.into(imageView);

	}
}
