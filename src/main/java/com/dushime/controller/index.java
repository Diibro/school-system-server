package com.dushime.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class index {
     
     @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
     @ResponseBody
     public String greet(){
          return "index";
     }
}
