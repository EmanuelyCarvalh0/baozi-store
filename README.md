# Baozi Store – API REST

API REST da Baozi Store (loja de pão chinês) para controle de clientes, produtos e pedidos.
Trabalho da disciplina Desenvolvimento Web Back-End – UNINTER.

**Tecnologias:** Java 17, Spring Boot 3, Spring Data JPA, MySQL.

## Como executar

1. Ter o MySQL rodando em `localhost:3306` (o banco `baozi_store` é criado automaticamente).
2. Ajustar usuário/senha em `src/main/resources/application.properties` (padrão `root`/`root`)
   ou usar as variáveis de ambiente `DB_USER` e `DB_PASSWORD`.
3. Executar `mvn spring-boot:run` (ou rodar `BaoziStoreApplication` pela IDE).

A API sobe em `http://localhost:8080`.

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| POST | /clientes | Cadastra cliente |
| GET | /clientes | Lista clientes |
| GET | /clientes/{id} | Consulta cliente |
| PUT | /clientes/{id} | Atualiza cliente |
| DELETE | /clientes/{id} | Apaga cliente |
| POST | /produtos | Cadastra produto |
| GET | /produtos | Lista produtos |
| GET | /produtos/{id} | Consulta produto |
| PUT | /produtos/{id} | Atualiza produto |
| DELETE | /produtos/{id} | Apaga produto |
| POST | /pedidos | Registra pedido |
| GET | /pedidos | Lista pedidos |
| GET | /pedidos/{id} | Consulta pedido |
| PUT | /pedidos/{id} | Atualiza pedido |
| DELETE | /pedidos/{id} | Apaga pedido |

## Exemplos de JSON

```json
POST /clientes  { "nome": "Emanuely4593104", "clienteDesde": "2026-10-05" }
POST /produtos  { "nome": "Baozi de Porco Tradicional", "preco": 7.50, "estoque": true }
POST /pedidos   { "clienteId": 1, "produtoId": 1, "quantidade": 6 }
```
