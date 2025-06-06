Aquí tienes una versión actualizada con un apartado para imágenes:

---

# Sistema de Roles y Permisos con Login

Este proyecto es una aplicación desarrollada en **Java** utilizando **NetBeans** como IDE. Implementa un sistema de gestión de roles y permisos con una funcionalidad de inicio de sesión que valida a los usuarios registrados. Dependiendo del rol asignado (Administrador o Usuario), se muestra una interfaz adaptada y se aplican permisos específicos.

## Características principales

* **Gestión de Roles**: Clasificación de usuarios en roles como Administrador y Usuario.
* **Permisos Personalizados**: Control granular de funcionalidades según el rol del usuario.
* **Interfaz Dinámica**: La aplicación ajusta su interfaz y opciones disponibles según el rol asignado.
* **Base de Datos MySQL**: Los datos de usuarios, roles y permisos se almacenan de forma segura en MySQL, usando XAMPP como servidor local.

## Tecnologías utilizadas

* **Lenguaje de Programación**: Java
* **IDE**: NetBeans
* **Base de Datos**: MySQL (XAMPP)

## Requisitos

* XAMPP (para el servidor MySQL).
* NetBeans IDE (o cualquier IDE compatible con Java).
* JDK 8 o superior.

## Configuración

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git  
   ```
2. Configura la base de datos:

   * Importa el archivo SQL (ubicado en `/db`) a tu servidor MySQL.
   * Actualiza los parámetros de conexión en el archivo de configuración de la aplicación (por ejemplo, URL, usuario y contraseña de la base de datos).
3. Abre el proyecto en NetBeans y compílalo.
4. Ejecuta la aplicación desde el IDE o mediante el archivo ejecutable generado.

## Uso

1. Inicia sesión con un usuario registrado en la base de datos.
2. Explora las funcionalidades adaptadas al rol del usuario (Administrador o Usuario).

## Capturas de pantalla

A continuación, se incluyen imágenes para ilustrar el funcionamiento del sistema:

1. **Pantalla de inicio de sesión**
   ![image](https://github.com/user-attachments/assets/64daaefe-347a-42dd-9c76-7b87328ada8c)

2. **Interfaz para Administrador**
   ![image](https://github.com/user-attachments/assets/53488166-8d32-4ef4-84e6-3e982076e8fc)

3. **Interfaz para Usuario**
   ![image](https://github.com/user-attachments/assets/623e989c-9e04-4e56-94f2-f39faa6bbc7a)

4. **Alta Usuarios**

    ![image](https://github.com/user-attachments/assets/fe459ffc-7506-4122-8ef2-78e567e2fe94)

6. **Editar Usuario**

    ![image](https://github.com/user-attachments/assets/cf2b59e6-e690-46a8-8b37-b45ebc370b62)
> Reemplaza `ruta/a/imagen.png` con la ubicación real de las imágenes en el repositorio.

## Contribuciones

¡Toda contribución es bienvenida! Si tienes mejoras o sugerencias, no dudes en abrir un **issue** o enviar un **pull request**.

---


