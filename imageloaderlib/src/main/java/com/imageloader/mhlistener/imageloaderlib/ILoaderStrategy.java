package com.imageloader.mhlistener.imageloaderlib;

import android.net.Uri;
import android.view.View;

import java.io.File;

/**
 * Created by JohnsonFan on 2017/6/9.
 */

public interface ILoaderStrategy {

	void loadImage(View view, String path, LoaderOptions options);

	void loadImage(View view, int drawable, LoaderOptions options);

	void loadImage(View view, File file, LoaderOptions options);

	void loadImage(View view, Uri uri, LoaderOptions options);

	/**
	 * 保存图片到本地相册
	 * @param url
	 * @param destFile
	 * @param callback
	 */
	void saveImage(String url, File destFile, Callback callback);

	/**
	 * 清理内存缓存
	 */
	void clearMemoryCache();

	/**
	 * 清理磁盘缓存
	 */
	void clearDiskCache();
}
