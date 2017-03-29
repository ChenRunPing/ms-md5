package com.qy;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ms-md5 - com.qy
 *
 * @author superChen
 * @create 2017-03-29 10:18
 */
@Log4j
@SpringBootApplication
public class Md5Application {

    public static void main(String[] args){
        SpringApplication.run(Md5Application.class,args);
        log.info("微服务启动成功！");
    }
}
