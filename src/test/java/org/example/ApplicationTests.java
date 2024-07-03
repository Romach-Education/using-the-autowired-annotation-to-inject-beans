package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationTests {

    @Test
    @DisplayName("Checks that Application Context is created")
    public void checkApplicationContextCreated() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        assertNotNull(context);
    }
}
