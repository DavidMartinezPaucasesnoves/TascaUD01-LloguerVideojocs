GUIA PARA EJECUTAR EL PROYECTO
1. Clonar o Descargar el repositorio:
   git clone https://github.com/DavidMartinezPaucasesnoves/TascaUD01-LloguerVideojocs.git

2. Abrir el proyecto en NetBeans:
   - Inicia Apache NetBeans IDE.
   - Ve a File > Open Project... y selecciona la carpeta raíz del proyecto.

3. Ejecutar la Aplicación:
   - En el panel Projects, despliega el paquete com.practica.ui.
   - Haz clic derecho sobre MainScreen.java y selecciona Run File (o pulsa la tecla Shift + F6).


ESTRUCTURA DE PAQUETES Y CLASES
El proyecto está organizado en 4 paquetes principales según su responsabilidad:

com.practica.model (Modelos de datos)
  Usuario.java: Almacena la información del cliente (DNI, nombre, apellidos, teléfono y fecha de registro).
  Juego.java: Contiene los datos del título, género y el control del stock independiente por cada plataforma.
  Alquiler.java: Representa la relación de alquiler entre un usuario y un juego (número de registro, fechas de inicio/devolución y estado).
  Plataforma.java: Enumeración con los tipos de plataformas soportadas (PS5, XBOX, PC, SWITCH_2).

com.practica.service (Gestión de datos)
  DataStore.java: Persistencia en memoria basada en listas estáticas para simular la base de datos y gestionar datos de prueba.
  
com.practica.validation (Reglas de validación)
  ValidationAPI.java: Métodos estáticos para verificar la validez del DNI, teléfono y formato de texto en mayúsculas.

com.practica.ui (Interfaz gráfica Swing)
  MainScreen.java: Ventana principal con la tabla global de alquileres y barra de menú.
  RegisterScreen.java: Formulario para la creación y registro de nuevos alquileres.
  ReturnScreen.java: Pantalla interactiva para procesar devoluciones de juegos.
  UserScreen.java / DeleteUserScreen.java: Diálogos para el alta y baja de usuarios.
  GameScreen.java / DeleteGameScreen.java: Diálogos para el alta y baja de videojuegos.
  AlquilerTableCellRenderer.java: Renderizador visual que aplica códigos de color en la tabla según el estado del alquiler (devuelto, en plazo o fuera de plazo).
