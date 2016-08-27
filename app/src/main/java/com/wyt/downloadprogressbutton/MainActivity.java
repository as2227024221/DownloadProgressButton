package com.wyt.downloadprogressbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private DownloadProgressButton downloadProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadProgressButton = (DownloadProgressButton) findViewById(R.id.download);

        downloadProgressButton.setCurrentText("下载");
        downloadProgressButton.setMaxProgress(100);

        downloadProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (downloadProgressButton.getCurrentText().equals("继续下载") ||
                                downloadProgressButton.getCurrentText().equals("下载")) {
                    downloadProgressButton.setProgress(50);
                    downloadProgressButton.setState(DownloadProgressButton.DOWNLOADING);
                    downloadProgressButton.setProgressText("下载中:", 50);
                } else {
                    downloadProgressButton.setCurrentText("继续下载");
                }

            }
        });

    }
}
