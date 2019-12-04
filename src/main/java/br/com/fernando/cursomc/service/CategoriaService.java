package br.com.fernando.cursomc.service;

import br.com.fernando.cursomc.domain.Categoria;
import br.com.fernando.cursomc.repository.CategoriaRepository;
import br.com.fernando.cursomc.service.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria find(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado!! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
