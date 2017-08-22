package cn.answering.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by HP on 2017/8/20.
 */

@Document
public class Tag {

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected Tag(){}

    public Tag(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("this tag name is %s",name);
    }
}
