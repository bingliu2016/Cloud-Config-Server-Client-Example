package com.client.example.configServerClient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ClientController {

  @Value("${tibco.jms.url}")
  private String tibcoJmsUrl;
//
  @Value("${btc.price.notification.sendTo}")
  private String btcPriceNotification;
  
  
  @GetMapping(value = "getTibcoJmsUrl")
  public String getTibcoJmsUrl(){
    
    return btcPriceNotification;
  }
}
