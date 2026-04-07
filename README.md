# 🧮 Calculadora JavaFX - Taller 1

<img width="974" height="740" alt="image" src="https://github.com/user-attachments/assets/f265e2e5-1c00-4653-8831-548762c2c38c" />

Una aplicación de escritorio moderna construida con **JavaFX**, siguiendo el patrón de diseño **MVC (Modelo-Vista-Controlador)**. Esta calculadora realiza operaciones básicas con una interfaz intuitiva en **Modo Oscuro**.

## 🚀 Características
* **Diseño Profesional:** Interfaz limpia en modo oscuro con una paleta de colores contrastada.
* **Arquitectura MVC:** Separación clara entre la lógica de negocio y la interfaz de usuario.
* **Validación básica:** Manejo de división por cero.
* **Botón Limpiar:** Restablece los campos y el resultado rápidamente.

## 🛠️ Tecnologías utilizadas
* **Java 24/25** (o la versión que estés usando).
* **JavaFX 25 sdk** (para la interfaz gráfica).
* **FXML:** Para la definición de la vista.
* **CSS:** Estilos aplicados directamente en el FXML para personalización.
* **Intellij:** Entorno utilizado para la programación.
* **Scene Builder:** Utilizado para la creación del FXML.

## 📁 Estructura del Proyecto
El proyecto está organizado bajo el paquete `calculadora`:

* **`ModeloCalculadora.java`**: Contiene la lógica matemática (Suma, Resta, Multiplicación, División).
* **`ControladorCalculadora.java`**: Gestiona la interacción entre el usuario y el modelo.
* **`Vista.fxml`**: Define el diseño visual y los componentes de la interfaz.
* **`Main.java`**: Clase principal que arranca la aplicación.

## ⚙️ Instalación y Ejecución
1.  Clona el repositorio o descarga los archivos.
2.  Abre el proyecto en tu IDE favorito (**IntelliJ IDEA**, **NetBeans** o **Eclipse**).
3.  Asegúrate de tener configurada la librería de **JavaFX**.
4.  Ejecuta la clase `Main.java`.

## 📸 Vista Previa
La aplicación cuenta con una disposición vertical organizada:
1.  **Entrada:** Dos campos de texto para los números.
2.  **Operaciones:** Botones de colores para identificar cada acción.
3.  **Resultado:** Una pantalla inferior destacada en color neón/celeste.

---
