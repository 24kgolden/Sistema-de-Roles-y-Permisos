Sistema de Roles y Permisos con Login
Este proyecto es una aplicación desarrollada en Java utilizando NetBeans como IDE. Implementa un sistema de gestión de roles y permisos con una funcionalidad de inicio de sesión que valida a los usuarios registrados. Dependiendo del rol asignado (Administrador o Usuario), se muestra una interfaz adaptada y se aplican permisos específicos.

Características principales
Gestión de Roles: Clasificación de usuarios en roles como Administrador y Usuario.

Permisos Personalizados: Control granular de funcionalidades según el rol del usuario.

Interfaz Dinámica: La aplicación ajusta su interfaz y opciones disponibles según el rol asignado.

Base de Datos MySQL: Los datos de usuarios, roles y permisos se almacenan de forma segura en MySQL, usando XAMPP como servidor local.

Tecnologías utilizadas
Lenguaje de Programación: Java

IDE: NetBeans

Base de Datos: MySQL (XAMPP)

Requisitos
XAMPP (para el servidor MySQL).

NetBeans IDE (o cualquier IDE compatible con Java).

JDK 8 o superior.

Configuración
Clona este repositorio:

bash
Copiar
Editar
git clone https://github.com/tu-usuario/tu-repositorio.git  
Configura la base de datos:

Importa el archivo SQL (ubicado en /db) a tu servidor MySQL.

Actualiza los parámetros de conexión en el archivo de configuración de la aplicación (por ejemplo, URL, usuario y contraseña de la base de datos).

Abre el proyecto en NetBeans y compílalo.

Ejecuta la aplicación desde el IDE o mediante el archivo ejecutable generado.

Uso
Inicia sesión con un usuario registrado en la base de datos.

Explora las funcionalidades adaptadas al rol del usuario (Administrador o Usuario).

Contribuciones
¡Toda contribución es bienvenida! Si tienes mejoras o sugerencias, no dudes en abrir un issue o enviar un pull request.
