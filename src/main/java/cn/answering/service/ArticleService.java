package cn.answering.service;

import cn.answering.domain.Article;

/**
 * Created by HP on 2017/8/20.
 */
public interface ArticleService {

    /**
     * 保存文章
     * @return
     */
    public Article saveOrUpdateArticle(Article article);

    /**
     * 删除文章
     */
    public void deleteArticle(String id);

    /**
     * 根据id获取文章
     */
    public Article findArticleById(String id);
}
