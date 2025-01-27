package ProjectNew.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;

@Entity
@Table(name = "login")
public class LoginModel {  // Naming convention: class names should start with capital letters
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public LoginModel() {
    }

    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
