package domain.ValueObjects;

import javax.persistence.Embeddable;

@Embeddable
public class UserPassword {
    private final int MIN = 5;
    private final int MAX = 12;
    private String value;

    public UserPassword(String password) throws Exception {
        validate(password);
        this.value= password;
    }
    private void validate(String password) throws Exception {
        if(password.length()<MIN)
            throw new Exception("Password is to short");
        if(password.length()>MAX)
            throw new Exception("Password is to long");
    }
    public String value(){
        return this.value;
    }



}
