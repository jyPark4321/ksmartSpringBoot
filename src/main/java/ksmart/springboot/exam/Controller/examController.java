package ksmart.springboot.exam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class examController {
    @GetMapping("/exam/exam1")
    public String exam1() {
        return "exam/exam1";
    }
}
