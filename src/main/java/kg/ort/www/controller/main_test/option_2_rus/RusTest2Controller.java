package kg.ort.www.controller.main_test.option_2_rus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/main_tests/option_2_rus")
public class RusTest2Controller {

    @GetMapping("/introduction")
    public String getIntroductionPage() {
        return "/main_tests/option_2_rus/introduction";
    }

    @GetMapping("/math")
    public String getMathPage() {
        return "/main_tests/option_2_rus/math";
    }

    @GetMapping("/math2")
    public String getMath2Page() {
        return "/main_tests/option_2_rus/math2";
    }

    @GetMapping("/analogy")
    public String getAnalogiyaPage() {
        return "/main_tests/option_2_rus/analogy";
    }

    @GetMapping("/reading")
    public String getChteniyePage() {
        return "/main_tests/option_2_rus/reading";
    }

    @GetMapping("/grammar")
    public String getGrammaryPage() {
        return "/main_tests/option_2_rus/grammar";
    }
}
