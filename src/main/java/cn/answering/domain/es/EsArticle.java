package cn.answering.domain.es;

import cn.answering.domain.Article;
import cn.answering.domain.Tag;
import cn.answering.domain.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;

import java.io.Serializable;
import java.util.List;

/**
 * Created by HP on 2017/8/20.
 */

@Document(indexName = "article",type = "article")
public class EsArticle implements Serializable{
    private static final long serialVersionUID = -3442422877407279457L;


    @Id
    private String id;

    @Field
    private String articleId;

    private String title;

    private String content;

    private User author;

    private List<Tag> tags; //标签

    @Field(index = FieldIndex.not_analyzed)//不做全文检索
    private int readCount;

    @Field(index = FieldIndex.not_analyzed)
    private int likeIt;

    protected EsArticle(){}

    public EsArticle(String title,String content){
        this.content = content;
    }

    public EsArticle(String articleId,String title,String content,User author,List<Tag> tags,int readCount,int likeIt){
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = tags;
        this.readCount = readCount;
        this.likeIt = likeIt;
    }

    public EsArticle(Article article){
        this.articleId = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.author = article.getAuthor();
        this.tags = article.getTags();
        this.readCount = article.getReadCount();
        this.likeIt = article.getLikeIt();
    }

    public void update(Article article){
        this.articleId = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.author = article.getAuthor();
        this.tags = article.getTags();
        this.readCount = article.getReadCount();
        this.likeIt = article.getLikeIt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public int getLikeIt() {
        return likeIt;
    }

    public void setLikeIt(int likeIt) {
        this.likeIt = likeIt;
    }
}
