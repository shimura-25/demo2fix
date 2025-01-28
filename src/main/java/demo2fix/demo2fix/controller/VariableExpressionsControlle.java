package demo2fix.demo2fix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Car;

@Controller

@RequestMapping("/variable-expressions")

public class VariableExpressionsControlle {

    private Object bodyColor;
    
        @RequestMapping("")
        public String index(Model model){
            //プロパティ＝ ゲッターセッターを持たないStringオブジェクトをスコープに格納
            model.addAttribute("name", "伊達政宗");
    
            //speedプロパティが100のCarオブジェクトをスコープに格納
            Car car = new Car();    //インスタンス化
            car.setSpeed(100);
            model.addAttribute("car", car);
            //modelはコントローラを使ってスコープにキーと要素を格納する機能
    
            //追記：テキスト103ｐ
            car.setBodyColor("ブラック");
        return "variable-expressions";

    }
}
