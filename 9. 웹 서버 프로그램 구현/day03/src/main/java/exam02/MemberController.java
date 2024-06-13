package exam02;

import exam01.Controller;
import exam01.GetMapping;
import exam01.PostMapping;

@Controller
@GetMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join(String name, int num) {
        System.out.println("GetMapping에서 실행");
        System.out.printf("%s, %d%n", name, num);
        return "join";
    }

    @PostMapping("/join")
    public void joinPs() {
        System.out.println("PostMapping에서 실행");

    }
}
