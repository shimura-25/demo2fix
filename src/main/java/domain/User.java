package domain;

import java.util.List;

public class User {

    // ID
    private Integer id;

    // 名前
    private String name;

    //メールアドレス
    private String email;

    
    private List<String> hobbyList;


    
     //ゲッターセッター

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

   
    

}
