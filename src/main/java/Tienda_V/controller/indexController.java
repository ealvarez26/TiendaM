package Tienda_V.controller;

import Tienda_V.dao.ClienteDao;
import Tienda_V.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class indexController {

    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/")

    public String inicio(Model model) {
        log.info("Arquitectura MVC- ModelViewController");

//        String mensaje = "En este <p> tag, estamos pasando un mensaje atraves del controlador que nos crea un modelo";
//        model.addAttribute("texto", mensaje);
//
//        Cliente cliente = new Cliente("Erick", "Alvarez", "erickalvarezc01@gmail.com", "85861872");
//        model.addAttribute("cliente", cliente);
//
//        Cliente cliente2 = new Cliente("Gustavo", "Calderon", "gustavoalvarezc01@gmail.com", "85861872");
//        model.addAttribute("cliente", cliente);
//
//        Cliente cliente3 = new Cliente("Fer", "Luterking", "Ferluter@gmail.com", "85861872");
//        model.addAttribute("cliente", cliente);
//        
//
//
//        var clientes = Arrays.asList(cliente, cliente2, cliente3);
    
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        return "index";

    }
}
