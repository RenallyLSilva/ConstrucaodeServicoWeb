# Construção de Serviço Web

Este projeto Spring Boot foi desenvolvido para fins acadêmicos e consiste na construção de **duas APIs dentro do mesmo projeto**:

1. **API Local (Interna):** Responsável por realizar operações CRUD (GET, POST, PUT, DELETE) sobre recursos definidos pelo desenvolvedor.
2. **API de Consumo Externo (Cliente):** Responsável por consumir uma API externa e retornar os dados da **tabela FIP**.

---

## 📋 Pré-requisitos

- Java JDK 11 ou superior  
- XAMPP (opcional, se for utilizar banco de dados MariaDB)  
- IDE como IntelliJ, Eclipse ou VS Code  
- Postman (opcional)

---

## ⚙️ Estrutura do Projeto

O projeto segue a arquitetura MVC (Model - View - Controller) e está dividido em duas principais funcionalidades:

### 🔹 1. API Local

- Implementa as operações:
  - **GET**: Listar registros
  - **POST**: Criar novo registro
  - **PUT**: Atualizar registro existente
  - **DELETE**: Remover registro

- Permite persistência de dados (pode usar H2, MariaDB ou outro, conforme configuração).

### 🔹 2. API Cliente (Consumo da API FIP)

- Realiza requisições HTTP para uma API externa que retorna os dados da **tabela FIP**.
- Utiliza `RestTemplate` ou `WebClient` para o consumo dos dados.
- Exibe os dados recebidos em formato JSON via endpoint próprio.

---

## 📁 Exemplo de Endpoints

### 📌 API Local

- **GET** `/api/objetos` – Lista todos os registros  
- **POST** `/api/objetos` – Cria um novo registro  
- **PUT** `/api/objetos/{id}` – Atualiza um registro  
- **DELETE** `/api/objetos/{id}` – Remove um registro  

### 🌐 API de Consumo Externo

- **GET** `/api/fip` – Retorna dados da tabela FIP consumidos da API externa

---

## ⚙️ Configuração

No arquivo `application.properties`, configure o banco de dados (caso utilize MariaDB):

// ```properties
spring.datasource.url=jdbc:mariadb://localhost:3307/seubanco
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true // 

### ▶️ Executando o Projeto
1. Inicie o banco de dados (se necessário).
2. Execute a aplicação pela sua IDE ou pelo terminal com:

//./mvnw spring-boot:run // 

3. Acesse os endpoints:

// http://localhost:8080/api/objetos
http://localhost:8080/api/fip //

###🧪 Testes e Validação
Você pode utilizar o Postman para testar os endpoints da API local e conferir se o consumo da API externa está funcionando corretamente.

✅ Considerações Finais
Este projeto demonstra o uso de duas APIs Spring Boot no mesmo projeto:

> Uma API REST CRUD interna

> Uma API consumidora de dados externos (tabela FIP)

É um exemplo prático de integração entre serviços e pode ser expandido para diversas aplicações do mundo real.
