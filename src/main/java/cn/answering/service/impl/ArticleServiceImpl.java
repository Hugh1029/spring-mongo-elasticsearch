package cn.answering.service.impl;

import cn.answering.domain.Article;
import cn.answering.domain.es.EsArticle;
import cn.answering.repository.ArticleRepository;
import cn.answering.repository.es.EsArticleRepository;
import cn.answering.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HP on 2017/8/20.
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private EsArticleRepository esArticleRepository;

    @Transactional
    @Override
    public Article saveOrUpdateArticle(Article article) {
        Article returnValue = articleRepository.save(article);
        esArticleRepository.save(new EsArticle(article));
        return  returnValue;
    }

    @Transactional
    @Override
    public void deleteArticle(String id) {
        articleRepository.delete(id);
        esArticleRepository.deleteEsArticleByArticleId(id);
    }

    @Override
    public Article findArticleById(String id) {
        return articleRepository.findOne(id);
    }
}
