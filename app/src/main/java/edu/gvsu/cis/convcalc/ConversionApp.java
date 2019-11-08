package edu.gvsu.cis.convcalc;

import android.app.Application;

import net.danlew.android.joda.JodaTimeAndroid;
import edu.gvsu.cis.convcalc.dummy.HistoryContent;

public class ConversionApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        JodaTimeAndroid.init(this);
        HistoryContent.HistoryItem.init();
    }
}
