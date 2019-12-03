package br.com.fernando.cursomc.service;

import br.com.fernando.cursomc.domain.Categoria;
import br.com.fernando.cursomc.repository.CategoriaRepository;
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

    public Optional<Categoria> buscar(Integer id) {
        return categoriaRepository.findById(id);
    }
}
