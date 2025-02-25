<h3>Gerenciador de Usuários</h3>
Este projeto é um Gerenciador de Usuários construído com Spring Boot e Kotlin. Ele permite realizar operações de CRUD (criação, leitura, atualização e exclusão) para gerenciar cadastros de pessoas em um banco de dados MySQL. O projeto utiliza Thymeleaf para renderizar as páginas HTML e Spring Data JPA para interação com o banco de dados.

Tecnologias Utilizadas
Spring Boot (Versão 3.4.2)
Kotlin (Versão 1.9.25)
Spring Data JPA: Para interação com o banco de dados.
Thymeleaf: Para renderização de templates.
MySQL: Banco de dados para armazenar os dados dos usuários.
Spring Boot Starter Test: Para realizar testes de integração (sem testes unitários implementados).
Kotlin Reflect: Para refletir a estrutura do projeto Kotlin.
Funcionalidades
Cadastro de usuários: Permite cadastrar pessoas no banco de dados.
Edição de cadastro: Permite editar os dados de um usuário já existente.
Exclusão de cadastro: Permite excluir um usuário do banco de dados.
Validação de entrada: A entrada do formulário é validada antes de ser processada.
Dependências
O projeto depende das seguintes bibliotecas:

spring-boot-starter-data-jpa: Para integração com banco de dados usando JPA.
spring-boot-starter-thymeleaf: Para renderização de templates HTML com Thymeleaf.
spring-boot-starter-web: Para a construção de aplicações web.
mysql-connector-j: Driver JDBC para o MySQL.
kotlin-reflect e kotlin-stdlib: Para utilização de recursos avançados da linguagem Kotlin.
kotlin-test-junit5: Para testes com JUnit5.
