# Redis com Spring Boot

- [Redis com Spring Boot](#redis-com-spring-boot)
- [Requisitos](#requisitos)
- [Objetivo](#objetivo)
- [O que é Apache kafka?](#o-que---apache-kafka-?-)
    * [Broker](#como-integrar-o-redis-com-spring)
        + [Iniciar instância Redis local](#iniciar-inst-ncia-redis-local)
        + [Parâmetros de acesso](#par-metros-de-acesso)
        + [Configuração na aplicação](#configura--o-na-aplica--o)
        + [Ativar cache em método](#ativar-cache-em-m-todo)
    * [Rodando o tutorial](#rodando-o-tutorial)


# Requisitos
- Docker instalado na máquina

# Objetivo
 O objetivo deste tutorial é trazer conceitos importantes acerca de kafka, e uma demonstração simples da sua utilização.

# O que é Apache kafka?
  O Apache Kafka é uma plataforma de software de código fonte aberto para processamento de fluxo de mensagens escrita em Scala com Java. Kafka foi criado como uma solução interna de infra-estrutura na LinkedIn para lidar com os dados como um fluxo contínuo e crescente de informação para aplicações.

  Um cluster Kafka é não só altamente escalável e tolerante a falhas, mas ele também tem uma taxa de transferência muito mais alta comparada com outros message brokers. O Kafka funciona como um **cluster de brokers** e isso permite configurações interessantes de disponibilidade, o que atrai a grandes empresas com sistemas críticos.
  