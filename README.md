# 💱 Conversor de Moeda - Java com ExchangeRate API

Este é um projeto de console em Java que realiza a conversão de moedas em tempo real utilizando a [ExchangeRate API](https://www.exchangerate-api.com/).

---

## 🚀 Funcionalidades

- Menu interativo em console
- Conversão entre:
  - Dólar ⇄ Peso argentino
  - Dólar ⇄ Real brasileiro
  - Dólar ⇄ Peso colombiano
- Busca automática da taxa de câmbio atual usando API externa
- Boas práticas de programação aplicadas (Clean Code)

---

## 🧰 Tecnologias utilizadas

- Java 17+
- Maven
- [ExchangeRate API](https://www.exchangerate-api.com/)
- Gson (para parse de JSON)
- Java HTTP Client (java.net.http)

---

## 🛠️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio


2. Adicione sua chave da ExchangeRate API
Cadastre-se em https://www.exchangerate-api.com e obtenha sua API KEY gratuita.

Depois, abra o arquivo:
src/main/java/org/example/ConversorMoeda.java
E substitua:

java
private static final String API_KEY = "SUA_API_KEY_AQUI";

3. Compile e execute com Maven

mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"
📂 Estrutura do projeto

📦 conversor-moeda/
 ┣ 📁 src/
 ┃ ┗ 📁 main/
 ┃   ┣ 📁 java/
 ┃   ┃ ┗ 📁 org/example/
 ┃   ┃   ┣ 📄 Main.java
 ┃   ┃   ┗ 📄 ConversorMoeda.java
 ┗ 📄 pom.xml
✨ Exemplos de uso

Escolha uma opção válida: 4
Você escolheu: Real brasileiro para Dólar
Digite o valor em Real brasileiro: 100
Valor convertido com sucesso: 100.00 BRL = 18.23 USD

🔒 Limitações
A API gratuita possui limite mensal de requisições.

Não há tratamento para indisponibilidade da internet.

Focado em moedas fixas por enquanto (mas pode ser facilmente expandido).

✅ Possíveis melhorias
Suporte a mais moedas (EUR, GBP, JPY, etc.)

Interface gráfica (JavaFX ou Swing)

Salvamento de histórico de conversões

Suporte a múltiplos idiomas


👨‍💻 Autor
Desenvolvido por Reginaldo de Lima Silva
