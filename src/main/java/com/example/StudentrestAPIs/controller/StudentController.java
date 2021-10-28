package com.example.StudentrestAPIs.controller;

import com.example.StudentrestAPIs.model.Student;
import com.example.StudentrestAPIs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//y

//@CrossOrigin("*") ie. our requests can come from any place
@RestController  //ie. to make this class a controller
@RequestMapping("/student")
public class StudentController {

    //bringing information from service and bringing it into a controller. This is called auto wiring
    @Autowired
    private StudentService studentService;

    @GetMapping("/name")
    public String hello(){
        return "Hello Jesutofunmi, you have done well";
    }

    @GetMapping("food")
    public String food(){
        return "Jesutofunmi loves Eba";
    }
    //we wanna get things from the sevice //this is what will be seen on the webpage. We dont write our logic here so that it would not be seen on our webpage
    @GetMapping("/males") //because we are getting it from our database
    public List<Student> getMalesList(){
        return studentService.getMales();
    }

    @GetMapping("/females") //because we are getting it from our database
    public List<Student> getFemalesList(){
        return studentService.getFemales();
    }

}
