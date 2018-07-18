package model.Entity;

import controller.MyExapion;

public class UserEntity {

    private String[] DATA_BASE_EMULATOR={"Mark","Nagibator228","soulEater2010","Vanek"};

    public String NAME;
    public String SURNAME;
    public String SURNAMENAME;
    public String LOGIN;
    public String EMAIL;
    public String PHONENUMBER;


    public UserEntity()  {
    }

    public boolean checkData(String data)throws Exception {
        for (String el:DATA_BASE_EMULATOR){
            if(el.equals(data)){
                throw new MyExapion();
            }
        }
        return true;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) throws Exception {

            checkData(LOGIN);

        this.LOGIN = LOGIN;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getSURNAMENAME() {
        return SURNAMENAME;
    }

    public void setSURNAMENAME(String SURNAMENAME) {
        this.SURNAMENAME = SURNAMENAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public void setPHONENUMBER(String PHONENUMBER) {
        this.PHONENUMBER = PHONENUMBER;
    }


    @Override
    public String toString() {
        return "Name:"+NAME+"\n"+
                "Surname:"+SURNAME+"\n"+
                "Full name:"+SURNAMENAME+"\n"+
                "Login"+LOGIN+
                "@email:"+EMAIL+"\n"+
                "Phone number:"+PHONENUMBER;
    }
}
