package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MarkSheet;

public interface MarkRepository extends JpaRepository<MarkSheet, Integer> {

}
