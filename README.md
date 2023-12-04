# Projeto Spring Boot de Serviço de Envio de Email com RabbitMQ

Este é um projeto Spring Boot que implementa um serviço de envio de email utilizando RabbitMQ. O projeto foi arquitetado como um microserviço para proporcionar modularidade e escalabilidade.

## Tecnologias Utilizadas

- Spring Boot
- RabbitMQ
- Java Mail Sender

## Pré-requisitos

- Java 8 ou superior
- Maven

## Configuração do RabbitMQ

Certifique-se de ter o RabbitMQ instalado e configurado corretamente. As informações de configuração podem ser encontradas no arquivo `application.properties`. Certifique-se de ajustar as configurações de acordo com o seu ambiente.

```properties
# Configurações do RabbitMQ
spring.rabbitmq.addresses=seu_addresses
spring.rabbitmq.queue=sua_queue
```

## Configuração do Serviço de Envio de Email

As configurações relacionadas ao serviço de envio de email podem ser encontradas no arquivo `application.properties`. Configure as informações do servidor de email que você deseja utilizar.

```properties
spring.mail.host=smtp.exemplo.com
spring.mail.port=587
spring.mail.username=seu-usuario
spring.mail.password=sua-senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

## Como Executar o Projeto

1. Clone o repositório: 
   ```bash
   git clone https://github.com/TheusmaOliver/email-service-rabbitmq.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd email-service-rabbitmq
   ```

3. Execute o projeto usando o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

## Endpoints

O serviço expõe os seguintes endpoints:

- **POST /api/email/send**: Envie um email utilizando o corpo da requisição para especificar destinatário, assunto, e corpo do email.

Exemplo de requisição:

```json
{
  "to": "destinatario@example.com",
  "subject": "Assunto do Email",
  "body": "Corpo do Email"
}
```


## Autor
  
 <img style="border-radius: 50%;" src="https://avatars3.githubusercontent.com/u/81190214?s=460&u=61b426b901b8fe02e12019b1fdb67bf0072d4f00&v=4" width="100px;" alt="Avatar"/>
 <br />
 <b width="36px">Matheus Rodrigues 🚀</b>


Feito com ❤️ por Matheus Rodrigues 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Matheus-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/theusmaoliver/)](https://www.linkedin.com/in/theusmaoliver/) 
[![Gmail Badge](https://img.shields.io/badge/-matheusrodriguesoliveira273@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:matheusrodriguesoliveira273@gmail.com)](mailto:matheusrodriguesoliveira273@gmail.com)
