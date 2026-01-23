# 🎓 Práctica: Gestión de Alumnos (CRUD)

Sistema de gestión escolar desarrollado en **Java**. Esta práctica se centra en la administración de datos (Altas, Bajas y Consultas) utilizando colecciones dinámicas en lugar de arrays fijos, permitiendo gestionar un número indeterminado de alumnos.

## 📝 Descripción
El programa permite registrar alumnos con sus datos personales (NIA, nombre, apellidos, edad, grupo, teléfono). A diferencia de los ejercicios anteriores, aquí no hay un límite de espacio, ya que se utiliza un `ArrayList`.

El sistema incluye validaciones de entrada para evitar errores (como meter letras en la edad) y comprueba que no se repitan los identificadores (NIA).

## 💡 Qué he practicado
En este proyecto he implementado conceptos clave para aplicaciones de gestión:
* **Colecciones Dinámicas:** Uso de `ArrayList<Alumnos>` para añadir y eliminar elementos libremente.
* **Manejo de Excepciones:** Implementación de bloques `try-catch` para capturar `NumberFormatException` y evitar que el programa se cierre si el usuario escribe texto donde va un número.
* **Lógica CRUD:**
    * **C**reate (Alta): Añadir objetos a la lista.
    * **R**ead (Consultas): Buscar y filtrar datos.
    * **D**elete (Baja): Eliminar objetos de la lista.
* **Validación de Datos:** Algoritmo para verificar si un NIA ya existe antes de crear un alumno nuevo.

## 🚀 Funcionalidades

### 1. Gestión de Altas
* Permite registrar un nuevo alumno pidiendo todos sus datos.
* **Control de duplicados:** Si intentas registrar un NIA que ya existe, el sistema muestra un error y cancela la operación.
* **Control de errores:** Si al introducir la edad se escribe algo inválido, el programa lo detecta y vuelve a pedir el dato.

### 2. Bajas (Eliminación)
* Busca al alumno por su NIA.
* **Confirmación de seguridad:** Antes de borrar, muestra los datos del alumno y pregunta `¿Está seguro de borrar este alumno? (s/n)` para evitar borrados accidentales.

### 3. Consultas y Búsquedas
El menú de consultas ofrece dos formas de buscar información:
* **Por NIA:** Busca un alumno específico (clave única).
* **Por Edad:** Filtra y muestra **todos** los alumnos que tengan la edad introducida.

## 🛠️ Cómo ejecutarlo
Compila los archivos y ejecuta la clase principal `GestionAlumnos`:

```bash
javac Alumnos.java GestionAlumnos.java
java GestionAlumnos