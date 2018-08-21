package hello.service;

import hello.entity.User;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
public interface UserService {
    User findUserById(Long userId);
}
