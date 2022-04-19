package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", required = false, defaultValue = "UNKNOWKN") String nom){
        return "Hola " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
        return "Hola " + nom + ". Estàs executant un projecte Maven.";
    }
}
