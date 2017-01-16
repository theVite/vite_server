package com.vite.service;

import org.junit.Test;


public class ViteServiceTest {
    /**
     * Tests the {@link ViteService#ping()} function
     */
    @Test
    public void testPing() {
        ViteService viteService = new ViteService();
        viteService.ping();
    }
}
