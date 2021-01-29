package itd.newbee.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


public class ThymeleafController {

    @GetMapping("/thymeleaf")
    public String hello(HttpServletRequest request, @RequestParam(value = "description", required = false, defaultValue = "springboot-thymeleaf") String description) {
        request.setAttribute("description", description);
        return "thymeleaf";

    }
}
//required 这个参数是不是必须的
//defaultValue 如果本次请求没有携带这个参数，或者参数为空，那么就会启用默认值