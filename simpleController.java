package itd.newbee.mall.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class simpleController {

    @GetMapping("/simple")
    public String simple(ModelMap map) {
        map.put("thymeleafText", "juejin");
        map.put("number1", 2019);
        map.put("number2", 3);
        return "simple";
    }
}
