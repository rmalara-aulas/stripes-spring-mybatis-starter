# Starter

## Requisitos e recomendações

- JDK 11 ou 13 - esse projeto nao foi testado com versoes superiores, mas deve funcionar
- IntelliJ
- MySQL


## Instale o software necessário
1 - Baixe e instale a JDK.

Configure a variável JAVA_HOME para que o sistema operacional saiba onde a JDK foi instalada.
https://www.youtube.com/watch?v=_RlftGYiAn8

2 - Installe o MySQL
Use o instalador `mysql.msi` com a versao 5.7. Embora seja antiga é simples e leve.

Durante a instalação vai ser solicitada a senha do usuário root. Digite 1234.

3 - Baixe e instale o IntelliJ
Pode ser a versão Community mesmo

5 - Abra o projeto no IntelliJ

![Abrir projeto 1](https://i.imgur.com/OcspGsn.png)

![Abrir projeto 2](https://i.imgur.com/x44DhVe.png)
Aguarde alguns minutos para o IntelliJ importar as bibliotecas (dependencias) necessarias

6 - Crie o database e a tabela no MySQL

![Abrir script](https://i.imgur.com/gPJQfFL.png)

![Abrir MySql client](https://i.imgur.com/1Ffhsp8.png)

![Executar o script](https://i.imgur.com/Sz0DbdH.png)

7 - Executar o projeto

Usando o Gradle, inicialize o projeto

![inicializar](https://i.imgur.com/sxEFM48.png)

Se a inicialização funcionou você deve ver o log assim

![Log](https://i.imgur.com/ykb9lcc.png)

### Resolução de problemas

Caso o tomcat nao inicialize, procure os processos da Open JDK e finalize eles.

![Erro de inicializacao do tomcat](https://i.imgur.com/NgdbsLQ.png)
