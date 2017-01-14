package com.vite.service;

public class ViteService {
    /**
     * Tests the {@link ViteService#ping()} function
     */
    @Test
    public void testPing() {
        Service viteService = new ViteService();
        viteService.ping();
        assertThat(buffer, is(equalTo("ping")));
    }
}
