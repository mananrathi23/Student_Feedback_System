package ProjectNew.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*")
public class loginController {
    @Autowired
    private loginRepository loginRepository;

    @PostMapping("/put")
    public LoginModel CreateStudent(@RequestBody LoginModel loginModel) {
        return loginRepository.save(loginModel);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginModel loginModel) {
        // Use the loginRepository to find the user by email and password
        LoginModel user = loginRepository.findByEmailAndPassword(loginModel.getEmail(), loginModel.getPassword());

        // Check if a matching user was found
        if (user != null) {
            return "Login Successful";
        } else {
            return "Invalid email or password";
        }
    }



}
