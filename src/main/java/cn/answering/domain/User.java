package cn.answering.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by HP on 2017/8/20.
 */

@Document
public class User {

    @Id
    private String id;

    private String name;

    private String username;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void encodPassword(){
    }

    protected User(){}

    public User(String name,String username){
        this.name = name;
        this.username = username;
    }

    @Override
    public String toString(){
        return String.format("the user is name=%s,username=%s",name,username);
    }


}
