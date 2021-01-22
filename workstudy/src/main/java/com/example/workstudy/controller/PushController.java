package com.example.workstudy.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;

@RestController
public class PushController {

    @PostMapping("/detailData")
    public String receive(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        IOUtils.copy(request.getInputStream(),os);
        String data = URLDecoder.decode(os.toString("UTF-8"),"UTF-8");
        JSONObject json = JSONObject.parseObject(data);
        System.out.println(json.toJSONString());

        return "";
    }

}
