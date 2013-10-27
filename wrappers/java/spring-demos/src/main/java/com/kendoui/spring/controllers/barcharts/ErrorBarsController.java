package com.kendoui.spring.controllers.barcharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("dataviz-bar_charts-error_bars-controller")
@RequestMapping(value="/dataviz/bar-charts/")
public class ErrorBarsController {
    @RequestMapping(value = {"/", "/error-bars"}, method = RequestMethod.GET)
    public String index() {
        return "/dataviz/bar-charts/error-bars";
    }
}
