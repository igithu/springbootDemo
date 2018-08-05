package com.springboot.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alisen.asy on 2018/8/5.
 */
@RestController
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
    return "Hello Spring Boot!";
  }
}
