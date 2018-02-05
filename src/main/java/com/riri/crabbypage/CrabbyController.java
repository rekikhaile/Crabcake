package com.riri.crabbypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrabbyController {

    @RequestMapping("/")
    public String crabbyCakerecipe() {
        return "crabbypage";
    }
}
