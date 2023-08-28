package br.com.fiap;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.entity.Musica;
import br.com.fiap.domain.repository.MusicaRepository;
import br.com.fiap.domain.service.ArtistaService;
import br.com.fiap.domain.service.EstiloService;
import br.com.fiap.domain.service.MusicaService;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        MusicaService musicaService = new MusicaService();
        List<Musica> musicas =
        System.out.println(musicas);

    }
}