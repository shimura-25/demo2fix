package Form;

import java.util.List;

//Formはリクエストパラメータを受け取るところ

public class Ex17QuestionnaireForm {

    //htmlの入力画面で入力した内容のゲッターセッターを記述

    private String name;        //名前
    private String email;       //メールアドレス
    private String gender;      //性別
    private List<Integer> hobbyList;    //趣味
    private List<String> Lang;  //好きな言語


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
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getLang() {
        return Lang;
    }
    public void setLang(List<String> lang) {
        Lang = lang;
    }


}
