package com.alipay.rtsdemo.web.home;

import com.alipay.rtsdemo.facade.SampleService;

import com.alipay.rtsdemo.facade.domain.User;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {

    @SofaReference
    private SampleService sampleService;

    @ResponseBody
    @RequestMapping(value="/json",method = RequestMethod.GET)
    public User printWelcome() {
        return new User("zhangsan", 21, sampleService.message());
    }
}
