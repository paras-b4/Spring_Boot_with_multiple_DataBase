package com.paras.MultipleDB;

import com.paras.MultipleDB.mysql.Entity.Student;
import com.paras.MultipleDB.mysql.Repository.repo;
import com.paras.MultipleDB.postgres.Entities.User;
import com.paras.MultipleDB.postgres.Repository.Postgresrepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultipleDbApplicationTests {

	@Autowired
	private Postgresrepo userRepo;
	@Autowired
	private repo repo;
	@Test
	public void contextLoads() {

	}

	@Test
	public void DBTest(){
		Student student=Student.builder().
				name("paras").rollNo("1").subject("java").city("Ghaziabad").build();
		User user= User.builder().name("Dev").age(19).subject("python").marks(90).phone(98684).build();

		userRepo.save(user);
		repo.save(student);
	}

}
