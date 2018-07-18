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



    public void start() {
        Scanner scanner = new Scanner(System.in);


        //Enter data and save to entity


        //Name input
        view.printer(view.USER_NAME_INPUT);
        userEntity.setNAME(checkWithRegExp(RegExpSamples.NAME_REG_EXP,scanner));

        //Surname input
        view.printer(view.USER_SURNAME_INPUT);
        userEntity.setSURNAME(checkWithRegExp(RegExpSamples.NAME_REG_EXP,scanner));


        loginAdd(scanner);


        //Phone number input
        view.printer(view.USEER_PHONEN_INPUT);
        userEntity.setPHONENUMBER(checkWithRegExp(RegExpSamples.PHONENUMBER_REG_EXP,scanner));


        //Email input
        view.printer(view.USER_MAIL_INPUT);
        userEntity.setEMAIL(checkWithRegExp(RegExpSamples.EMAIL_REG_EXP,scanner));

        userEntity.setSURNAMENAME(service.cutNameSurname(userEntity.NAME,userEntity.SURNAME));


        view.printer(userEntity.toString());
    }

    private void loginAdd(Scanner scanner) {
        view.printer(view.USER_LOGIN);
        try {
            userEntity.setLOGIN(checkWithRegExp(RegExpSamples.NAME_REG_EXP,scanner));
        }  catch (Exception e) {
            e.printStackTrace();
            view.printer("login exist! change login");
            loginAdd(scanner);
        }
    }

    private String checkWithRegExp(String regExp,Scanner scanner) {
        String res;

        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regExp))) {
            view.printer(view.CORRECTDATA);
        }
        return res;
    }

}
