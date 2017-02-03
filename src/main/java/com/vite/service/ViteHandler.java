package com.vite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * Class that holds the implementation of the Service interface
 */
public class ViteHandler implements Service.Iface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViteHandler.class);

    @Override
    public String ping() {
        LOGGER.debug("Server Pinged...");
        return "Server Response to ping at "+new Date();
    }
}
