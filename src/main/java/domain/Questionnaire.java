package domain;

import java.util.List;

//domainはデータベースとやり取りする
//今回はデータベースを使用していないので取り合えず作るだけ
//なんの情報をDBに入れるか意識すること

public class Questionnaire {

    private int id;         // ID
    private String name;    //名前
    private String email;   //メールアドレス
    private String gender;  //性別
    private List<String> hobbyList;   //趣味


    private String language;    //コンピュータ言語

    //ゲッターセッター

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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<String> getHobby() {
        return hobbyList;
    }
    public void setHobby(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
