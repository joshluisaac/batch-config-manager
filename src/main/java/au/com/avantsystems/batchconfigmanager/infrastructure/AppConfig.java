package au.com.avantsystems.batchconfigmanager.infrastructure;

import au.com.avantsystems.batchconfigmanager.infrastructure.filters.CustomRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class AppConfig {

  public FilterRegistrationBean<CustomRequestFilter> filterRegistrationBean() {
    FilterRegistrationBean<CustomRequestFilter> registrationBean = new FilterRegistrationBean<>();
    // registrationBean.get

    return null;
  }
}
