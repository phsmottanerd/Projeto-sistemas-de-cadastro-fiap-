# 📦 Sistema de Cadastro de Produtos - FIAP

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java" alt="Java 17+" />
  <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?style=for-the-badge&logo=intellijidea" alt="IntelliJ" />
  <img src="https://img.shields.io/badge/Nível-Iniciante-green?style=for-the-badge" alt="Nível Iniciante" />
</p>

> Projeto desenvolvido durante o curso **Java Development (60h)** da **FIAP** 🎓  
> Um sistema simples de **cadastro de produtos**, aplicando os fundamentos de **POO com Java**, sem uso de frameworks externos.

---

## 🚀 Funcionalidades

✅ Cadastro de produtos com:  
- 📝 Nome  
- 🧾 Descrição  
- 💰 Preço  
- 📅 Data de cadastro  
- 🗂️ Categoria  

✅ Lista de **categorias pré-definidas**  
✅ Busca por categoria por:
- 🔎 ID  
- 🔠 Nome  

---

## 🧠 Conceitos de Programação Orientada a Objetos

📚 Neste projeto foram aplicados diversos conceitos fundamentais:

- 🔒 **Encapsulamento**
- 🔁 Getters e Setters no estilo *Fluent* (encadeamento)
- 🔄 Sobrescrita de métodos: `toString`, `equals`, `hashCode`
- 📋 Uso de listas: `List`, `ArrayList`
- 🔍 Filtros com `Streams` e `filter`
- 📦 Organização em pacotes
- 🧱 Separação por camadas simples: `model`, `repository`, `main`

---

## 🛠 Tecnologias Utilizadas

| Ferramenta        | Descrição                              |
|-------------------|------------------------------------------|
| ☕ Java 17+        | Linguagem principal                      |
| 🛠 JDK Padrão      | Sem bibliotecas externas ou frameworks   |
| 💡 IntelliJ IDEA  | IDE utilizada no desenvolvimento         |

---

## 📁 Estrutura de Pacotes

```bash
src/
├── br.com.fiap.model/         # 📦 Classes de domínio (Produto, Categoria)
├── br.com.fiap.produtosrepository/  # 🗃️ Repositórios (em memória)
├── br.com.fiap.app/           # 🚀 Classe principal de execução
