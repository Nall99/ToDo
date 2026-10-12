# ToDo App — Fullstack com Angular e Spring Boot

Aplicação web de gerenciamento de tarefas (ToDo), desenvolvida com Angular no frontend e Spring Boot no backend. Permite autenticação de usuários, criação, listagem, edição e remoção de tarefas.

## 🛠 Tecnologias utilizadas

### Backend (API REST)
- Java 17
- Spring Boot
- Spring Security + JWT
- Spring Data JPA
- PostgreSQL
- Maven

### Frontend
- Angular 16+
- TypeScript
- Angular Material
- RxJS

---

## 🚀 Como executar o projeto

### Pré-requisitos

- [Node.js](https://nodejs.org/) + [Angular CLI](https://angular.io/cli)
- [Java 17+](https://adoptium.net/)
- [PostgreSQL](https://www.postgresql.org/)
- [Maven](https://maven.apache.org/) (ou use o wrapper `./mvnw`)

### 🧩 Backend (Spring Boot)

```bash
# Acesse a pasta backend
cd backend

# Configure o arquivo application.properties:
# src/main/resources/application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/tododb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
jwt.secret=sua_chave_jwt

# Execute a aplicação
./mvnw spring-boot:run

```

# Frontend (Angular)
```bash
# Acesse a pasta frontend
cd frontend

# Instale as dependências
npm install

# Execute o frontend
ng serve
```
Acesse: http://localhost:4200

## 📡 Principais rotas da API

## 🧭 Rotas da aplicação (Angular)

Estas são as rotas disponíveis no frontend da aplicação. Elas controlam a navegação entre telas e são acessíveis pelo navegador após o login.

| Caminho                     | Componente                | Descrição                                 |
|----------------------------|---------------------------|-------------------------------------------|
| `/login`                   | `LoginComponent`          | Tela de login                             |
| `/cadastro`                | `CadastroComponent`       | Tela de cadastro de novo usuário          |
| `/principal`               | `PrincipalComponent`      | Layout principal após o login             |
| `/principal/tarefas`       | `TarefasListaComponent`   | Lista todas as tarefas                    |
| `/principal/tarefas/a-fazer` | `TarefasListaComponent` | Lista tarefas com status "a fazer"        |
| `/principal/tarefas/fazendo` | `TarefasListaComponent` | Lista tarefas com status "fazendo"        |
| `/principal/tarefas/concluido` | `TarefasListaComponent` | Lista tarefas com status "concluído"      |
| `/principal/tarefas/new`   | `TarefasDetalheComponent` | Tela de criação de nova tarefa            |
| `/principal/tarefas/edit/:id` | `TarefasDetalheComponent` | Tela de edição de uma tarefa existente    |




## ✅ Funcionalidades
- Registro e login de usuários.
- Criação, listagem, edição e exclusão de tarefas.
- Validação de dados.

## 📁 Estrutura de pastas
```bash
meu-projeto/
├── ToDo_Back/   # Projeto Spring Boot (API REST)
└── Todo_Front/  # Projeto Angular (interface do usuário)
```

## 🤝 Contribuição
Sinta-se à vontade para abrir issues ou pull requests.