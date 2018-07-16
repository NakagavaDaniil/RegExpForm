package controller;

import model.Entity.UserEntity;
import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    UserEntity userEntity = new UserEntity();
    Service service=new Service();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }



    public void start(){
        Scanner scanner = new Scanner(System.in);


        //Enter data and save to entity

        //Name input
        view.printer(view.USER_NAME_INPUT);
        userEntity.setNAME(checkWithRegExp(RegExpSamples.NAME_REG_EXP,scanner));

        //Surname input
        view.printer(view.USER_SURNAME_INPUT);
        userEntity.setSURNAME(checkWithRegExp(RegExpSamples.NAME_REG_EXP,scanner));


        //Phone number input
        view.printer(view.USEER_PHONEN_INPUT);
        userEntity.setPHONENUMBER(checkWithRegExp(RegExpSamples.PHONENUMBER_REG_EXP,scanner));


        //Email input
        view.printer(view.USER_MAIL_INPUT);
        userEntity.setEMAIL(checkWithRegExp(RegExpSamples.EMAIL_REG_EXP,scanner));

        userEntity.setSURNAMENAME(service.cutNameSurname(userEntity.NAME,userEntity.SURNAME));


        view.printer(userEntity.toString());


    }

    private String checkWithRegExp(String regExp,Scanner scanner) {
        String temp="";
        while (true){
            temp=scanner.next();
          if(!temp.matches(regExp)){
              view.printer(view.ERROR);
          }else break;
        }
        view.printer(view.CORRECTDATA);
        return temp;
    }

}
