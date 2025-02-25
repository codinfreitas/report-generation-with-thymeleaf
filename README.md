<h2>Gerenciador de Usuários</h2>
Este projeto é um Gerenciador de Usuários construído com Spring Boot e Kotlin. Ele permite realizar operações de CRUD (criação, leitura, atualização e exclusão) para gerenciar cadastros de pessoas em um banco de dados MySQL. O projeto utiliza Thymeleaf para renderizar as páginas HTML e Spring Data JPA para interação com o banco de dados.
<br>

<h4>Tecnologias Utilizadas</h4>
- Spring Boot (Versão 3.4.2)<br>
- Kotlin (Versão 1.9.25)<br>
- Spring Data JPA: Para interação com o banco de dados.<br>
- Thymeleaf: Para renderização de templates.<br>
- MySQL: Banco de dados para armazenar os dados dos usuários.<br>
- Spring Boot Starter Test: Para realizar testes de integração (sem testes unitários implementados).<br>
- Kotlin Reflect: Para refletir a estrutura do projeto Kotlin.<br>

<h4>Funcionalidades</h4>
Cadastro de usuários: Permite cadastrar pessoas no banco de dados.<br>
Edição de cadastro: Permite editar os dados de um usuário já existente.<br>
Exclusão de cadastro: Permite excluir um usuário do banco de dados.<br>
Validação de entrada: A entrada do formulário é validada antes de ser processada.<br>

<h4>Dependências</h4>
spring-boot-starter-data-jpa: Para integração com banco de dados usando JPA.<br>
spring-boot-starter-thymeleaf: Para renderização de templates HTML com Thymeleaf.<br>
spring-boot-starter-web: Para a construção de aplicações web.<br>
mysql-connector-j: Driver JDBC para o MySQL.<br>
kotlin-reflect e kotlin-stdlib: Para utilização de recursos avançados da linguagem Kotlin.<br>
kotlin-test-junit5: Para testes com JUnit5.<br>

<h4>Como Rodar o Projeto</h4>
Clonar o Repositório: <br>
1° git clone https://github.com/codinfreitas/report-generation-with-thymeleaf.git<br>
2° cd report-generation-with-thymeleaf<br>

<h4>Configurar o Banco de Dados</h4>
Configure o banco de dados MySQL no arquivo application.properties ou application.yml do seu projeto:<br>

spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco<br>
spring.datasource.username=seu_usuario<br>
spring.datasource.password=sua_senha<br>
spring.jpa.hibernate.ddl-auto=update<br>

<h4>Rodar o Projeto</h4>
Execute o projeto usando o Maven:<br>

1° ./mvnw spring-boot:run<br>
Ou com o comando do Maven (caso tenha o Maven instalado)<br>
2° mvn spring-boot:run<br>

<h4>Acessar a Aplicação</h4>
A aplicação estará disponível no endereço:<br>
http://localhost:8080
