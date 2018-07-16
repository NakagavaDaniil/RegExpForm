import controller.RegExpSamples;
import org.junit.Assert;
import org.junit.Test;



public class TestController extends Assert {



    public static String[] wrongMasStr = new String[]{"123123","asdasdasd","/\\]['+_)(*&^%$#@!","ffff231@","       ","XXDD0978","@adad"};

    public static String[] correctMasStr=new String[]{"mike@ukr.net","susan.voland@gmail.com"};


    public  boolean regExpValidationTest(String regExp , String... checkToValidation){

        for (String aCheckToValidation : checkToValidation) {
            if(aCheckToValidation.matches(regExp)){
                return false;
            }
        }
        return true;
    }





    @Test
    public void wrongData(){
      Assert.assertTrue(regExpValidationTest(RegExpSamples.EMAIL_REG_EXP,wrongMasStr));


    }
    @Test
    public void correctData(){
        Assert.assertFalse(regExpValidationTest(RegExpSamples.EMAIL_REG_EXP,correctMasStr));
    }
}
