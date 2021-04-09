package com.example.demo01mybatisplus.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RepetitionAttach {
    private static final Logger logger = LoggerFactory.getLogger(RepetitionAttach.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        while (true){
            String urlStr = "http://www.guizhou.gov.cn/fsp-web/fsp/netVein.do?method=receive";
            URL url = new URL(urlStr);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            logger.info("response:{}",httpURLConnection.getResponseCode());
            //TimeUnit.SECONDS.sleep(1);
        }
    }

}
