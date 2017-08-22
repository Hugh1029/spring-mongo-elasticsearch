package cn.answering.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by HP on 2017/8/20.
 */

@Document
public class Article {

    @Id
    private String id;

    private String title;

    private String content;

    private User author;

    private List<Tag> tags; //标签

    private int readCount;

    private int likeIt;

    protected Article(){}

    public Article(String title,String content,User author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Article(String title,String content){
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString(){
        return String.format("the article is:[title=%s,content=%s]",title,content);
    }
}
