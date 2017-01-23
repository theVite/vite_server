package com.vite.service;

import org.junit.Test;


public class ViteHandlerTest {
    /**
     * Tests the {@link ViteHandler#ping()} function
     * TODO add assertion about log statement, or better yet make ping return a String
     */
    @Test
    public void testPing() {
        ViteHandler viteService = new ViteHandler();
        viteService.ping();
    }
}
