package com.example.hwday03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Exercise_02 {
    ArrayList arr = new ArrayList();

    @GetMapping("/names")
    public ArrayList allNames(){
        return arr;
    }
    @PostMapping("/name")
    public String postName(@RequestBody String name){
        arr.add(name);
        return "name added";
    }
    @PutMapping("/name/{name}")
    public String updateName(@RequestBody int index,@PathVariable String name){
        arr.set(index,name);
        return "name Updated :)";
    }
    @DeleteMapping("/name/{index}")
    public String deleteName(@PathVariable int index){
        arr.remove(index);
        return "name deleted";
    }
}
