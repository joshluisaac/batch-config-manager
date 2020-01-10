package au.com.avantsystems.batchconfigmanager.activities;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {

  @GetMapping("/login")
  public String renderLogin(HttpServletRequest request) {
    System.out.println("Got here to login...");
    return "authentication/login";
  }

  @GetMapping("/register")
  public String renderRegister(HttpServletRequest request) {
    System.out.println("Got here to register");
    return "authentication/register";
  }

  @PostMapping("/login")
  public String submitLogin() {
    System.out.println("Got here.....");
    return "loginForm";
  }

  @GetMapping({"/home", "/index", "/"})
  @ResponseBody
  public String renderHome() {
    System.out.println("Render home");
    return "Home,index and ...: not authenticated";
  }

  @GetMapping("/multiform")
  public String renderMultiform(HttpServletRequest request) {
    System.out.println("multiform.....");
    return "multiform";
  }
}
