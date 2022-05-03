package kg.ort.www.controller.main_test.option_1_rus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/main_tests/option_1_rus")
public class RusTestController {

    @GetMapping("/introduction")
    public String getIntroductionPage() {
        return "/main_tests/option_1_rus/introduction";
    }

    @GetMapping("/math")
    public String getMathPage() {
        return "/main_tests/option_1_rus/math";
    }

    @GetMapping("/math2")
    public String getMath2Page() {
        return "/main_tests/option_1_rus/math2";
    }

    @GetMapping("/analogy")
    public String getAnalogiyaPage() {
        return "/main_tests/option_1_rus/analogy";
    }

    @GetMapping("/reading")
    public String getChteniyePage() {
        return "/main_tests/option_1_rus/reading";
    }

    @GetMapping("/grammar")
    public String getGrammaryPage() {
        return "/main_tests/option_1_rus/grammar";
    }
}
