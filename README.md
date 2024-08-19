## Projeto
Este projeto é uma aplicação de agenda em Java que permite gerenciar contatos de forma simples e eficiente. 
A aplicação oferece funcionalidades para adicionar, editar e detalhar contatos. 
O desafio principal deste projeto foi implementar a funcionalidade de gerenciamento de contatos sem utilizar ArrayLists.

## Funcionalidades
Adicionar Contatos: Permite ao usuário inserir novos contatos com informações básicas, como nome, telefone e e-mail.</br>
Editar Contatos: Oferece a possibilidade de modificar os detalhes de um contato existente.</br>
Detalhar Contatos: Exibe as informações completas de um contato específico.</br>
Remover Contatos: Remove o contato especificado da nossa lista.</br>
Listar Contatos: Exibe as informações de todos contatos cadastrados.

## Como executar
1. Clone o repositório e navegue até a pasta dele:
```bash
git clone https://github.com/aleschopf/AgendaSantander.git
cd ./AgendaSantander
```
2. Compile os arquivos Java:
```bash
javac -d ./out/ src/AgendaApp.java src/controlador/Contato.java src/controlador/ContatoManager.java src/visao/Menu.java
```
3. Execute o projeto:
```bash
cd out
java AgendaApp
```
4. Interaja com o Menu:

Após a execução será exibido um Menu para você interagir.

## Aparência e funcionamento do projeto

<img src="https://i.imgur.com/O1lCFJn.gif"/>

## Requisitos funcionais

**RN1:** Não é permitido armazenar contatos com telefones ja cadastrados; 

**RN2:** Para realizar as ações (detalhar, editar e remover), será necessário informar o telefone do contato;

## Regras para entrega:
1. Projeto deve ser realizados em grupos de 4 a 5 pessoas;
2. Projeto deve ser entregue via github;
3. Todos os integrantes do grupo, tem que ter alguma contribuicao via git;
4. Deve-se entregar também um relatório em um arquivo README.md, na raiz do projeto, contendo as
   seguintes informações:
   Quais foram os desafios no projeto?
   O que foi mais interessante?
   O que pode ser melhorado?
5. Deverá ser realizada uma apresentacao do relatorio e do projeto no ultimo dia de aula;
6. Todos os integrantes deverão enviar o link do repositorio do grupo e também os nomes dos todos os
   integrantes devem constar na entrega do LMS.

## Respostas solicitadas:

### 1. Quais foram os desafios no projeto?
- Gerenciamento Dinâmico de Arrays: Como a implementação não pode usar ArrayList, foi necessário criar uma estrutura de dados baseada em arrays que se comportasse de maneira dinâmica. Isso envolveu a criação de métodos para redimensionar o array conforme necessário e garantir que os contatos fossem gerenciados de maneira eficiente.

- Organização da Estrutura do Código: A ausência de ArrayList trouxe o desafio de organizar o código de forma clara e modular.  A estrutura foi planejada para manter a simplicidade e a legibilidade, com classes e métodos bem definidos para  lidar com as operações de adicionar, editar e detalhar contatos.

### 2. O que foi mais interessante?

O aspecto mais interessante deste projeto foi o desafio de implementar uma estrutura de dados dinâmica sem recorrer às facilidades oferecidas por ArrayList. Desenvolver uma abordagem própria para gerenciar um array de contatos e torná-lo dinâmico foi uma oportunidade única para aprimorar habilidades em manipulação de arrays e gerenciamento de memória.

Além disso, a necessidade de organizar o código de forma clara e eficiente, considerando as restrições impostas, levou a uma solução criativa e bem arquitetada. A experiência de criar uma implementação robusta e customizada de uma funcionalidade tão comum como o gerenciamento de contatos destacou a importância da inovação na resolução de problemas e do design de software.

### 3. O que pode ser melhorado?
- Persistência de Dados: Atualmente, os dados são armazenados apenas durante a execução do programa. Implementar funcionalidades para salvar e carregar contatos de um arquivo externo (como um arquivo CSV ou um banco de dados) pode adicionar robustez à aplicação e permitir que os usuários preservem suas informações entre sessões.
- Interface do Usuário: A interface baseada em console, apesar de funcional, pode ser aprimorada para tornar a interação mais intuitiva e amigável. Considerar o desenvolvimento de uma interface gráfica de usuário (GUI) usando Swing ou JavaFX pode melhorar a experiência do usuário e tornar a aplicação mais acessível.

## Projeto desenvolvido por:

[<img alt="Alecsandro Auer" height="75px" src="https://avatars.githubusercontent.com/u/54159302?v=4" width="75px"/>](https://github.com/aleschopf)
[<img alt="Christina Carvalho" height="75px" src="https://avatars.githubusercontent.com/u/175761726?v=4" width="75px"/>](https://github.com/ChristinaC-dev)
[<img alt="Lucas Moraes" height="75px" src="https://avatars.githubusercontent.com/u/106927402?v=4" width="75px"/>](https://github.com/lsmoraes16)
[<img alt="Maria Eduarda" height="75px" src="https://avatars.githubusercontent.com/u/134453107?v=4" width="75px"/>](https://github.com/mariaemrqs)
[<img alt="Matheus Lima" height="75px" src="https://avatars.githubusercontent.com/u/102155883?v=4" width="75px"/>](https://github.com/mathlimam)
