package au.com.avantsystems.batchconfigmanager.infrastructure.filters;

import java.io.IOException;
import javax.servlet.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Order(1)
@Configuration
public class RegistrationFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    System.out.println("Reg filter start");
    chain.doFilter(request, response);
    System.out.println("Reg filter end");
  }

  @Override
  public void destroy() {}
}
