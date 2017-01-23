package com.vite.service;

import org.junit.Test;


public class ViteHandlerTest {
    /**
     * Tests the {@link ViteHandler#ping()} function
     */
    @Test
    public void testPing() {
        ViteHandler viteService = new ViteHandler();
        viteService.ping();
    }
}
