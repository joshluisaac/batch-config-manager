package au.com.avantsystems.batchconfigmanager.activities;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthenticationController {

  private static List<Person> persons = new ArrayList<>();

  static {
    persons.add(new Person("Bill", "Gates"));
    persons.add(new Person("Steve", "Jobs"));
  }

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

  /*  @PostMapping("/login")
  public String submitLogin() {
    System.out.println("Got here.....");
    return "loginForm";
  }*/

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


  @GetMapping("/groovyIndex")
  public String renderGroovyIndex(Model model) {
    model.addAttribute("message", "This is a groovy template");
    model.addAttribute("persons", persons);
    model.addAttribute("persons", persons);
    return "groovyIndex";
    //new ModelAndView()
  }



}
