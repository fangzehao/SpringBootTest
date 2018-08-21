package hello.service;

import hello.Application;
import hello.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserById(){
        Long userId = 1L;
        User userById = userService.findUserById(userId);
        Assert.assertThat(userById.getUsername(), is("fangzehao"));
    }
}
