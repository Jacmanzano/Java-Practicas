# ☕ Portafolio de Prácticas - Java

Bienvenido a mi repositorio personal de ejercicios de programación. Aquí documento mi progreso en **Java** y **Programación Orientada a Objetos (POO)**, abarcando desde lógica básica hasta estructuras de datos dinámicas.

## 🗂️ Índice de Ejercicios

| ID | Práctica | Descripción | Conceptos Clave |
| :--- | :--- | :--- | :--- |
| 01 | 🚗 [**Fábrica de Coches**](./05-FabricaCoches) | Gestión visual de stock de vehículos con límite de fabricación. | `Array estático`, `JOptionPane`, `Sobrecarga`. |
| 02 | 🏀 [**Liga de Basket**](./04-LigaBasket) | Gestión de jugadores y árbitros en una misma lista. | `Polimorfismo`, `instanceof`, `Casting`. |
| 03 | 🎰 [**Lotería Primitiva**](./03-Loteria) | Simulación automática de sorteos y comprobación de apuestas y premios. | `Random`, `Lógica de comparación`, `Objetos como parámetros`. |
| 04 | 🎓 [**Gestión de Alumnos**](./02-GestionAlumnos) | Sistema CRUD (Altas, Bajas y Consultas) de alumnos. | `ArrayList`, `Try-Catch`, `Búsqueda por ID`. |
| 05 | 🏦 [**Banco Simple**](./01-Banco) | Simulador de cajero con autenticación y gestión de saldo. | `Array de Objetos`, `Login/Seguridad`, `Validaciones`. |

## 📚 Detalles de las Prácticas

### 1. Fábrica de Coches
Sistema que simula un concesionario. Permite crear coches con distintas configuraciones (constructores) y almacenarlos en un **Array estático**.
* **Destacado:** Uso de `JOptionPane` para ventanas emergentes en lugar de consola.

### 2. Liga de Basket
Ejercicio enfocado en la herencia y polimorfismo, almacenando distintos tipos de personas (Jugadores y Árbitros) en una lista común (`ArrayList<Object>`).
* **Destacado:** Cálculo del jugador con más **dribling** mediante iteración y casting de objetos.

### 3. Lotería (Simulación)
Programa que genera una combinación ganadora y simula múltiples apuestas aleatorias para comprobar cuántos aciertos y premios se obtienen.
* **Destacado:** Uso intensivo de `java.util.Random` y comparación de listas (`contains`) para verificar aciertos.

### 4. Gestión de Alumnos (CRUD)
Aplicación completa de consola para gestionar un grupo escolar. Permite dar de alta (validando que no se repita el NIA), dar de baja y buscar alumnos.
* **Destacado:** Uso de **`ArrayList<Alumnos>`** para una lista dinámica y manejo de excepciones (`try-catch`) para evitar errores al introducir la edad.

### 5. Banco
Simulador bancario limitado a 5 cuentas. Incluye un sistema de seguridad donde es necesario introducir la contraseña correcta para operar (depositar/retirar).
* **Destacado:** Lógica de validación de saldo (no se puede retirar más de lo que se tiene) y búsqueda de objetos por atributo (contraseña).

## 🛠️ Tecnologías y Herramientas
* **Lenguaje:** Java (JDK 8+)
* **Entrada de datos:** `Scanner` (Consola) y `JOptionPane` (Gráfico simple).
* **Estructuras de datos:** Arrays fijos (`[]`) y Listas dinámicas (`ArrayList`).

---
**Autor:** Carlos Manzano Regalado
**Curso:** 1º DAM
