package visao;

import controlador.Contato;

import java.util.Arrays;

public class Menu {
    public void iniciar() {
        while(true) {
            System.out.println("#####################");
            System.out.println("# Agenda telefonica #");
            System.out.println("#A###################");

            Contato contato = new Contato();
            contato.adicionar(new String[]{"matheus lima moreira", "117788559966", "math@math.com"});
            contato.adicionar(new String[]{"ricardinho sales barbosa", "1212121212", "ricardinho@math.com"});
            contato.adicionar(new String[]{"eita que teste bom", "1213121212", "eitaqueteste@math.com"});
            contato.adicionar(new String[]{"sei la man", "00000000000", "seila@math.com"});

            for (int i=0; i< contato.tamanhoDaAgenda(); i++){
                System.out.println("Nome: "+ contato.consultarPorIndice(i)[0] + " - Telefone: "+ contato.consultarPorIndice(i)[1] + " - Email: "+ contato.consultarPorIndice(i)[2]);
            }

            break;
        }


    }
}
