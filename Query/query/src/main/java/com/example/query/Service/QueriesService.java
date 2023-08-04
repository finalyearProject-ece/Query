package com.example.proj2.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj2.Model.Queries;
import com.example.proj2.Repository.QueriesRepo;

@Service
public class QueriesService {
    @Autowired
    QueriesRepo queriesRepo;

    public void saved(Queries queries) {
        Queries queries2 = new Queries();
        queries2.setAge(queries.getAge());
        queries2.setActive(queries.getActive());
        queries2.setDesignation(queries.getDesignation());
        queries2.setName(queries.getName());
        queriesRepo.save(queries2);
    }

    public List<Queries> get() {
        List<Queries> list = queriesRepo.findAllData();
        return list;
    }
    public List<Queries> getall(String activeState, List<String> activedesi) {
        List<Queries> list = queriesRepo.findData(activeState, activedesi);
        return list;
    }

    
}
