package com.alipay.rtsdemo.web.home;

import com.alipay.rtsdemo.facade.SampleService;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class VelocitySampleController {

    private SampleService sampleService;

    @RequestMapping(value="/velocity",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", sampleService.message());
        return "sample.vm";
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