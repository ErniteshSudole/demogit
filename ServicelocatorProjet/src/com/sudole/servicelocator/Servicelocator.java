package com.sudole.servicelocator;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.sudole.cache.Cache;
import com.sudole.inter.MessagingService;

public class Servicelocator {
	
	private static Cache cache = new Cache();

    public static MessagingService getService(String serviceName) throws NamingException {

        MessagingService service = (MessagingService) cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        MessagingService service1 =(MessagingService)context.lookup(serviceName);
        return service1;
    }

}
