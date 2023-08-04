package com.example.proj2.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj2.Model.Queries;
import com.example.proj2.Service.QueriesService;

@RestController
public class QueriesController {
    @Autowired
    private QueriesService queriesService;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Queries queries){
        queriesService.saved(queries);
        return new ResponseEntity<>("saved", HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<?> get(){
        return new ResponseEntity<>( queriesService.get(), HttpStatus.OK);

    }

    @GetMapping("/show/{activeState}/{activedesi}")
    public List<Queries> gett(@PathVariable("activeState") String activeState, @PathVariable("activedesi") List<String> activeDesi) {
          
         return queriesService.getall(activeState, activeDesi);
    }
}
