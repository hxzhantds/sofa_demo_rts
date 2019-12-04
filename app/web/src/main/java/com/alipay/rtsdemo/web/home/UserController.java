package com.alipay.rtsdemo.web.home;

import com.alipay.rtsdemo.facade.SampleService;

import com.alipay.rtsdemo.facade.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {

    private SampleService sampleService;

    @ResponseBody
    @RequestMapping(value="/json",method = RequestMethod.GET)
    public User printWelcome() {
        return new User("zhangsan", 25, sampleService.message());
    }

    /**
     * Setter method for property <tt>sampleService</tt>.
     *
     * @param sampleService  value to be assigned to property sampleService
     */
    public void setSampleService(SampleService sampleService) {
        this.sampleService = sampleService;
    }
}
