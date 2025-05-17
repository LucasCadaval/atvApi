# API de Cadastro de Usuários - Spring Boot

Esta é uma API simples desenvolvida com Spring Boot que permite criar novos usuários enviando os dados `name` (nome) e `age` (idade) no formato JSON.

## 🧾 Funcionalidades

- Criar novos usuários.
- Listar usuários.
- Alterar usuários.
- Deletar usuários.

## 🚀 Como usar este projeto

### 📥 Clonar o repositório

Você pode clonar o projeto usando Git:

```bash
git clone https://github.com/LucasCadaval/atvApi.git
cd atvApi
```


### ⚙️ Requisitos

Antes de iniciar, certifique-se de ter os seguintes itens instalados:

- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Postman](https://www.postman.com/) 

### 📦 Instalação

Compile o projeto com Maven:

```bash
./mvnw clean install
```


### ▶️ Executar a aplicação

Execute a aplicação com Maven:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível por padrão em:

```
http://localhost:8080
```

---

## 📮 Como fazer requisições

Você pode usar o Postman, Insomnia ou cURL para interagir com a API.

### 🔸 Criar um novo usuário

**Endpoint:**

```
POST /users
```

**URL completa (exemplo):**

```
http://localhost:8080/users
```

**Body (raw JSON):**

```json
{
  "name": "João Silva",
  "age": 28
}
```

**Resposta esperada (exemplo):**

```json
{
  "id": 1,
  "name": "João Silva",
  "age": 28
}
```

### 🔸 Listar todos os usuários

**Endpoint:**

```
GET /users
```

**URL completa (exemplo):**

```
http://localhost:8080/users
```

**Resposta esperada (exemplo):**

```json
[
  {
    "id": 1,
    "name": "João Silveira",
    "age": 28
  },
  {
    "id": 2,
    "name": "Lucas Cadaval",
    "age": 25
  }
]
```

### 🔸 Editar dados de um usuário

**Endpoint:**

```
PUT /users/{id_do_usuario}
```

**URL completa (exemplo):**

```
http://localhost:8080/users/1
```

**Body (raw JSON):**

```json
{
  "name": "João Silveira",
  "age": 28
}
```

**Resposta esperada (exemplo):**

```json
{
  "id": 1,
  "name": "João Silveira",
  "age": 28
}
```

### 🔸 Excluir um usuário

**Endpoint:**

```
DELETE /users/{id_do_usuario}
```

**URL completa (exemplo):**

```
http://localhost:8080/users/1
```

**Resposta esperada (exemplo):**

```
200 OK
```