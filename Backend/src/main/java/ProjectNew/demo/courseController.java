package ProjectNew.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Import the repository
import ProjectNew.demo.courseRepository;

import java.util.List;

@RestController
@RequestMapping("/course/")
@CrossOrigin(origins = "*")
public class courseController {

    // Inject courseRepository here
    @Autowired
    private courseRepository courseRepository;

    @PostMapping("/put")
    public courseModel CreateFeedback(@RequestBody courseModel course) {
        return courseRepository.save(course);
    }

    @GetMapping("/get")
    public List<courseModel> getCourses() {
        return courseRepository.findAll();
    }
}
