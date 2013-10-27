package com.kendoui.spring.controllers.areacharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("dataviz-area_charts-error_bars-controller")
@RequestMapping(value="/dataviz/area-charts/")
public class ErrorBarsController {
    @RequestMapping(value = {"/", "/error-bars"}, method = RequestMethod.GET)
    public String index() {
        return "/dataviz/area-charts/error-bars";
    }
}
