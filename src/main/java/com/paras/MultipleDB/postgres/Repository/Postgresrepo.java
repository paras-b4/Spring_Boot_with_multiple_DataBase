package com.paras.MultipleDB.postgres.Repository;


import com.paras.MultipleDB.postgres.Entities.User;
;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Postgresrepo extends JpaRepository<User,Integer> {
}
