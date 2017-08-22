package cn.answering.repository;

import cn.answering.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by HP on 2017/8/20.
 */
public interface ArticleRepository extends MongoRepository<Article,String>{

}
