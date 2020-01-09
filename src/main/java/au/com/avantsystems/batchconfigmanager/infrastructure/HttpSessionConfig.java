package au.com.avantsystems.batchconfigmanager.infrastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class HttpSessionConfig {

  private final Map<String, HttpSession> sessions = new HashMap<>();

  public Collection<HttpSession> getActiveSessions() {
    return sessions.values();
  }

  @Bean
  public HttpSessionListener httpSessionListener() {
    HttpSessionListener listener =
        new HttpSessionListener() {
          @Override
          public void sessionCreated(HttpSessionEvent sessionEvent) {
            log.info("Added session: {}", sessionEvent.getSession().getId());
            sessions.put(sessionEvent.getSession().getId(), sessionEvent.getSession());
          }

          @Override
          public void sessionDestroyed(HttpSessionEvent sessionEvent) {
            sessions.remove(sessionEvent.getSession().getId());
            log.info("Removed session: {}", sessionEvent.getSession().getId());
          }
        };
    log.info("Loaded HTTP Session listener");
    return listener;
  }
}
