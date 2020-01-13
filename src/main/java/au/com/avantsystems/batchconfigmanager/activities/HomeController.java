package au.com.avantsystems.batchconfigmanager.activities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @GetMapping({"/index", "/", "/home"})
  public ModelAndView handleRequest(Model model) {
    Map<String, Object> map = new HashMap<>();
    map.put("msg", "A message from the controller");
    map.put("time", LocalTime.now());
    return new ModelAndView("home/home", map);
  }

  @GetMapping("index3")
  @ResponseBody
  public String index3(Model model) {
    return "Index 3......";
  }

  @GetMapping("/multiform")
  public String renderMultiform(HttpServletRequest request) {
    return "modalform/ModalMain";
  }

  @GetMapping("/groovyIndex")
  public String renderGroovyIndex(Model model) {
    model.addAttribute("message", "This is a groovy template");
    model.addAttribute("persons", persons);
    model.addAttribute("persons", persons);
    return "groovyIndex";
  }

  private static List<Person> persons = new ArrayList<>();

  static {
    persons.add(new Person("Bill", "Gates"));
    persons.add(new Person("Steve", "Jobs"));
  }
}
