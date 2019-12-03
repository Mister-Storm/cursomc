package br.com.fernando.cursomc.ressources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaRessource {

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "REST está funcionando!!!";
    }
}
