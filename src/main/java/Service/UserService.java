package Service;

import org.springframework.stereotype.Service;

import domain.User;

@Service

public class UserService {

    public User save(User user){
        //引数で受け取ったuser情報を
        //usersテーブルにインサート
        //hobbyテーブルにインサート
        //メール送信
        System.out.println("UserServiceのsaveが呼ばれました");
        return user;
    }

}
