package com.rustedbrain.study.gatewayservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest(webEnvironment =
        SpringBootTest.WebEnvironment.MOCK,
        classes = GatewayServiceApplication.class)
@Profile("test")
public class GatewayServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

}
