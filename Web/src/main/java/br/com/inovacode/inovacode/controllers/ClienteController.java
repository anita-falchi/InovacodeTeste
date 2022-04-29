package br.com.inovacode.inovacode.controllers;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    @GetMapping("/cliente/cadastrar")
    public String cadastrar(Model model){

        model.addAttribute("cliente", new Client());
        return "cliente/cadastrar";
    }
    
    @PostMapping("/cliente/salvar")
    public String salvar(@ModelAttribute Client client){
        System.out.println("Cliente para salvar:" + client);
        return "redirect:/";
    }

}
