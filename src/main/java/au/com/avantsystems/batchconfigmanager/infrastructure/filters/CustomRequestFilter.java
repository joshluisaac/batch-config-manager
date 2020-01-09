package au.com.avantsystems.batchconfigmanager.infrastructure.filters;

import java.io.IOException;
import javax.servlet.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Order(1)
@Configuration
public class CustomRequestFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

    System.out.println("Filter name: " + filterConfig.getFilterName());
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    System.out.println("Ran filter....1");
    chain.doFilter(request, response);

    System.out.println("Ran filter....2");
  }

  @Override
  public void destroy() {
    System.out.println("Filter destroyed...");
  }
}
