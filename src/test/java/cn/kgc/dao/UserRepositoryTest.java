package cn.kgc.dao;

import cn.kgc.App;
import cn.kgc.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    Logger logger=Logger.getLogger(UserRepositoryTest.class);
    @Autowired
    private UserRepository userRepository;
    @Test
    public void findAll(){
        List<User> users = userRepository.findAll();
        logger.info(users.toString());
    }


}