package DCtown.demo.controller;

import DCtown.demo.model.Member;
import DCtown.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public String home(Model model, @RequestParam Long id) {
        model.addAttribute("member", new Member());
        return "signup";
    }

}
