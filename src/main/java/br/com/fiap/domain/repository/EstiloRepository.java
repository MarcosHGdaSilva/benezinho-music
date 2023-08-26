package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;

import java.util.List;

public class EstiloRepository  implements Repository<Estilo, Long> {

    List<Estilo> estilos;
    @Override
    public List<Estilo> findAll() {
        return estilos;
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
        return null;
    }
}