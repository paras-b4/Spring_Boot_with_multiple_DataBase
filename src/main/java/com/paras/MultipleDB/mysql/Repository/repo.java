package com.paras.MultipleDB.mysql.Repository;

import com.paras.MultipleDB.mysql.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<Student,Integer> {
}
