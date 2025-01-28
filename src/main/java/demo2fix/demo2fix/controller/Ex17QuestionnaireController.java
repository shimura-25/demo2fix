package demo2fix.demo2fix.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Form.Ex17QuestionnaireForm;
import domain.Questionnaire;

@Controller

@RequestMapping("/ex-17")
public class Ex17QuestionnaireController {

    /**
     * セレクトボタンに表示する内容を作成
     * リクエストパラメータの受け取り
     * 表示内容をスコープに入れる
     * リダイレクト
     */

     //配列の作成と入寮画面へ遷移
     @RequestMapping("")
     public String ex17(Model model){

        //マッピングする配列を作る（LinkedHashで順番も記憶）
        Map<Integer, String> hobbyMap = new LinkedHashMap<>();
        
        //配列に要素を格納する
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");
        hobbyMap.put(4, "バスケ");

        //好きな言語の選択
      List<String> languages = Arrays.asList("Java", "Python", "Cobol", "C++");
        model.addAttribute("languages", languages);


        //モデル＝スコープを補助してくれる機能を使って配列をスコープに保管する
        model.addAttribute("hobbyMap", hobbyMap);

        //画面遷移(パッケージの中にあるのでパッケージ名も記述する)
        return "ex17/ex-17-input";
     }

     //リクエストパラメータを取得する
     @RequestMapping("/create")
     public String create(Userform form, RedirectAttributes redirectAttributes){

      //ドメインとつなげる
      Questionnaire questionnaire = new Questionnaire();
      BeanUtils.copyProperties(form, questionnaire);
      //formはcreateメソッドの引数
      //引数（formオブジェクト)からドメイン（オブジェクト）にプロパティ値をコピー
      
      //アレイリストを用意
      List<String> hobbyList = new ArrayList<>();

      for(Integer hobbyCode : form.getHobbyList()){
         switch (hobbyCode) {
            case 1:
               hobbyList.add("野球");
               break;
            
            case 2:
               hobbyList.add("サッカー");
               break;

            case 3:
               hobbyList.add("テニス");
               break;
         }
      }

      //趣味リストをquestionnaireにセット
      questionnaire.setHobby(hobbyList);

     

      //言語リストの取得
      List<String> langList = new ArrayList<>();
      langList.add(Ex17QuestionnaireForm.getLang());

       //リダイレクト時に必要な情報を渡す
      redirectAttributes.addFlashAttribute("questionnaire", questionnaire);
      
      //完了画面へのリダイレクト
      return "redirect:/ex17/ex-17-toresult";
     }

     @RequestMapping("/ex-17-toresult")
     public String toresult(){
      //登録完了画面へフォワード
      return "ex17/ex-17-toresult";
     }



}
