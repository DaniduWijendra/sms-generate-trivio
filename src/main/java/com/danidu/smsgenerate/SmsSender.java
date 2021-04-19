package com.danidu.smsgenerate;

public interface SmsSender {
    void sendSms(SmsRequest smsRequest);//switch provider without changing code.
}
