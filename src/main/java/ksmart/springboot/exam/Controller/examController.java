package ksmart.springboot.exam.Controller;

import ksmart.springboot.exam.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * @Controller : 주소의 요청과 응답을 담당하는 클래스(HTTP 통신)
 *               VIEW의 경로가 정해져 있다.(String : 뷰의 논리적인 경로)
 */
@Controller
public class examController {

    /**
     * @GetMapping : GET 방식의 HTTP 주소요청시 특정핸들러 메소드와 매핑시켜주는 어노테이션
     * @return => 리턴은 VIEW 경로와 연관되어있다. String : 화면의 논리적 경로
     */
    @GetMapping("/exam/exam1")
    public String exam1(Model model) {

        Member memberInfo = new Member("id001","pw001","홍01","관리자","010-1111-1111");

        // Model의 역활 : 화면에 전달될 데이터를 가지고 있는 객체
        // model.addAllAttributes("키","값");
        model.addAttribute("title", "예제1");
        model.addAttribute("memberInfo", memberInfo);

        return "exam/exam1";
    }
}
