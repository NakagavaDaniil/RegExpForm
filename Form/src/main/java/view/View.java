package view;

public class View {


   public final String USER_MAIL_INPUT="input.message.user.mail";
   public final String USER_NAME_INPUT="input.message.user.name";
   public final String USER_SURNAME_INPUT="input.message.user.surname";
   public final String USEER_PHONEN_INPUT="input.message.user.phonenumber";
   public final String USER_LOGIN="Enter your ligin";

   public final  String ERROR = "message.error";
    public final  String CORRECTDATA="message.correct.data";

    public View() {
    }


    public void printer(String message){
        System.out.println(message);
    }


}
