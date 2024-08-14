package controlador;

public class Contato {
    String[][] contatos;

    public Contato() {} //Construtor

    public void adicionar(String[] contatoParaIncluir) {

        if (contatos==null) { //Faz a verificação da lista. Se a lista estiver como null, nenhum contato foi adicionado.
            contatos = new String[1][3]; //Então, inicializamos a lista
            contatos[0] = contatoParaIncluir; // e incluímos o valor passado como primeiro do array.
        }

        else {
            String[][] contatosAux = new String[contatos.length+1][3];
            for(int i = 0; i<contatos.length; i++) { //Copia a array contatos para uma auxiliar com tamanho contatos.length +1
                contatosAux[i] = contatos[i];
            }

            contatosAux[contatosAux.length -1] = contatoParaIncluir; //Pega a ultima posição da array auxiliar e incrementa o contato passado
            this.contatos = contatosAux; //A array contatos agora é igual ao contatosAux, fazendo assim com que a array aumente de tamanho toda vez que precisarmos adicionar informações

        }
    }

    public void remover(String telefone){

        int indice = encontrar(telefone);
        String[][] contatosAux = new String[contatos.length-1][3];

        if (indice == 0){
            for(int i = 1; i<=contatosAux.length; i++) {
                contatosAux[i-1] = contatos[i];

            }
        }

        else if (indice == contatos.length-1){
            for (int i =0; i<contatosAux.length; i++) {
                contatosAux[i] = contatos[i];
            }
        }


        else {
            for (int i =0; i<indice; i++) {
                contatosAux[i] = contatos[i];
            }
            for (int i =indice+1; i<contatos.length; i++) {
                contatosAux[i-1] = contatos[i];
            }
        }
        this.contatos = contatosAux;
    }

    public int encontrar(String telefone){

        Integer indiceContato = null;
        for(int i =0; i<contatos.length; i++){

            if (contatos[i][1].equals(telefone)) {
                indiceContato = i;
                //Percorre os telefones da array contatos. Se encontrar um telefone igual, retorna o indice do contato na array. Se não, o retorno será null;
            }

        }
        return indiceContato;   //Aqui acontece a primeira exception, quando indiceContato é null. Isso se dá pq o metodo espera como retorno uma int, e não há como uma int ser null.
                                //Temos duas abordagens: Mudar o método para Integer, ou então criar um try-catch (bom pra pôr em prática).
    }
    

    public String[] consultarPorIndice(int indice) {
        return contatos[indice];
    }

    public int tamanhoDaAgenda(){
        return contatos.length;
    }
}