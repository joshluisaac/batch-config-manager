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
    requestPermitAllConfig(http);
    requestAuthorizationConfig(http);
    loginLogoutConfig(http);

    // sessionFixationStrategy(http);
    // whenSessionCreatedStrategy(http);

    // check this
    // http.csrf();
    // http.cors();

    // logic(http);

    log.info("Loaded security configuration");
  }

  void logic(HttpSecurity http) throws Exception {
    http.csrf().disable();
    http.authorizeRequests()
        .antMatchers("/dist/**", "/plugins/**", "/", "/register", "/home", "/multiform")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .permitAll()
        .and()
        .logout()
        .permitAll();
  }

  private void requestPermitAllConfig(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/dist/**", "/plugins/**", "/", "/register", "/home", "/multiform")
        .permitAll();
  }

  private void requestAuthorizationConfig(HttpSecurity http) throws Exception {
    http.authorizeRequests().anyRequest().authenticated();
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
