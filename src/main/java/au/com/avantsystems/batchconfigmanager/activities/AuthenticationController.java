package au.com.avantsystems.batchconfigmanager.activities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

  @GetMapping("/login")
  public String renderLogin() {
    System.out.println("Got here to login...");
    return "authentication/login/Login";
  }

  @GetMapping("/register")
  public String renderRegister() {
    System.out.println("Got here to register");
    return "authentication/registration/Registration";
  }

  @GetMapping("/forgotpassword")
  public String renderForgotPassword() {
    return "authentication/passwordrecovery/ForgotPassword";
  }

  @GetMapping("/passwordrecovery")
  public String renderPasswordRecovery() {
    return "authentication/passwordrecovery/RecoverPassword";
  }
}
