package demo2fix.demo2fix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/hogehoge")
public class Trytocreate {

    @RequestMapping("")
    public String piyo(){

        return "hogehoge";
    }

}
