# Platzi Market

Este proyecto es una API REST de ejemplo para un mercado, desarrollada en Java con Spring Boot y utilizando PostgreSQL como base de datos.

## Estructura del Proyecto

- **src/main/java/com/platzi/market/**: Código fuente principal.
  - **domain/**: Lógica de negocio y modelos de dominio.
  - **persistence/**: Acceso a datos y entidades JPA.
  - **web/controller/**: Controladores REST.
- **src/main/resources/**: Archivos de configuración y recursos estáticos.
- **postgresql/**: Archivos relacionados con la base de datos (schema.sql, data.sql, docker-compose.yml).

## Requisitos

- Java 17+
- Gradle
- Docker (opcional, para base de datos)

## Configuración de la Base de Datos

Puedes levantar una instancia de PostgreSQL usando Docker:

```bash
docker-compose -f postgresql/docker-compose.yml up -d
```

Esto creará la base de datos y aplicará el esquema definido en `schema.sql`.

## Ejecución del Proyecto

1. Clona el repositorio.
2. Configura las variables de conexión a la base de datos en `src/main/resources/application.properties` o `application-dev.properties`.
3. Compila y ejecuta la aplicación:

```bash
./gradlew bootRun
```

La API estará disponible en `http://localhost:8080`.

## Endpoints de Ejemplo

- `/hola` — Endpoint de prueba.

## Licencia

Este proyecto es solo para fines educativos.

