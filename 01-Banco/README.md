# 🏦 Práctica: Simulador Bancario (ATM)

Ejercicio de simulación de un cajero automático simple en **Java**. El objetivo es gestionar cuentas bancarias utilizando un **Array de Objetos** con un tamaño fijo y aplicar validaciones lógicas de saldo.

## 📝 Descripción
El programa simula un banco con capacidad para **5 clientes**. Permite crear cuentas nuevas y, mediante un sistema de "login" con contraseña, acceder a un menú privado para realizar ingresos y retiradas de efectivo.

## 💡 Qué he practicado
En este proyecto he reforzado los siguientes conceptos:
* **Arrays de Objetos:** Gestión de un array estático `Cuenta[]` para almacenar las cuentas creadas.
* **Encapsulamiento:** Protección de los atributos de la clase `Cuenta` (`private`), permitiendo el acceso solo a través de métodos públicos.
* **Lógica de Validación:**
    * **Saldo:** En el método `retirar()`, se comprueba que la cantidad solicitada no sea mayor al saldo disponible.
    * **Límite de usuarios:** Control para no permitir crear más de 5 cuentas.
* **Búsqueda en Arrays:** Implementación de un algoritmo lineal para encontrar una cuenta basándose en su contraseña.

## 🚀 Funcionalidades

### 1. Gestión de Cuentas
* **Crear Cuenta:** Solicita nombre, apellidos, DNI, saldo inicial y una contraseña. Verifica antes si hay espacio en el banco (Máx. 5).
* **Acceso (Login):** Pide la contraseña para buscar la cuenta correspondiente en el array. Si existe, da acceso al menú de operaciones.

### 2. Operaciones Bancarias
Una vez logueado, el usuario puede:
* **Depositar:** Sumar dinero al saldo (solo cantidades positivas).
* **Retirar:** Restar dinero, asegurando que no se quede en números rojos.
* **Ver Saldo:** Muestra el dinero actual disponible.
* **Cerrar Sesión:** Vuelve al menú principal.

## 🛠️ Cómo ejecutarlo
Compila los archivos y ejecuta la clase principal `Banco`:

```bash
javac Cuenta.java Banco.java
java Banco