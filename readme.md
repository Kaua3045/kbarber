# KBarber

Projeto utilizado para cadastrar clientes e barbeiros, gerenciar marcações de horário dos clientes entre outras coisas.

[![CI Pipeline for Push to Develop](https://github.com/Kaua3045/kbarber/actions/workflows/ci-push-develop.yml/badge.svg?branch=develop)](https://github.com/kaua3045/kbarber/actions/workflows/ci-push-develop.yml)

# Índice

- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Principais endpoints](#principais-endpoints)
- [Documentação](docs/documentation.md)
- [Contribuição](docs/CONTRIBUTING.md)
- [Roadmap](docs/roadmap.md)
- [Changelog](docs/changelog.md)

## Requisitos

- Tecnologias Utilizadas:
  - Java
  - Spring
  - MySQL
  - Flyway
  - docker
  - Swagger
  - Gradle
  - Github Actions

## Principais endpoints

- Todos os endpoints estão documentados no swagger, para acessar a documentação basta acessar a url do serviço e adicionar `api/swagger-ui/index.html` no final.

## Instalação

- Pré-requisitos:
    - Java JDK 21 ou superior.
    - Docker com docker-compose

- Clone o projeto
```bash
  git clone https://github.com/kaua3045/kbarber.git
```

- Entre no diretório do projeto
```bash
  cd kbarber
```

- Agora abra esse projeto em alguma idea ou então Instale as dependências
```bash
./gradlew --refresh-dependencies
```

- Rode o projeto e o docker-compose
```bash
docker-compose -f docker-compose-dev.yml up -d
./gradlew bootRun
```