package com.sudole.emailservice;

import com.sudole.inter.MessagingService;

public class EmailServivce implements MessagingService{
	public String getMessageBody() {
        return "email message";
    }

    public String getServiceName() {
        return "EmailService";
    }
}



