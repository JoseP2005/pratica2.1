# Proyecto de Aproximación de Pi

Este proyecto es una aplicación simple que utiliza el método de Monte Carlo para aproximar el valor de Pi.

## Instrucciones de Uso

1. **Compilación**: Para compilar el proyecto, ejecuta el siguiente comando en la terminal:

    ```bash
    make compilar
    ```

   Esto compilará el código fuente y generará los archivos de clase en el directorio `bin`.

2. **Ejecución**: Una vez compilado, puedes ejecutar la aplicación con el siguiente comando:

    ```bash
    make ejecutar
    ```

   Esto ejecutará la aplicación y te pedirá que ingreses el número de puntos a utilizar para aproximar Pi.

3. **Limpieza**: Para limpiar los archivos generados durante la compilación, puedes usar el siguiente comando:

    ```bash
    make limpiar
    ```

   Esto eliminará los archivos de clase y otros archivos generados.

4. **Documentación**: Si deseas generar la documentación Javadoc para el proyecto, puedes usar el siguiente comando:

    ```bash
    make javadoc
    ```

   Esto generará la documentación en formato HTML en el directorio `html`.

## Dependencias

El proyecto no tiene dependencias externas más allá del JDK de Java.

## Estructura del Proyecto

- **src**: Contiene los archivos fuente de la aplicación.
- **bin**: Directorio donde se almacenan los archivos de clase generados durante la compilación.
- **lib**: Directorio para las bibliotecas externas (si las hubiera).
- **html**: Directorio donde se generará la documentación Javadoc.
