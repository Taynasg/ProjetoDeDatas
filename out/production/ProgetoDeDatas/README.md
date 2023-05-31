# Projeto de Manipulação de Datas em Java

Este é um projeto Java que demonstra a manipulação de datas usando a linguagem de programação Java. Ele fornece exemplos e funcionalidades para trabalhar com datas, calcular diferenças entre datas, verificar feriados e muito mais.

## Funcionalidades

- Conversão de datas para diferentes formatos.
- Cálculo de diferenças de dias, meses e anos entre duas datas.
- Verificação de feriados nacionais.
- Exibição de datas formatadas.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.
- IntelliJ IDEA (ou qualquer outra IDE Java) para importar e executar o projeto.

## Como usar

1. Clone o repositório para o seu ambiente local:

git clone https://github.com/seu-usuario/nome-do-projeto.git

2. Abra o projeto no IntelliJ IDEA (ou na sua IDE Java preferida).

3. Navegue até a classe principal `Main.java` e execute o programa.

4. Siga as instruções fornecidas pelo programa para testar as diferentes funcionalidades de manipulação de datas.

## Exemplos de Uso

### Conversão de Data
LocalDate data = LocalDate.now();
String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
System.out.println("Data formatada: " + dataFormatada);
