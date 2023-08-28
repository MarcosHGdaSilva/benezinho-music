package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.entity.Musica;

import java.util.ArrayList;
import java.util.List;

public class MusicaRepository  implements Repository<Musica, Long>{

     MusicaRepository musicaRepository = new MusicaRepository();


    private static List<Musica> musicas;

    static {
        musicas = new ArrayList<>();

    }

    public List<Musica> findAll() {
        return musicas;
    }

    public Musica findById(Long id) {
        for (Musica m : musicas) {
            if (m.getId().equals( id )) {
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Musica> findByName(String texto) {
        return musicas.stream().filter(mu -> mu.getNome().equalsIgnoreCase( texto ) ).toList();
    }

    public static List<Musica> findByArtista(Artista a) {
        List<Musica> encontrados = new ArrayList<>();

        for (Musica mu : musicas) {
            if (mu.getArtistas().equals( a )) {
                encontrados.add(mu);
            }
        }
        return encontrados;
    }

    public static List<Musica> findByEstilo(Estilo estilo) {
        return musicas.stream()
                .filter( pe -> pe.getEstilo().equals( estilo ) )
                .toList();
    }

    public Musica persist(Musica m) {
        m.setId( musicas.size() + 1L );
        musicas.add(m);
        return m;
    }

}
