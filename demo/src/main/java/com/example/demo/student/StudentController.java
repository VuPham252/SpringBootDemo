package com.example.demo.student;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController 
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/hello")
		public String hello(){
      return "hello from student";
    }
}
