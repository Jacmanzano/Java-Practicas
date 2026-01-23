# 🎰 Práctica: Lotería Primitiva (Simulación)

Programa en **Java** que simula el funcionamiento de un sorteo de lotería. A diferencia de otros ejercicios, este programa no requiere interacción del usuario; genera automáticamente una combinación ganadora y realiza múltiples apuestas aleatorias para comprobar la probabilidad de premio.

## 📝 Descripción
El sistema consta de una clase principal (`Administracion`) que gestiona el sorteo. Se genera una combinación ganadora de 5 números (del 1 al 49) más un reintegro. Posteriormente, se simulan 10 apuestas aleatorias y el sistema comprueba automáticamente cuántos aciertos tiene cada una y cuánto dinero ha ganado.

## 💡 Qué he practicado
En este proyecto me he enfocado en la lógica de algoritmos y manejo de listas:
* **Clase `Random`:** Generación de números aleatorios para crear tanto la combinación ganadora como las apuestas.
* **Lógica de Listas (`ArrayList`):**
    * **Evitar duplicados:** Uso del método `.contains()` al generar los números para asegurar que no se repita el mismo número en un boleto.
    * **Comprobación de premios:** Uso de `.contains()` para verificar si un número de la apuesta está presente en la lista ganadora.
* **Objetos como Parámetros:** Paso de objetos completos (`Sorteo` y `Apuesta`) a los métodos de validación para mantener el código organizado.
* **Variables Estáticas:** Uso de contadores `static` para llevar el registro global de premios (aciertos de 3, 4, 5 números) en toda la ejecución.

## 🚀 Funcionalidades

### 1. Generación del Sorteo
* El sistema crea un objeto `Sorteo` y llena su lista con 5 números únicos aleatorios entre el 1 y el 49, además de un número de reintegro (0-9).

### 2. Simulación de Apuestas
* Se genera un bucle de 10 iteraciones (configurable). En cada vuelta, se crea una `Apuesta` con su propia combinación aleatoria.

### 3. Escrutinio (Comprobar Premios)
El método `comprobarApuesta` compara la lista de la apuesta con la del sorteo y asigna premios según las reglas:
* **Reintegro:** Si coincide el número complementario (+1€).
* **3 Aciertos:** Premio menor (+4€).
* **4 Aciertos:** Premio medio (+500€).
* **5 Aciertos:** Premio mayor (+400.000€).

## 🛠️ Cómo ejecutarlo
Compila todos los archivos y ejecuta la clase principal `Administracion`:

```bash
javac Sorteo.java Apuesta.java Premio.java Administracion.java
java Administracion