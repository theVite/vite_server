package com.vite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Class that holds the implementation of the Service interface
 */
public class ViteHandler implements Service.Iface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViteHandler.class);

    @Override
    public void ping() {
        LOGGER.debug("Server Pinged...");
    }
}
