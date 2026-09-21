# 💰 Controle Financeiro API

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de receitas e despesas.

Este projeto faz parte do meu portfólio de desenvolvimento backend e foi criado para aplicar, na prática, conceitos de API REST, orientação a objetos, arquitetura em camadas e persistência de dados com banco relacional.

## 🎯 Objetivo

Permitir o cadastro, consulta, atualização e exclusão de lançamentos financeiros, representando receitas e despesas.

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Git e GitHub

## ⚙️ Funcionalidades implementadas

- Cadastro de lançamentos
- Listagem de todos os lançamentos
- Consulta de lançamento por ID
- Atualização de lançamento
- Exclusão de lançamento
- Classificação do lançamento por tipo

## 🔗 Endpoints

| Método | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/lancamentos` | Lista todos os lançamentos |
| GET | `/lancamentos/{id}` | Busca um lançamento pelo ID |
| POST | `/lancamentos` | Cadastra um novo lançamento |
| PUT | `/lancamentos/{id}` | Atualiza um lançamento existente |
| DELETE | `/lancamentos/{id}` | Exclui um lançamento |

## 🧱 Estrutura do projeto

A aplicação utiliza separação em camadas:

- **Controller** — recebe e responde às requisições HTTP.
- **Service** — concentra as regras e operações da aplicação.
- **Repository** — realiza o acesso aos dados por meio do Spring Data JPA.
- **Model/Entity** — representa os dados dos lançamentos financeiros.

## 📚 Conceitos praticados

- API REST
- CRUD
- Programação Orientada a Objetos
- Injeção de dependências
- Persistência de dados
- Arquitetura em camadas
- Versionamento com Git

## 📌 Status

**Versão inicial funcional — melhorias em andamento.**

Próximas evoluções possíveis incluem validações de dados, categorias, cálculo de saldo, tratamento global de erros e testes automatizados.

## 👨‍💻 Autor

**Israel Oliveira Rodrigues de Lima**

Formado em Gestão da Tecnologia da Informação, em transição de carreira para desenvolvimento de software.

### Em aprendizado e desenvolvimento

Java • Spring Boot • React • PostgreSQL • Git
