package com.zzr.oauth2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * ServiceAuthApplication
 *
 * @author zzr
 * @created Create Time: 2019/4/16
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAuthApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String str = passwordEncoder.encode("123456");
        logger.info("加密后"+str);
    }

}
