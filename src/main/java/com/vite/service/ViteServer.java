package com.vite.service;

import org.apache.thrift.TException;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Server created using thrift
 * TODO use secure version
 */
@Component
public class ViteServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViteHandler.class);

    @Autowired
    public ViteServer() {
        new Thread(() -> {
            LOGGER.debug("Creating Vite Server...");
            TServerTransport serverTransport;
            try {
                serverTransport = new TServerSocket(9090);
                ViteHandler handler = new ViteHandler();
                Service.Processor processor = new Service.Processor(handler);
                TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
                server.serve();
            } catch (TException ex) {
                LOGGER.debug("Couldn't create server socket", ex);
            }
        }).start();
    }
}
