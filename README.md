<h1 align="center">DSMeta
</h1>
<h3 align="center">Controle e Gerenciamento de vendas</h3>

  * [Sobre](#Sobre)
   
   * [Instalação](#instalacao)
       * [Pré-requisitos](#pre-requisitos)
       * [Instalando o Projeto na máquina](#instalando-o-projeto-na-maquina)
   

   * [Testes](#testes)
   * [Tecnologias](#tecnologias)

## Sobre
O projeto DSMeta tem como finalidade administrar uma sequência de dados como id, data, vendedor, visita, e total vendido de uma certa venda. A lógica desta aplicação é controlar quando a negociação aconteceu, quem foi o vendedor, e quanto foi vendido, além de que pode-se notificar quem foi o vendedor por meio de SMS.

Link do projeto hospedado: <https://app-dsmeta.netlify.app/> 


## Instalação
<h3>Pré-requisitos </h3>

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas para o frontend: NodeJs, Axios, Yarn e Npm;
Para o backend será necessário:
Git, OpenJDK, Spring Boot framework, maven para gerenciar as dependências e o POSTMAN para testar. 
Além disto é bom ter um editor para trabalhar com o código como VSCode.

## Instalando o Projeto na máquina
```bash
#Clone este repositório
$ git clone <git@github.com:KelytonSantos/dsmeta.git>
```

```bash
#FRONTEND
# entre na pasta do frontend deste projeto e instale as dependências
$ yarn  

#inicie o server com o comando
$ yarn dev

#O servidor ira iniciar na porta padrão 3000 acesse em: http://localhost:3000
```
```bash
#BACKEND
#Instale/atualize as dependências 
$ mvn compile

#Para iniciar o server é só clicar em run(Atalho VSCode Ctrl + F5)
```
```bash
#CONFIGURANDO O SERVIÇO DE MENSAGEM TWILIO
#É necessario ter a conta de teste no twilio

#Configure seus dados nos campos indicados por <> ou, ao iniciar o projeto configure variaveis de ambiente.

twilio.sid=<SID>
twilio.key=<TwilioKey>
twilio.phone.from=<numeroTwilio>
twilio.phone.to=<seuNumero>
```


## Testes
* O campo de vendas é um filtro de datas minima e maxima
<h1 align="center">
    <img alt="dsmeta" title="dsmeta" src="./img/dsmeta.gif" width="" height=""/><h1 align="left"><img src="./img/dsmetaI.jpeg" width="300" height="98" align="right"><img src="./img/dsmetaI1.jpeg" width="300" height="100"/></h1>  
</h1>
   


## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

Backend
- Spring MVC
- Spring Boot Framework
- Maven
- Java OpenJDK
- Spring Data JPA

Frontend
- NodeJs
- Axios
- Yarn
- Npm
- Twilio

<h1></h1>

### By Kelyton Santos
<a href="https://www.linkedin.com/in/kelyton-lucas-4a892a1b6/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> <a href = "mailto:kelytonlucas@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
