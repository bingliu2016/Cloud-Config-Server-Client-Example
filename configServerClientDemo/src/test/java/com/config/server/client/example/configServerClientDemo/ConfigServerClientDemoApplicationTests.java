package com.config.server.client.example.configServerClientDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.cloud.config.uri=http://dwrddev:8888")
class ConfigServerClientDemoApplicationTests {


  @Value("${tibco.jms.url}")
  private String configServerDefault;

  @Value("${position.btc.pdp-source}")
  private Integer configServerForThisApp;

  @Value("${btc.price.queue}")
  private String localApplication;

  @Test
  public void contextLoadsTest() {
    Assert.assertNotSame(configServerDefault, "");
    Assert.assertNotSame(configServerForThisApp, "");
    Assert.assertNotSame(localApplication, "");
  }
}
