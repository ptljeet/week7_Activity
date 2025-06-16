package com.va.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student getStudent() {
        Student s = new Student();
        s.setStudentId(101);
        s.setFname("Alice");
        s.setLname("Johnson");
        s.setPhone("123-456-7890");
        s.setDob("2002-05-10");
        s.setStreet("Main St	");
        s.setCity("Toronto");
        s.setNumber("123");

        return s;
    }
}
