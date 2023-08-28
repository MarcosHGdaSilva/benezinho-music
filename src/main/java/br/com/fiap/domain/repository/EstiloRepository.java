package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Estilo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstiloRepository  implements Repository<Estilo, Long> {

    private static List<Estilo> estilos;

    static {
        estilos = new ArrayList<>();

        Estilo trap = new Estilo(666L, "Rock");
        Estilo reggae = new Estilo(333L, "Heavy Metal");
        Estilo funk = new Estilo(1L, "Pop");

        estilos.addAll(Arrays.asList(trap, reggae, funk));
    }

    @Override
    public List<Estilo> findAll() {
        return estilos;
    }

    @Override
    public Estilo findById(Long id) {
        for (int i = 0; i < estilos.size(); i++) {
            if (estilos.get(i).getId().equals(id)) {
                return estilos.get(i);
            }
        }
        return null;
    }

    public List<Estilo> findByName(String texto) {
        List<Estilo> depositosEncontrados = new ArrayList<>();
        for (Estilo e : estilos) {
            if (e.getNome().equalsIgnoreCase(texto)) {
                depositosEncontrados.add(e);
            }
        }
        return depositosEncontrados;
    }

    public Estilo persist(Estilo e) {
        e.setId(estilos.size() + 1L);
        estilos.add(e);
        return e;
    }
}