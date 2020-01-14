package au.com.avantsystems.batchconfigmanager;

import au.com.avantsystems.batchconfigmanager.infrastructure.event.CustomEventPublisher;
import javax.swing.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BatchConfigApp {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication();
    ConfigurableApplicationContext context = springApplication.run(BatchConfigApp.class);

    if (context.isRunning()) {
      // raise event if application is running
      context.getBean(CustomEventPublisher.class).publish();
    }

    if (context.isActive()) {
      System.out.println("App is active");
    }
  }
}
