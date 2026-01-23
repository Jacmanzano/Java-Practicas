# 🏀 Práctica: Liga de Basket

Pequeña aplicación de consola para gestionar participantes de una liga deportiva. El objetivo principal de este ejercicio es practicar el uso de **Colecciones (`ArrayList`)** para almacenar diferentes tipos de objetos en una misma lista y saber diferenciarlos posteriormente.

## 📝 Descripción
El programa permite dar de alta tanto **Jugadores** como **Árbitros** y guardarlos en una única lista de tipo `Object`. A través de un menú de texto, se pueden realizar inserciones, filtrados por tipo de participante y cálculos estadísticos sobre los atributos específicos de los jugadores.

## 💡 Qué he practicado
En este código he trabajado conceptos de POO y manejo de tipos:
* **ArrayList Polimórfico:** Uso de `ArrayList<Object>` para guardar clases distintas (`Jugador` y `Arbitro`) en la misma estructura de datos.
* **Operador `instanceof`:** Utilizado para comprobar si un objeto genérico de la lista es realmente un `Jugador` antes de intentar acceder a sus datos.
* **Casting de Objetos:** Conversión explícita `(Jugador) obj` para poder llamar a métodos propios como `.getDribling()`, que no existen en la clase genérica `Object`.
* **Generación Aleatoria:** Asignación automática de estadísticas (velocidad, acierto, dribling) mediante `Math.random()` al momento de crear los objetos.

## 🚀 Funcionalidades

### 1. Gestión de Altas
* **Insertar Jugador:** Pide nombre y posición. Genera automáticamente valores aleatorios (0-100) para **velocidad** y **dribling**.
* **Insertar Árbitro:** Pide nombre y colegio. Genera automáticamente valores aleatorios (0-100) para **velocidad** y **acierto**.

### 2. Listados y Filtros
* **Mostrar Todo:** Recorre la lista completa e imprime la información de todos los participantes usando el método `.toString()`.
* **Mostrar solo Jugadores:** Filtra la lista utilizando `instanceof` para ignorar a los árbitros y mostrar solo a los jugadores.

### 3. Estadísticas
* **Jugador con más Dribling:** Algoritmo que recorre la lista, hace el casting a `Jugador` y compara los valores para encontrar al que tiene la estadística de manejo de balón más alta.

## 🛠️ Cómo ejecutarlo
Compila las tres clases y ejecuta la clase principal `Liga`:

```bash
javac Arbitro.java Jugador.java Liga.java
java Liga