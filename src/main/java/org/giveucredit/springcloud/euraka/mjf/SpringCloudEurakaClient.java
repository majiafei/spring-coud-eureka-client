package org.giveucredit.springcloud.euraka.mjf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurakaClient {

	private static Logger logger = LoggerFactory.getLogger(SpringCloudEurakaClient.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurakaClient.class, args);
		logger.info("SpringCloudEurakaMain start success");
	}
	
}
