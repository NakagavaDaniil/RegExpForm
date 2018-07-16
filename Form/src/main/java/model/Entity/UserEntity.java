package model.Entity;

public class UserEntity {
    public String NAME;
    public String SURNAME;
    public String SURNAMENAME;
    public String EMAIL;
    public String PHONENUMBER;


    public UserEntity() {
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
                "@email:"+EMAIL+"\n"+
                "Phone number:"+PHONENUMBER;
    }
}
