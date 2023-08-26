package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.repository.ArtistaRepository;
import br.com.fiap.domain.repository.EstiloRepository;

import java.util.List;
import java.util.Objects;

public class EstiloService implements Service<Estilo, Long>{

    private EstiloRepository estilorepository;
    @Override
    public List<Estilo> findAll() {
        return null;
    }

    @Override
    public Estilo findById(Long id) {
        return null;
    }

    @Override
    public List<Estilo> findByName(String texto) {
        return null;
    }

    @Override
    public Estilo persist(Estilo estilo) {

        if(Objects.nonNull(estilo)){
            repository.persist(estilo);
        }else{
            return null;
        }
    }
}