package com.jooree.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.jooree.util.CheckDevice.checkMobile;
import static com.jooree.util.GetDeviceURL.getFullURL;

@Controller
public class HomeController {
    @RequestMapping(path={"", "/", "/home"})
    public String homeRedirect(){
        return "redirect:/home";
    }

    @Operation(
            summary = "메인",
            description = "메인 페이지 이동"
    )
    @GetMapping(value="/")
    public String home(HttpServletRequest request, Model model){
        model.addAttribute("isMobile", checkMobile(request));
        String fullUrl = getFullURL(checkMobile(request), "index");
        return fullUrl;
    }
}