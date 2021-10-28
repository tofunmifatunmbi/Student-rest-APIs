package com.example.StudentrestAPIs.service;

import com.example.StudentrestAPIs.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service //where you write your business logic
public class StudentService {

    //to create a list of student object
    //TODO: Hard coded this for testing will remove once connected to database
    List<Student> studentList = Arrays.asList(new Student("Jesutofunmi", "Female", 25),
            new Student("Sam", "Female", 21),
            new Student("Paul", "Male", 23),
            new Student("Opeoluwa", "Male", 20),
            new Student("Jane", "Female", 10));

    //to get student object
    public List<Student>  getMales(){

        List<Student> males =  studentList.stream()       //stream is an api that makes it easy to get stuff in a list
                .filter(student -> student               //to filter the list of students to return males only
                .getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());           //to collect my answer as a list
        return males;
    }

    public List<Student>  getFemales() {

        List<Student> females = studentList.stream()       //stream is an api that makes it easy to get stuff in a list
                .filter(student -> student               //to filter the list of students to return females only
                        .getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.toList());           //to collect my answer as a list
        return females;

    }

}
