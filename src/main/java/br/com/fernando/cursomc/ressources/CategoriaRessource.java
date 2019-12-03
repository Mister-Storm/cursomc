package br.com.fernando.cursomc.ressources;

import br.com.fernando.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaRessource {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaRessource(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        return new ResponseEntity<>(categoriaService.buscar(id), HttpStatus.OK);
    }
}
