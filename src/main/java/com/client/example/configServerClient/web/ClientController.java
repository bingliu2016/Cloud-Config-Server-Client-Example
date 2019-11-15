package com.client.example.configServerClient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


  @Value("${position.price.queue}")
  private String positionPriceQueue;
  
  @Value("${position.notification.sendTo}")
  private String positionNotificationSendTo;
  
  @RequestMapping("/showConfig")
  @ResponseBody
  public String getPositionPriceConfig(){
    
    String configInfo = "position Price Queue Name: " + positionPriceQueue //
        + "<br/>position notification sendTo =" + positionNotificationSendTo;

    return configInfo;
  }
}
