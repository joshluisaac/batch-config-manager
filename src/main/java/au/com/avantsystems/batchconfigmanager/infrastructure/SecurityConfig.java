package au.com.avantsystems.batchconfigmanager.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    requestPermitAllConfig(http);
    requestAuthorizationConfig(http);
    // http.httpBasic();
    loginLogoutConfig(http);
    log.info("Loaded security configuration");
  }


  private void requestPermitAllConfig(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/dist/**", "/plugins/**")
        .permitAll();
  }

  private void requestAuthorizationConfig(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1");
    http.authorizeRequests().antMatchers("/api/public/test2").hasAuthority("ACCESS_TEST2");
    http.authorizeRequests().anyRequest().hasRole("USER");
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

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("joshua@email.com")
            .password(bCryptPasswordEncoder().encode("password"))
            .roles("USER")
            .and()
            .withUser("admin@email.com")
            .password(bCryptPasswordEncoder().encode("password"))
            .roles("ADMIN")
            .and()
            .withUser("manager@email.com")
            .password(bCryptPasswordEncoder().encode("password"))
            .roles("MANAGER");
  }

  @Bean
  public PasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
