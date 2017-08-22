package cn.answering.repository;

import cn.answering.domain.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by HP on 2017/8/20.
 */
public interface TagRepository extends MongoRepository<Tag,String>{

}
