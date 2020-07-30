# Starter - Projeto para conhecer as tecnologias do sistema

## Requisitos e recomendações

- [Open JDK 11](https://github.com/AdoptOpenJDK/openjdk11-binaries/releases/download/jdk-11.0.8%2B10/OpenJDK11U-jdk_x64_linux_hotspot_11.0.8_10.tar.gz)
- [Eclipe 2019-12](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-ide-enterprise-java-developers)
- [Lombok](https://projectlombok.org/downloads/lombok.jar)
- [TomCat 9.0.30](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.30/bin/apache-tomcat-9.0.30.zip)

## Passo a passo
Certifique-se que a variavel de ambiente JAVA_HOME esteja com o Java 11 e que o projeto esteja clonado corretamente em seu workspace e veja tambem se os plugins como o Lombok, BuildShip e editorConfig estejam instalados em seu eclipse
1. Através do terminal, acesse o diretório raiz do projeto `/starter` e execute:
    ```./gradlew build```

2. Tenha certeza que a menssagem `build successful` tenha aparecido e abra o eclipse.

3. Importe o projeto

<img src="https://i.imgur.com/ELOCwXN.png" />

4. Selecione `Existing Gradle Project` e configure para o seu diretório do projeto dentro do workspace.

5. Certifique que a importação ocorreu com sucesso, vá até a pasta onde seu projeto está (Por padrão é a pasta workspace)
e coloque o TomCat dentro da mesma
    - workspace
        - starter
        - apache-tomcat-9.0.30 (Obs mantenha o nome original da pasta do tomcat)

6. Dentro do eclipse crie um novo `server` e selecione o tomcat 9.0, utilizando como base o tomcat
dentro do seu workspace (pasta) e adicione o projeto `starter` no server.

7. Com a criação do server finalizada, basta inicializa-lo =)

