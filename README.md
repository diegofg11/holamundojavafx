# holamundojavafx

Este proyecto es una aplicación básica de JavaFX que muestra una ventana con el mensaje "Hola Mundo JavaFX!".

## Estructura del proyecto

- [`src/main/java/diegofg11/App.java`](src/main/java/diegofg11/App.java): Clase principal de la aplicación JavaFX.
- [`pom.xml`](pom.xml): Archivo de configuración de Maven con dependencias y plugins necesarios para JavaFX.
- `.vscode/`: Configuración para Visual Studio Code (tareas y lanzamiento).

## Requisitos

- Java 17 o superior
- Maven
- Visual Studio Code (opcional, pero recomendado para la configuración incluida)

## Cómo ejecutar

1. Instala las dependencias con Maven:
   ```sh
   mvn clean install
   ```

2. Ejecuta la aplicación JavaFX:
   ```sh
   mvn javafx:run
   ```

O bien, usa la tarea preconfigurada en VS Code llamada **Run JavaFX App**.

## Autor

- diegofg11

## Licencia

Este proyecto se distribuye
