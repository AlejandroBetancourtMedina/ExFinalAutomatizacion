Feature: Ingreso a la página del banco

Scenario: Ingreso de nombre de usuario con datos almacenados en BD
    Given El usuario se encuentra en la página de inicio
    When Ingresa el nombre de usuario "usuario1" y contraseña "contraseña1"
    Then El sistema muestra el mensaje "Bienvenido usuario1"

Scenario: Ingreso de nombre de usuario y contraseña con datos erróneos
    Given El usuario se encuentra en la página de inicio
    When Ingresa el nombre de usuario "usuario2" y contraseña "contraseñaErronea"
    Then El sistema muestra el mensaje "Credenciales incorrectas"

Scenario: Registro de hora médica veterinaria
    Given El usuario está en la página de registro
    When Ingresa los datos para una consulta veterinaria
    Then El sistema guarda la hora de la consulta correctamente
