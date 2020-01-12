package au.com.avantsystems.batchconfigmanager.infrastructure.filters;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Slf4j
@Order(1)
@Configuration
public class RegistrationFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    log.info("Loaded {}", filterConfig.getFilterName());
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    System.out.println("RegistrationFilter destroyed...");
  }
}
