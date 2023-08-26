package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;

import java.util.ArrayList;
import java.util.List;

public class ArtistaRepository implements Repository<Artista, Long>{


    List<Artista> artistas;

    @Override
    public List<Artista> findAll() {
        return artistas;
    }

    @Override
    public Artista findById(Long id) {
        for (int i = 0; i < artistas.size(); i++) {
            if (artistas.get( i ).getId().equals( id )) {
                return artistas.get( i );
            }
        }
        return null;
    }

    @Override
    public List<Artista> findByName(String texto) {
        List<Artista> depositosEncontrados = new ArrayList<>();
        for (Artista d : artistas) {
            if (d.getNome().equalsIgnoreCase( texto )) {
                depositosEncontrados.add( d );
            }
        }
        return depositosEncontrados;
    }

    @Override
    public Artista persist(Artista artista) {
        artista.setId( artistas.size() + 1L );
        artistas.add( artista );
        return artista;
    }
}