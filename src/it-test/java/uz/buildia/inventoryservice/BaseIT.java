package uz.buildia.inventoryservice;

import org.junit.jupiter.api.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;
import uz.buildia.inventoryservice.config.BaseITConfig;
import uz.buildia.inventoryservice.init.PostgresTestContainerInitializer;

@Tag("it")
@ActiveProfiles("it")
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = {
                BaseITConfig.class,
                InventoryServiceApplication.class
        }
)
@AutoConfigureWebTestClient(timeout = "PT30S")
@ContextConfiguration(initializers = PostgresTestContainerInitializer.class)
public abstract class BaseIT {

    @Autowired
    protected WebTestClient client;
}
