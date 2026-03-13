# 📚 Sistema de Gerenciamento de Livraria (Java)

Este é um sistema de console desenvolvido em Java para gerenciar o fluxo de empréstimos de uma biblioteca/livraria. O projeto aplica conceitos fundamentais de Programação Orientada a Objetos (POO), como encapsulamento, composição e manipulação de listas.

## 🚀 Funcionalidades

- **Listagem Dinâmica:** Exibe apenas os livros que estão disponíveis para empréstimo no momento.
- **Registro de Empréstimo:** Permite selecionar um livro por ID, vincular ao nome do cliente e atualizar o status do livro automaticamente.
- **Gestão de Datas:** Registro automático de data de cadastro, atualização e data do empréstimo.
- **Relacionamento entre Objetos:** Estrutura baseada em classes relacionadas (`Livro`, `Autor`, `Emprestimo`).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Paradigma:** Orientação a Objetos
* **Estrutura de Dados:** `ArrayList` para persistência em memória (Listas)

## 🏗️ Estrutura do Projeto

O sistema é dividido nas seguintes entidades principais:

* **Livro:** Contém informações sobre o título, autor e status de disponibilidade.
* **Autor:** Armazena dados do escritor, como nome e data de nascimento.
* **Emprestimo:** Gerencia o vínculo entre o cliente e o livro retirado.
* **Biblioteca:** A classe principal que orquestra as listas e as regras de negócio.

## 📖 Como Executar

1. Certifique-se de ter o **JDK** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone git@github.com:JoaoGabrielGS/livraria-java.git
