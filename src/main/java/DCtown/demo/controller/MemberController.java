package DCtown.demo.controller;

import DCtown.demo.model.Member;
import DCtown.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("users")
    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }

    @PostMapping("users")
    public Member signUp() {
        final Member member = Member.builder()
                .name("김하연")
                .nickName("여니요미")
                .email("gomcool17@naver.com")
                .city("서울")
                .password("1234")
                .build();
        return memberRepository.save(member);
    }
}
