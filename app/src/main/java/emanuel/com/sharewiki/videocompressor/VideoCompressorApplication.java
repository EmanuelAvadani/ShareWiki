package emanuel.com.sharewiki.videocompressor;/*
* By Jorge E. Hernandez (@lalongooo) 2015
* */

import android.app.Application;

import emanuel.com.sharewiki.videocompressor.file.FileUtils;

public class VideoCompressorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FileUtils.createApplicationFolder();
    }

}