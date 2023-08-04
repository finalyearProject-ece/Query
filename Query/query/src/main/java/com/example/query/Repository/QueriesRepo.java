package com.example.proj2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proj2.Model.Queries;

@Repository
public interface QueriesRepo extends JpaRepository<Queries,Long> {
    @Query("select q from Queries q")
    List<Queries> findAllData();

    @Query("select q from Queries q where q.active=:activeState and q.designation in :activedesi") 
    List<Queries> findData(@Param("activeState") String activeState, @Param("activedesi") List<String> activedesi);
    
}
