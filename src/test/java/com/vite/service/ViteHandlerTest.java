package com.vite.service;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class ViteHandlerTest {
    /**
     * Tests the {@link ViteHandler#ping()} function
     */
    @Test
    public void testPing() {
        ViteHandler viteService = new ViteHandler();
        String response = viteService.ping();
        String expected = "Server Response to ping at ";
        assertThat(response.contains(expected), is(true));
    }
}
