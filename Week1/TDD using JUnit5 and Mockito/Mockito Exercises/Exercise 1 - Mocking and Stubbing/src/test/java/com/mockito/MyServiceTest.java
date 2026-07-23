package com.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Pass mock object
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchData();

        // Verify output
        assertEquals("Mock Data", result);
    }
}