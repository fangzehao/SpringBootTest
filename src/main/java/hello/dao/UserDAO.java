package hello.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
@Repository("userDao")
public class UserDAO {

    @Resource
    private EntityManager em;

    private EntityManager getEntityManager(){
        return em;
    }

    public <T> T get(Class<T> c, Serializable k) {
        if(Objects.isNull(k)) {
            return null;
        }
        return getEntityManager().find(c, k);
    }
}
