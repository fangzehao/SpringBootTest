package hello;

import hello.dao.UserRepository;
import hello.entity.User;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    /**
     * helloword.
     * @return 返回字符串
     */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    /**
     * 根据用户ID查询.
     * @param userId 用户ID
     * @return
     */
    @RequestMapping("findUserById")
    public User findUserById(@RequestParam(value = "userId", required = true)
                                 final Long userId) {
        User userById = userService.findUserById(userId);
        return userById;
    }

    /**
     * 查询所有用户.
     * @return 用户列表
     */
    @RequestMapping("findAllUser")
    public List<User> findAllUser() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
