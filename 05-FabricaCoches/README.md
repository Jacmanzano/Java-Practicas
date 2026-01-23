# 🚗 Práctica: Fábrica de Coches

Aplicación de escritorio en **Java** que simula la gestión de una fábrica de automóviles y un concesionario. Este ejercicio se centra en la interacción visual mediante ventanas (`JOptionPane`) y la creación flexible de objetos.

## 📝 Descripción
El programa permite gestionar una flota limitada de **5 vehículos** (definido en la constante `MAX_COCHES`). El usuario interactúa con un menú gráfico para fabricar coches con distintas especificaciones, modificarlos ("tunearlos") y controlar su kilometraje.

A diferencia de los ejercicios de consola, aquí toda la entrada y salida de datos se realiza mediante cuadros de diálogo del sistema.

## 💡 Qué he practicado
* **Sobrecarga de Constructores:** La clase `Coche` tiene **4 constructores diferentes**, lo que permite instanciar un vehículo de múltiples formas (por matrícula, por plazas, por marca o vacío).
* **Sobrecarga de Métodos:** El método `tunear()` está sobrecargado; se puede llamar sin parámetros (solo pone techo solar) o con parámetros (cambia color y pone techo).
* **Librería Swing (`JOptionPane`):** Uso de `showInputDialog` para pedir datos y `showMessageDialog` para mostrar alertas, en lugar de usar `Scanner`.
* **Arrays Estáticos:** Gestión de un array `Coche[]` de tamaño fijo para almacenar el stock.
* **Métodos Estáticos vs Instancia:** Uso de métodos `static` en la clase principal para lógica auxiliar (`matAleatoria`, `buscaCoche`) frente a los métodos de objeto (`avanzar`, `tunear`).

## 🚀 Funcionalidades

### 1. Fabricación (Altas)
El menú permite crear coches usando diferentes niveles de detalle:
* **Completo:** Especificando Marca, Modelo y Color.
* **Técnico:** Especificando nº de Puertas y Plazas (con validación de límites).
* **Básico:** Solo matrícula.
* **Por defecto:** Crea un "Seat Altea" genérico con matrícula aleatoria.

### 2. Tuning (Modificación)
Permite modificar un coche existente buscándolo por matrícula:
* **Pintura:** Cambia el color del coche.
* **Techo Solar:** Instala techo solar si no lo tenía.
* **Efecto:** Al tunear, el contador de kilómetros se resetea a 0 automáticamente.

### 3. Simulación y Consultas
* **Avanzar:** Suma kilómetros al coche seleccionado.
* **Mostrar Características:** Busca un coche por matrícula y muestra una ficha técnica detallada en una ventana emergente.

## 🛠️ Cómo ejecutarlo
Compila los archivos y ejecuta la clase principal `Fabrica`:

```bash
javac Coche.java Fabrica.java
java Fabrica