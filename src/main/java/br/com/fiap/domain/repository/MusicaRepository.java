package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Musica;

import java.util.List;

public class MusicaRepository  implements Repository<Musica, Long>{

    List<Musica> musicas;

    @Override
    public List<Musica> findAll() {
        return musicas;
    }

    @Override
    public Musica findById(Long id) {
        return null;
    }

    @Override
    public List<Musica> findByName(String texto) {
        return null;
    }

    @Override
    public Musica persist(Musica musica) {
        return null;
    }
}
