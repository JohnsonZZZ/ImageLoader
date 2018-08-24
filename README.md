# ImageLoader
[![](https://jitpack.io/v/JohnsonZZZ/ImageLoader.svg)](https://jitpack.io/#JohnsonZZZ/ImageLoader)

[BlogLink](http://www.jianshu.com/p/09f2689499d0)

Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
    	...
        maven {		
            url 'https://jitpack.io'
        }
    }
}
```
Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.mhlistener:ImageLoader:<lastest.version>'
}
```
Step 3. Usage

```
//you can set custom loader in your application usually.
ImageLoader.getInstance().setGlobalImageLoader(new PicassoLoader());

//how to use
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
```
![](https://github.com/JohnsonZZZ/ImageLoader/raw/master/ScreenShot/326606564456037219.jpg)
