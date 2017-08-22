package cn.answering.repository;

import cn.answering.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by HP on 2017/8/20.
 */
public interface UserRepository extends MongoRepository<User,String>{

}
