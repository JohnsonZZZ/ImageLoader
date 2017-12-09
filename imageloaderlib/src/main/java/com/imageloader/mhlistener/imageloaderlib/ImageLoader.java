package com.imageloader.mhlistener.imageloaderlib;

import android.net.Uri;
import android.view.View;

import java.io.File;

/**
 * 图片加载类
 * 策略或者静态代理模式，开发者只需要关心ImageLoader + LoaderOptions
 * Created by JohnsonFan on 2017/6/27.
 */

public class ImageLoader implements ILoaderStrategy {
	private static ILoaderStrategy sLoader;
	private static volatile ImageLoader sInstance;

	private ImageLoader() {

	}

	//单例模式
	public static ImageLoader getInstance() {
		if (sInstance == null) {
			synchronized (ImageLoader.class) {
				if (sInstance == null) {
					//若切换其它图片加载框架，可以实现一键替换
					sInstance = new ImageLoader();
				}
			}
		}
		return sInstance;
	}

	//提供实时替换图片加载框架的接口
	public static void setImageLoader(ILoaderStrategy loader) {
		if (loader != null) {
			sLoader = loader;
		}
	}

	@Override
	public void loadImage(View view, String path, LoaderOptions options) {
		sLoader.loadImage(view, path, options);
	}

	@Override
	public void loadImage(View view, int drawable, LoaderOptions options) {
		sLoader.loadImage(view, drawable, options);
	}

	@Override
	public void loadImage(View view, File file, LoaderOptions options) {
		sLoader.loadImage(view, file, options);
	}

	@Override
	public void loadImage(View view, Uri uri, LoaderOptions options) {
		sLoader.loadImage(view, uri, options);
	}

	@Override
	public void saveImage(String url, File destFile, Callback callback) {
		sLoader.saveImage(url, destFile, callback);
	}

	@Override
	public void clearMemoryCache() {
		sLoader.clearMemoryCache();
	}

	@Override
	public void clearDiskCache() {
		sLoader.clearDiskCache();
	}
}
