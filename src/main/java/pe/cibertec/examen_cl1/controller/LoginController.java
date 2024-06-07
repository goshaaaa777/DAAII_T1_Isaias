package pe.cibertec.examen_cl1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping("/login")
    public String login() {return "auth/frmlogin";}
    @GetMapping("/login-success")
    public String loginSuccess() {return "redirect:/auth/dashboard";}
    @GetMapping("/dashboard")
    public String dashboard() {return "auth/home";}
}
