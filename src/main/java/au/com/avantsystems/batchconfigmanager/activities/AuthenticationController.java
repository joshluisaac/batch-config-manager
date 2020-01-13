package au.com.avantsystems.batchconfigmanager.activities;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

  @GetMapping("/login")
  public String renderLogin(HttpServletRequest request) {
    System.out.println("Got here to login...");
    return "authentication/login/Login";
  }

  @GetMapping("/register")
  public String renderRegister(HttpServletRequest request) {
    System.out.println("Got here to register");
    return "authentication/registration/Registration";
  }
}
