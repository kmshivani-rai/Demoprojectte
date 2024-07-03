package Javaproject.example.Newjava.controller;

import Javaproject.example.Newjava.Service.LoginServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController(value = "/rest")
public class RestCon {

    @Autowired
    private LoginServlet loginServlet;

    @PostMapping(value = "/saveData")
    public void save(@RequestParam Map<String,String> paramMap)
    {
      loginServlet.save(paramMap);
    }

}
