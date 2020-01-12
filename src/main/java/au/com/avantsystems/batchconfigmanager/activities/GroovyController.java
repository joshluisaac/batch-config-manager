package au.com.avantsystems.batchconfigmanager.activities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GroovyController {


    @GetMapping("/groovy")
    public ModelAndView handleRequest(Model model) {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "A message from the controller");
        map.put("time", LocalTime.now());
        return new ModelAndView("layouts/layout-main", map);
    }

}
