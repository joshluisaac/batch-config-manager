package au.com.avantsystems.batchconfigmanager.activities;

import au.com.avantsystems.batchconfigmanager.infrastructure.HttpSessionConfig;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CreateBatchConfigController {

  private HttpSessionConfig sessionConfig;

  @Autowired
  public CreateBatchConfigController(HttpSessionConfig sessionConfig) {
    this.sessionConfig = sessionConfig;
  }

  @GetMapping("/view")
  @ResponseBody
  public String createBatchConfig(HttpServletRequest request) {
    System.out.println("SessionId: " + request.getSession().getId());
    return "Hello...world";
  }

  @PreAuthorize("")
  @GetMapping("sessions")
  public void printSessions() {
    sessionConfig.getActiveSessions().forEach(entry -> System.out.println(entry.getId()));
  }
}
