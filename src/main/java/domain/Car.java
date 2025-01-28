package domain;

public class Car {

    private int speed;
    private int gas;
    private String bodyColor;

    //プロパティ＝外部に公開する情報＝publicなもの＝ゲッターとセッター
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed <0){
            this.speed = 0;
        }else{
            this.speed = speed;
        }
    }

    public void run(){
        gas = gas -speed;
        speed = speed + 40;
        if(gas < 0 ){
            gas = 0;
        }
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    

}
