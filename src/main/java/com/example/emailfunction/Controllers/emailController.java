package com.example.emailfunction.Controllers;

import com.example.emailfunction.Models.Emails;
import com.example.emailfunction.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class emailController {

    @Autowired
    private EmailService emailService;


    @GetMapping("/sendemail")
    public String sendEmail(){

        return "sendEmail";

    }

    @PostMapping("/sentemail")
    public String sendEmail(@ModelAttribute Emails emailFromPost){

        //emailService.sendEmail("christofferbrydensholt@gmail.com", "test subject", "Test mail");
        emailService.sendEmail(emailFromPost);
        return "emailsent";
    }


}
