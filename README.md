## Observaciones de desarrollo:
He buscado cumplir el flujo básico descrito en los requisitos.

Para la gestión del formulario he decidido crear un controlador nuevo (controllers/FormController.java), y he visto adecuado crear también un modelo para recoger los datos obtenidos de la capa frontal (model/FormData.java).

En el método que controla el envío de los datos del formulario he decidido emplear una llamada POST mediante la etiqueta @PostMapping porque creo que es lo más adecuado para un formulario de creación de datos como este formulario de registro.

En la clase de modelo de datos he empleado Lombok (la dependencia está en el pom), que me facilita la gestión de constructores, getters y setters, y me permite mantener un código más limpio.

Aunque en este caso no fuera muy necesario he decidido incluir un logger (@Slf4j de Lombok) para registrar las llamadas que se realizan en el controlador.

En la capa frontal he empleado un mínimo de CSS (en un entorno profesional quizás hubiera optado por Bootstrap o alguna tecnología similar) y Thymeleaf, que aunque lo conocía no lo había llegado a utilizar nunca anteriormente. Creo que me ha facilitado mucho el tratamiento del objeto FormData al enviarlo al controlador y transmitir los datos a la siguiente pantalla.

Como mejoras pendientes mencionaría añadir tests unitarios y, aunque no aparece en los requisitos, introducir una capa de servicio. Esto me habría permitido tratar el objeto recibido para aplicarle otras validaciones o transformaciones antes de enviarlo a la segunda pantalla.

## Requisitos
Crear formulario de registro de usuarios con los siguientes campos:
- Nombre
- Apellidos
- Teléfono
- Email
- Fecha de nacimiento
- Contraseña
- Validación de contraseña


El formulario tendrá que estar ubicado en el template ya creado "form-page.html" cuyo recurso se carga desde el HomeController. Se deberá gestionar la recepción del contenido del formulario desde el mismo controlador, o desde otro nuevo, para una vez recogido los datos sean mostrados en otra nueva página.

Se podrá usar cualquier librería externa que no esté incluida en el proyecto.

## No será obligatorio pero se valorará de manera positiva
- Tymeleaf como motor de plantillas https://www.thymeleaf.org/
- Uso de JQuery validation https://jqueryvalidation.org/
- Uso de TDD

## Instalación
Clonar repositorio

```sh
git clone https://github.com/belive-globalia/prueba-formulario.git
```

Para ejecutar el proyecto:

```sh
mvn spring-boot:run
```

## Entrega
La prueba se podrá entregar con un enlace a un repositorio público o comprimiendo el proyecto incluyendo el .git.
