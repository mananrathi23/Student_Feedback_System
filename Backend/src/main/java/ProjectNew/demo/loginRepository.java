package ProjectNew.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<LoginModel, String> {
    LoginModel findByEmailAndPassword(String email, String password);
}