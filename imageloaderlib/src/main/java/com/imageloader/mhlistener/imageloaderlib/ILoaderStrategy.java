package com.imageloader.mhlistener.imageloaderlib;

/**
 * Created by JohnsonFan on 2017/6/9.
 */

public interface ILoaderStrategy {

	void loadImage(LoaderOptions options);

	/**
	 * 清理内存缓存
	 */
	void clearMemoryCache();

	/**
	 * 清理磁盘缓存
	 */
	void clearDiskCache();

}
