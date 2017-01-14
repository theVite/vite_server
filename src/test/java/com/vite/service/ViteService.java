package com.vite.service;

public class ViteServiceTest {
    /**
     * Tests the {@link ViteService#ping()} function
     */
    @Test
    public void testPing() {
        ViteService viteService = new ViteService();
        viteService.ping();
        assertThat(buffer, is(equalTo("ping")));
    }
}
