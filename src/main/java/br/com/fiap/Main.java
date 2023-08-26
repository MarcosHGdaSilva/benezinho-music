package br.com.fiap;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.service.ArtistaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArtistaService service = new ArtistaService();
        List<Artista> artistas = service.findAll();
        System.out.println(artistas);




    }
}