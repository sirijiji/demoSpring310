package com.example.demoSpring310;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

//@DataJpaTest
public class UsersRepositoryTest extends DemoSpring310TestcontainersTest{

    @Autowired
    private UsersRepository usersRepository;

    @Test
    void check(){
        List<Users> all = usersRepository.findAll();
        Assertions.assertTrue(all.isEmpty());
    }

}
