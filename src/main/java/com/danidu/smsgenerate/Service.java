package com.danidu.smsgenerate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {

    private final SmsSender smsSender;


    @Autowired
    public Service(@Qualifier("twilio") TwilioSmsSender smsSender) {
        //by using qualifier we can change provider anytime without changing service
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest smsRequest)
    {
        smsSender.sendSms(smsRequest);
    }
}
