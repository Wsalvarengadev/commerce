# DSCommerce 🛒

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![WIP](https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow?style=for-the-badge)

## 📌 Sobre o projeto

O **DSCommerce** é um sistema completo de e-commerce que está sendo desenvolvido como parte da formação da escola **DevSuperior**.

O objetivo principal deste projeto é criar um sistema com um modelo de domínio abrangente, explorando relacionamentos complexos entre entidades (um-para-muitos, muitos-para-muitos), além de implementar as principais funcionalidades esperadas de um profissional no mercado.

O sistema gerencia desde o catálogo de produtos e usuários até o fluxo de carrinho de compras e processamento de pedidos.

## 🎨 Layout e Prototipagem

O layout da aplicação foi desenhado no Figma e serve como guia para o desenvolvimento do front-end e estrutura da API.
- **Protótipo:** [Link para o Figma](https://www.figma.com/file/ZrGNVNG0kZL6txDv4G8P6s/DSCommerce)

## 💻 Modelo Conceitual

O domínio da aplicação foi modelado para atender aos seguintes requisitos e entidades:

* **User:** Possui perfis de acesso (Cliente/Admin).
* **Product:** Contém nome, descrição, preço e imagem. Pode pertencer a várias categorias.
* **Category:** Classificação dos produtos.
* **Order:** O pedido, que passa por vários status (Aguardando pagamento, Pago, Enviado, Entregue, Cancelado).
* **OrderItem:** Armazena o produto e a quantidade no momento da compra, preservando o preço histórico.
* **Payment:** Registro do pagamento do pedido (relacionamento 1 para 1 com o Pedido).

## 🚀 Funcionalidades (Roadmap)

Este projeto está em desenvolvimento constante. Abaixo, as funcionalidades planejadas com base nos requisitos:

### Área Pública / Cliente
- [ ] **Consultar Catálogo:** Listagem paginada de produtos com busca por nome.
- [ ] **Detalhes do Produto:** Visualização das informações de um produto específico.
- [ ] **Gerenciar Carrinho:** Adicionar/remover itens e alterar quantidades.
- [ ] **Registrar Pedido:** Salvar o pedido com status "Aguardando Pagamento".
- [ ] **Sign Up / Login:** Cadastro de novos usuários e autenticação.

### Área Administrativa (Admin)
- [ ] **CRUD de Produtos:** Manter cadastro completo de produtos.
- [ ] **CRUD de Categorias:** Gerenciamento das categorias do sistema.
- [ ] **CRUD de Usuários:** Gestão de clientes e administradores.
- [ ] **Relatórios:** Visualização de vendas e pagamentos.

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **JPA / Hibernate** (Para implementação do ORM e integridade referencial)
- **H2 Database** (Banco de dados em memória para testes)
- **Maven**
## 📂 Como executar o projeto

```bash
# Clone este repositório
git clone [https://github.com/Wsalvarengadev/commerce.git](https://github.com/Wsalvarengadev/commerce.git)

# Entre na pasta do projeto
cd commerce

# Execute a aplicação
./mvnw spring-boot:run
```

## 👨‍💻 Author
**Wesley Alvarenga**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wesley-alvarenga-400215135/)
