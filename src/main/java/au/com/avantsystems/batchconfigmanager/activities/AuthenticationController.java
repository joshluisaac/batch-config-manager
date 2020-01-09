package au.com.avantsystems.batchconfigmanager.activities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {

  @GetMapping("/login")
  public String renderLogin() {
    System.out.println("Got here.....");
    return "loginForm";
  }

  @PostMapping("/login")
  public String submitLogin() {
    System.out.println("Got here.....");
    return "loginForm";
  }

  @GetMapping({"/home", "/index", "/"})
  @ResponseBody
  public String home() {
    return "Home,index and ...: not authenticated";
  }
}
