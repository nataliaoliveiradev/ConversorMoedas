# <h1 align="center">Conversor de Moedas</h1>

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
</p>

---

## <h2 align="center">Descrição do Projeto</h2>

O **Conversor de Moedas** é um programa desenvolvido em Java que realiza a conversão de valores entre diferentes moedas utilizando taxas de câmbio dinâmicas obtidas em tempo real através da API [ExchangeRate Host](https://exchangerate.host/). O objetivo deste projeto é demonstrar habilidades em Java, consumo de APIs e manipulação de dados JSON.

---

## <h2 align="center">Índice</h2>

* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionalidades](#funcionalidades)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Pré-requisitos](#pré-requisitos)
* [Como Executar o Projeto](#como-executar-o-projeto)
* [Autor](#autor)

---

## <h2 align="center">Funcionalidades</h2>

🔨 Funcionalidades do projeto:

- Conversão de moedas em tempo real entre 6 opções:
  - USD para BRL
  - BRL para USD
  - USD para ARS
  - ARS para USD
  - USD para CLP
  - CLP para USD
- Busca automática de taxas de câmbio atualizadas através da API.
- Validação de dados do usuário.

---

## <h2 align="center">Tecnologias Utilizadas</h2>

- **Linguagem de Programação:**  
![Java](https://img.shields.io/badge/java-000.svg?style=for-the-badge&logo=openjdk&logoColor=%23ED8B00)

- **Bibliotecas:**  
![Gson](https://img.shields.io/badge/Gson-000?style=for-the-badge&logo=java&logoColor=red)

- **IDE Utilizada:**  
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000?style=for-the-badge&logo=intellijidea)

---

## <h2 align="center">Pré-requisitos</h2>

Antes de começar, certifique-se de ter os seguintes itens instalados no seu ambiente:

- **Java JDK** 11 ou superior.  
- **Biblioteca Gson** para manipulação de JSON.  
- **IntelliJ IDEA** (opcional, mas recomendado).  

---

## <h2 align="center">Como Executar o Projeto</h2>

### 📁 Acesso ao projeto

Clone o repositório com o comando:

```bash
git clone https://github.com/nataliaoliveiradev/conversor-moedas.git
```

### 🛠️ Abrir e rodar o projeto

1. Abra o projeto no IntelliJ IDEA ou qualquer IDE de sua preferência.  
2. Certifique-se de que o arquivo `.jar` da biblioteca Gson está configurado como dependência do projeto.  
3. Substitua a URL da API pelo link com sua chave de acesso:  
   ```java
   private static final String URL_API = "http://api.exchangerate.host/live?access_key=SUA_CHAVE_API";
   ```
4. Compile e execute o arquivo `Main.java`.  
5. Escolha uma das opções no menu e insira o valor a ser convertido.  

---

## <h2 align="center">Autor</h2>

<div align="center">

| [<img src="https://avatars.githubusercontent.com/u/172914574?v=4" width=115><br><sub>Natalia Oliveira</sub>](https://github.com/nataliaoliveiradev) |
| :---: |
| **Bacharel em Direito, estudante de Ciência da Computação e futura dev fullstack.** |

</div>

---

## <h2 align="center">Contato</h2>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-000?style=for-the-badge&logo=linkedin&logoColor=ff6e96)](https://www.linkedin.com/in/nataliaoliveiradev/)  
[![GitHub](https://img
