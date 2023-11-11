package nvc.it.ikkyu.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Company {
    
    @GetMapping("/employee")
    @ResponseBody
    public String employee (){
        return "<h1>Employee<h1/>";
    }

    @GetMapping("/employee/{id}")
    @ResponseBody
    public String employee (@PathVariable int id){
        return "<h1>Employee ID : " + id;
    }

    @GetMapping("/employee/name/{name}")
    @ResponseBody
    public String employee (@PathVariable String name){
        return "<h1>Employee Name : " + name;
    }

    @GetMapping("/employee/department/{department}")
    @ResponseBody
    public String department (@PathVariable String department){
        return "<h1>Employee in : " + department;
    }

    @PostMapping("/employee")
    @ResponseBody
    public String CreateEmployee (@RequestBody String name){
        return "<h1>Create Employee " + name;
    }
}
