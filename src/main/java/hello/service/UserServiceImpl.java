package hello.service;

import hello.dao.UserDAO;
import hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserById(Long userId) {
        return userDAO.get(User.class, userId);
    }
}
