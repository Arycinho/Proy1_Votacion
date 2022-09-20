# Ejercicio 1
Comandos que utilizaremos: [Manual](Manual.md)

## Verifiquemos cambios pendientes
* En la consola de git procedamos a volver al root del repositorio. Suponiendo que sigues en la carpeta ```01.Ejercicios```:

```
cd ..
```

* Procedemos a escribir el comando ```git status``` que nos dará una breve información de que cambios se han dado desde la última vez que realizamos un commit. El status te dará información si un archivo fue añadido, modificado o eliminado.
* A continuación utilizando el comando ```git add .``` añadiremos todos los archivos que realizamos en el [Ejercicio 0](../00.Ejercicio-0/Instrucciones.md)
* Volvemos a escribir ```git status``` nos percataremos que ahora los archivos pasarán al área "verde" que significa que están listos para hacerles commit y se guarde todos los cambios realizados.
* A continuación procederemos a realizar nuestro primer commit.

```
git commit -m "Mi primer commit"
```

*Si es la primera vez que realiza un commit te dirá que añadas un nombre de usuario y correo para identificarte como autor para hacer esto realizar los siguientes comandos.

```
git config user.name "PRIMER_NOMBRE APELLIDO"
git config user.email "correo@ejemplo.com"
```

Para verificar que la configuración se realizó de manera correcta:

```
cat .git/config 
```

* Tambien puedes verificar la configuración con el comando

```
git config --list
```

## Creación de una cuenta en GitLab (Repositorio remoto)

### Creación de la cuenta
* Ingresar a la url [https://gitlab.com/users/sign_in](https://gitlab.com/users/sign_in)
* Haga clic en "Register" y coloque los datos que pide el formulario para crear una nueva cuenta.

*EVITE UTILIZAR LOS INICIOS DE SESIÓN CON GOOGLE, TWITTER Y DEMÁS REDES* Esto es debido a que luego sería necesario cambiar el password mediante correo electrónico para realizar nuestro push.

### Creación de nuestro primer proyecto
* Una vez logeado dirijase a la pestaña de proyecto y haga clic sobre el botón verde que dice ```New project```
* Dentro ingrese nombre del repositorio y la descripción para este ejemplo puede ingresar "Taller de git" en el nombre y la descripción "Mi primer repositorio de git"
* En nivel de visibilidad podrá elegir entre ```Private``` si desea mantener este repositorio privado, ```Public``` si desea hacerle público. (Atención, aunque un repo sea público el mismo no puede ser modificado sin la aprobación previa de un "Mantenedor" del repositorio)
* Deje sin chequear el checkbox que indica ```Initialize repository with a README``` ya que nosotros ya hemos inicializado nuestro repositorio de manera local
* Haga clic en ```Create project```

### Realizar nuestro primer push a un servidor remoto
* Primero añadiremos nuestros repositorio remoto. El gitlab nos dará una una guía bastante fácil si queremos utilizarla. De esta guía copie la siguiente linea donde [URL_DE_REPO] es la URL dada por GitLab al crear el repositorio.

```
git remote add origin [URL_DE_REPO] 
```

* Luego haremos nuestro primer push que enviará toda la información al repositorio en la web que acabamos de crear. Para esto ejecute el siguiente comando:

```
git push -u origin --all
```

* Se le abrirá una ventana de login donde deberá colocar su usuario y contraseña que utilizó al momento de crear su cuenta en GitLab.
* Acepte y haga F5 con el navegador web en la página de repositorio. Se dará cuenta que todo el contenido de su repositorio ahora se encuentra accesible mediante la web.