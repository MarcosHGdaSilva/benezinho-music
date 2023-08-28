package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistaRepository implements Repository<Artista, Long>{


    private  static List<Artista> artistas;

    static {

        artistas = new ArrayList<>();

        Artista matue = new Artista(666L, "AC DC");
        Artista teto = new Artista(333L, "Dio");
        Artista daniel = new Artista(1L, "Michael Jackson");

        artistas.addAll(Arrays.asList(matue, teto, daniel));
    }

    @Override
    public List<Artista> findAll() {
        return artistas;
    }

    @Override
    public Artista findById(Long id) {
        for (Artista a : artistas) {
            if (a.getId().equals( id )) {
                return a;
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