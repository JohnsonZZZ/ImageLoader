package com.imageloader.mhlistener.imageloaderlib;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

/**
 * Created by JohnsonFan on 2017/7/13.
 */

public class LoaderOptions {
	public int placeholderResId;
	public int errorResId;
	public boolean isCenterCrop;
	public boolean isCenterInside;
	public boolean skipLocalCache;
	public boolean skipNetCache;
	public Bitmap.Config config;
	public int targetWidth;
	public int targetHeight;
	public float bitmapAngle;
	public float degrees;
	public Drawable placeholder;
	private Builder builder;

	private LoaderOptions(){

	}

	private LoaderOptions(Builder builder) {
		this.builder = builder;
		this.placeholderResId = builder.placeholderResId;
		this.errorResId = builder.errorResId;
		this.isCenterCrop = builder.isCenterCrop;
		this.isCenterInside = builder.isCenterInside;
		this.config = builder.config;
		this.targetWidth = builder.targetWidth;
		this.targetHeight = builder.targetHeight;
		this.bitmapAngle = builder.bitmapAngle;
		this.skipLocalCache = builder.skipLocalCache;
		this.skipNetCache = builder.skipNetCache;
		this.degrees = builder.degrees;
		this.placeholder = builder.placeholder;
	}

	public static final class Builder {
		private int placeholderResId;
		private int errorResId;
		private boolean isCenterCrop;
		private boolean isCenterInside;
		private boolean skipLocalCache; //是否缓存到本地
		private boolean skipNetCache;
		private Bitmap.Config config = Bitmap.Config.RGB_565;
		private int targetWidth;
		private int targetHeight;
		private float bitmapAngle; //圆角角度
		private float degrees; //旋转角度.注意:picasso针对三星等本地图片，默认旋转回0度，即正常位置。此时不需要自己rotate
		protected Drawable placeholder;

		public Builder(){
		}

		public Builder placeholder(@DrawableRes int placeholderResId) {
			this.placeholderResId = placeholderResId;
			return this;
		}

		public Builder placeholder(Drawable placeholder) {
			this.placeholder = placeholder;
			return this;
		}

		public Builder error(@DrawableRes int errorResId) {
			this.errorResId = errorResId;
			return this;
		}

		public Builder centerCrop() {
			isCenterCrop = true;
			return this;
		}

		public Builder centerInside() {
			isCenterInside = true;
			return this;
		}

		public Builder config(Bitmap.Config config) {
			this.config = config;
			return this;
		}

		public Builder resize(int targetWidth, int targetHeight) {
			this.targetWidth = targetWidth;
			this.targetHeight = targetHeight;
			return this;
		}

		/**
		 * 圆角
		 * @param bitmapAngle   度数
		 * @return
		 */
		public Builder angle(float bitmapAngle) {
			this.bitmapAngle = bitmapAngle;
			return this;
		}

		public Builder skipLocalCache(boolean skipLocalCache) {
			this.skipLocalCache = skipLocalCache;
			return this;
		}

		public Builder skipNetCache(boolean skipNetCache) {
			this.skipNetCache = skipNetCache;
			return this;
		}

		public Builder rotate(float degrees) {
			this.degrees = degrees;
			return this;
		}

		public LoaderOptions build() {
			return new LoaderOptions(this);
		}
	}

}
