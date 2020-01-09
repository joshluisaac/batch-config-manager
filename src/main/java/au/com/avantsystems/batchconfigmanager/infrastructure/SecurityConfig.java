package au.com.avantsystems.batchconfigmanager.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Slf4j
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    requestAuthorizationConfig(http);
    loginLogoutConfig(http);

    // sessionFixationStrategy(http);
    // whenSessionCreatedStrategy(http);

    // check this
    // http.csrf();
    // http.cors();

    log.info("Loaded security....");
  }

  private void requestAuthorizationConfig(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/", "/home").permitAll().anyRequest().authenticated();
  }

  private void loginLogoutConfig(HttpSecurity http) throws Exception {
    http.formLogin().loginPage("/login").permitAll().and().logout().permitAll();
  }

  private void sessionFixationStrategy(HttpSecurity http) throws Exception {
    http.sessionManagement().sessionFixation().migrateSession();
  }

  private void whenSessionCreatedStrategy(HttpSecurity http) throws Exception {
    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
  }
}
