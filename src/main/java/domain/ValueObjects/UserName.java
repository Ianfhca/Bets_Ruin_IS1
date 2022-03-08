package domain.ValueObjects;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserName {
    @Column(name = "userName")
    private String value;
    public UserName(String name)
    {
    	validate(name);
        this.value = name;
    }
    public String value(){
        return value;
    }
    private void validate(String name) throws IllegalArgumentException {
    	if(name==null || name.length()<2)
    		throw new IllegalArgumentException("The userName introduced is wrong");
    	
    }
}
