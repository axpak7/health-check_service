package com.nexign.btd.pak.alexey;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "health/check", method = RequestMethod.GET)
    @ResponseBody
    public String check(@RequestParam(value = "answerTo", required = false) String answerTo) {
        return "I'm OK" + (!StringUtils.isEmpty(answerTo) ? ", " + answerTo : "") + "!";
    }
}
