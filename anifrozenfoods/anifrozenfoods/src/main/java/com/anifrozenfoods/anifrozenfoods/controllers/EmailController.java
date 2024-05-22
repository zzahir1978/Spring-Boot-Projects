/*
package com.anifrozenfoods.anifrozenfoods.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.anifrozenfoods.anifrozenfoods.services.EmailService;
import jakarta.validation.constraints.Email;

@Controller
public class EmailController {
    
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@ModelAttribute Email email, RedirectAttributes redirectAttributes) {
        try {
            emailService.sendEmail(email);
            redirectAttributes.addFlashAttribute("message", "Email sent successfully");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Failed to send email");
        }
        return "redirect:/phonebook";
    }
}*/