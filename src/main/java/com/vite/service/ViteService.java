package com.vite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Class that holds the implementation of the Service interface
 */
@Component
public class ViteService implements Service.Iface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViteService.class);
    
    @Override
    public void ping() {
	LOGGER.debug("Server Pinged");
    }
}
