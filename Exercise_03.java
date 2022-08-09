package com.example.hwday03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Exercise_03 {
    ArrayList arr = new ArrayList();
    @GetMapping("/grade")
    public ArrayList getGrade(){
        return arr;
    }
    @PostMapping ("/grade")
    public String postGrade(int grade){
        arr.add(grade);
        return "your grade is added";
    }
    @PutMapping ("/grade")
    public String putGrade(int index , String grade){
        arr.set(index,grade);
        return "is it updated";
    }
    @DeleteMapping ("/grade")
    public String deleteGrade(int index){
        arr.remove(index);
        return "it is removed";
    }
}
