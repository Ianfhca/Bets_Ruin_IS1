package domain.ValueObjects;

import modules.Shared.domain.ValueObjects.ValueObjectUUID;

import javax.persistence.Embeddable;
import java.util.UUID;
@Embeddable
public class UserId extends ValueObjectUUID {
    public UserId(){
        super();
    }
    public UserId(String id){
        super(id);
    }
}
