package com.healthcare.lab.hapistarter;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HapiFhirOpenEmrApplicationTests {

    @Test
    void contextLoads() {
        Logger logger = new Logger();

        logger.fine("Hello World");
    }

}
