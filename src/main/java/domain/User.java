package domain;

import modules.UserAccess.domain.Users.Permission.Permission;
import modules.UserAccess.domain.Users.ValueObjects.Role;
import modules.UserAccess.domain.Users.ValueObjects.UserId;
import modules.UserAccess.domain.Users.ValueObjects.UserName;
import modules.UserAccess.domain.Users.ValueObjects.UserPassword;
import org.glassfish.ha.store.annotations.Attribute;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    private UserId id;
    @EmbeddedId
    private UserName name;
    @Embedded
    private UserPassword password;
    @Embedded
    private Role type;

    public User(UserName name, UserPassword password) {
        this.id = new UserId();
        this.name = name;
        this.password = password;
        this.type = new Role();
    }
    public User(UserId id, UserName name, UserPassword password){
        this.id=id;
        this.name=name;
        this.password=password;
        this.type= new Role();
    }
    public User(Role role, UserId id, UserName name, UserPassword password){
        this.id=id;
        this.name=name;
        this.password=password;
        this.type = role;
    }

    public UserPassword getPassword(){
        return password;
    }

    public UserId getId() {
        return id;
    }

    public UserName getName() {
        return name;
    }

    public void changePassword(UserPassword password) {
        this.password = password;
    }

    public void changeName(String name) {
        this.name = new UserName(name);
    }

    public void changeUserToAdmin() {
        this.type=Role.ChangeToAdmin(this.type);
    }
    public List<Permission> getPermissions(){
        return type.getPermissions();
    }
    public Boolean isAdmin() {
        return this.type.isAdmin();
    }


    @Override
    public String toString() {
        return "User{" +
                "name=" + name.value() +
                ", password=" + password.value() +
                ", type=" + type.getUserType() +
                '}';
    }
}