# 🍽️ Sistema de Chá de Panela

Este projeto foi desenvolvido para auxiliar na organização de um **Chá de Cozinha**, permitindo gerenciar a **lista de presentes** e a **lista de convidados**.  
A ideia é facilitar o controle de quem irá levar qual item e quem confirmou presença, tornando o processo simples e eficiente.

---

## ✨ Funcionalidades

- 📝 **Cadastro de Convidados**
    - Adicionar convidados à lista
    - Exibição em ordem alfabética

- 🎁 **Lista de Presentes do Chá de Panela**
    - Lista pré-definida em formato Enum
    - Cada presente pode ser escolhido apenas uma vez, mas um convidado pode escolher mais de um presente.
    - Evita presentes duplicados

- ✅ **Confirmações**
    - Saber quem confirmou presença
    - Saber qual presente cada convidado escolheu

---

## 🧱 Tecnologias Utilizadas

| Tecnologia      | Função                       |
|-----------------|------------------------------|
| **Java**        | Linguagem principal          |
| **Spring Boot** | Framework de desenvolvimento |
| **Spring Web**  | Criação das APIs REST        |
| **MySQL**       | Banco de dados relacional    |
| **Lombok**      | Redução de código repetitivo |

---

## 📁 Estrutura Principal do Projeto

```
src/
├─ main/
│ ├─ java/
│ │ ├─ config/ # Configurações iniciais do database
│ │ ├─ dto/ # Objetos de Transferência de Dados
│ │ ├─ controller/ # Controladores das rotas (API)
│ │ ├─ repository/ # Repositórios do database
│ │ ├─ service/ # Regras de negócio
│ │ ├─ entity/ # Entidades de domínio
| | ├─ exception/ # Tratamento de erros
│ │ └─ enums/ # Enumeração dos itens do chá
│ └─ resources/
│ └─ application.properties
```

---

## 🚀 Como Executar

### Pré-requisitos:
- Java 17+
- Maven instalado

### Passos:
```bash
# Clonar repositório
git clone https://github.com/LucaBotini/app-chapanela.git

# Entrar na pasta
cd projeto-cha-de-cozinha

# Executar
mvn spring-boot:run
```

A aplicação ficará disponível em: http://localhost:8080

---

# 📝 Rotas Principais

| Método | Rota          | Descrição                     |
| ------ | ------------- | ----------------------------- |
| GET    | `/convidados` | Lista todos os convidados     |
| POST   | `/convidados` | Adiciona um novo convidado    |
| GET    | `/itens`      | Lista todos os presentes      |
| POST   | `/escolher`   | Convidado escolhe um presente |

🌌 Licença

Uso livre.
Sinta-se à vontade para copiar, melhorar ou adaptar!
