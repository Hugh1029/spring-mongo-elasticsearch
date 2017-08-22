package cn.answering.service;

import cn.answering.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by HP on 2017/8/20.
 */
public interface UserService {

    public User saveOrUpdata(User user);

    public void delete(String id);

    public User findUserById(String id);

    public Page<User> findUserByPage(Pageable pageable);

    public List<User> findAll();
}
