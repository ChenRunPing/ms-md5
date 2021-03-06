package com.qy.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * ms-md5 - com.qy.controller
 *
 * @author superChen
 * @create 2017-03-29 10:21
 */
@Log4j
@RestController
public class Md5Controller {

    @Value("${MD5Key}")
    private String MD5Key;

    private static String charSet = "utf-8";

    /**
     * 用于测试验证MD5加签的正确性,生成加密的秘钥
     * @param map
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/createMd5SignValue", method = RequestMethod.POST)
    public String createMd5SignValue(@RequestBody(required = false) Map map) throws IOException {
        log.info("传入的参数是："+map.toString());
        String signString = Md5EncodeUtil.createMD5Map(map,MD5Key,charSet);
        log.info("生成的加签秘钥是："+signString);
        return signString;

    }
}
