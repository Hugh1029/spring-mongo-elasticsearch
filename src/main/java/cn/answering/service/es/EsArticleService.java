package cn.answering.service.es;

import cn.answering.domain.Tag;
import cn.answering.domain.User;
import cn.answering.domain.es.EsArticle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by HP on 2017/8/20.
 */
public interface EsArticleService {

    public EsArticle saveOrUpdate(EsArticle esArticle);

    public void delete(String id);

    public Page<EsArticle> queryArticle(String content, Pageable pageable);

    public Page<EsArticle> queryArticle(String title, String content, User author, List<Tag> tags, Pageable pageable);

    public void deleteByArticleId(String id);

    public Page<EsArticle> findAll(Pageable pageable);
}
