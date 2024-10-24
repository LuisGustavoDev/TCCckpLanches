package com.fiec.ckplanches.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiec.ckplanches.model.Log.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer>{

    
}