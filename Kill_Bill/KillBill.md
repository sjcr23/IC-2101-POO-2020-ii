Instituto Tecnológico de Costa Rica                   Josué David Castro Ramírez
Centro Académico de Alajuela                                   II Semenstre 2020
Programación Orientada a Objetos                                      17-09-2020


a. Kill Bill
b. https://killbill.io
c. ¿Qué es Kill Bill?
   -Kill Bill es la principal plataforma de pagos y facturación por suscripción
   de código abierto. Proporciona una solución de oferta completa, pero modular,
   para administrar suscripciones, generar facturas y optimizar pagos. 
   Extensible a través de complementos, los ingenieros pueden aplicar fácilmen-
   te lógica personalizada e integrarse con sistemas de terceros. Puedes ejecu-
   tar Kill Bill en cualquier lugar y, por lo tanto, acceder a los datos más 
   actualizados en cualquier momento. La creación de informes se vuelve fácil y
   las pesadillas de espacio seguro de prueba desaparecen.
  
   ¿Quién usa Kill Bill?
   -Empresas de comercio electrónico y mercados que venden bienes y servicios
   puntuales o recurrentes.

d. Software de Aplicación

e. Software Libre

f. Involucrados:

   - Usuarios directos:
     -> Compañías o empresas que implementen este software de facturación.

   - Usuarios secundarios:
     -> Todos los clientes que estas empresas puedan tener.

   - Clientes o patrocinadores:
     -> Usuarios de github.

   - Equipo de ingeniería:
     -> Los desarrolladores: quiénes crearon el software.
     -> Cualquier programador que quiera agregar algo.

g. Requerimientos Funcionales:

   N°1:
-----------------------------------------------------------------------------
|                      Registrar Suscripción de Usuario                     |
-----------------------------------------------------------------------------
|                | -Nombre Completo                                         |
|    Entradas    | -Correo electrónico                                      |
|                | -Tipo de Subscripción                                    |
|                | -Método de Pago                                          |
-----------------------------------------------------------------------------
|                | -Mensaje de Registro Exitoso                             |
|    Salidas     | -Mensaje de Resistro Fallido                             |
|                |                                                          |
-----------------------------------------------------------------------------
|                | - Toma los datos del usuario, verifica si es un usurario |
|                |   nuevo, que los datos no hayan sido utilizados antes.   |
| Comportamiento | - Retorna el mensaje de registro según corresponda. (Ya  |
|                |   sea existoso o fallido)                                |
|                |                                                          |
-----------------------------------------------------------------------------

   N°2:
-----------------------------------------------------------------------------
|                             Generar Facturas                              |
-----------------------------------------------------------------------------
|                | -Datos del Usuario                                       |
|    Entradas    | -Cuenta Origen y Cuenta Destino                          |
|                | -Monto a debitar                                         |
|                | -Fecha y hora                                            |
-----------------------------------------------------------------------------
|                | -Mensaje de pago Exitoso                                 |
|    Salidas     | -Mensaje de pago Fallido                                 |
|                |                                                          |
-----------------------------------------------------------------------------
|                | - Toma los datos de entrada y procede a verificar si en  |
|                | la cuenta origen hay montos suficientes para hacer el    |
| Comportamiento | pago. De ser así; lo realiza y manda un correo al correo |
|                | registrado con la infromación completa de la transacción |
|                |                                                          |
-----------------------------------------------------------------------------

   N°3:
-----------------------------------------------------------------------------
|                    Crear un nuevo tipo de subscripción                    |
-----------------------------------------------------------------------------
|                |                                                          |
|    Entradas    | -Beneficios                                              |
|                | -Requisitos                                              |
|                |                                                          |
-----------------------------------------------------------------------------
|                |                                                          |
|    Salidas     | -Nuevo método de subscirpción                            |
|                |                                                          |
-----------------------------------------------------------------------------
|                |                                                          |
|                | -Crea las condicionales a verificar para que un usuario  |
| Comportamiento | pueda adquirir este tipo de subscirpicón. Si el usuario  |
|                | decide obtenerla le da los beneficios de la misma.       |
|                |                                                          |
-----------------------------------------------------------------------------

   N°4:
-----------------------------------------------------------------------------
|                          Bloquear a un Usuario                            |
-----------------------------------------------------------------------------
|                |                                                          |
|    Entradas    | -Reglamentos                                             |
|                | -Datos del Usuario                                       |
|                |                                                          |
-----------------------------------------------------------------------------
|                |                                                          |
|    Salidas     | -Cuenta de usuario bloqueada                             |
|                |                                                          |
-----------------------------------------------------------------------------
|                | - Toma los datos del usuario, verifica si es el usurario |
|                | ha violentado alguno de los reglamentos de uso que le    |
| Comportamiento | fueron presentados a la hora de subscribirse al servicio.|
|                | Si se demuestra una violación del acuerdo, se procede a  | 
|                | suspender la cuenta según la gravedad de la violación.   |
-----------------------------------------------------------------------------

h. Requerimientos no funcionales:

 - El sistema acepta hasta 150 tipos de divisas. (Portabilidad)
 - Toda la información del usuario es encriptada.(Seguridad)

j. Actores:
 - Empresearios de comercios digitales.
 - Clientes de las empresas.

i. Casos de Uso:

  Caso#1: Generar una factura.

  - Actor primario  :  →  Empresario.

  - Actor secundario:  →  Cliente(realiza la compra).

  - Pre-condiciones :  →  Un cliente debe haber realizado un compra.

  - Post-condiciones:  →  Se le envía una factura digital al consumidor.

  - Flujo principal :  1) El cliente realiza un pago.
		       2) Se piden los datos personales del cliente.
		          - Nombre completo.
			  - Corrreo electrónico.
			  - Cuenta.
                       3) Se realiza una factura con la información del
                          pago y la del cliente.
                       4) Se envía al correo del usuario.

  Caso#2: Bloquear a un usuario.

  - Actor primario  : →  Empresario.

  - Pre-condiciones : →  Un cliente debe haber infringido el reglamento de uso.

  - Post-condiciones: →  Un cliente bloqueado.
 
  - Flujo principal : →  1) El empresario hace la solicitd para bloquear un
                            usuario.
                         2) Se pide el ID de cuenta asociado al cliente.
                         3) El sistema verifica si el usuario incumplió alguna norma.
			 4) Se bloquea la cuenta del cliente.

  Caso#3: Registrar a un usuario.

  - Actor primario  : →  Usuario

  - Pre-condiciones : →  No deben existir cuentas con los datos solicitados.

  - Post-condiciones: →  Un nuevo cliente registrado.
 
  - Flujo principal : →  1) Se le solicita al usuario los datos personales.
                            - Nombre completo.
			    - Correo electrónico.
			    - Contraseña.
                         2) Se verifica que esos datos no hayan sido utilizados.
                         3) Se crea una cuenta nueva.

  - Fluejo alterno  : → 3b) Se indica que esos datos han sido utilizados previamente.
			4 ) Se le solicita nuevamente que ingrese los datos. 
			 
  Caso#4: Eliminar cuenta.

  - Actor primario  : →  Usuario.

  - Pre-condiciones : →  Debe existir una cuenta y el usuario debe solicitar eliminarla.

  - Post-condiciones: →  Una cuenta eliminada.
 
  - Flujo principal : →  1) El usuario hace la solicitd para eliminar una cuenta.
                         2) Se muestra un mensaje de advertencia al usuario.
                         3) Se solicita una confirmación para eliminar la cuenta.
			 4) Se elimina la cuenta del cliente.

  Caso#5: Cambiar foto de perfil.

  - Actor primario  : →  Usuario.

  - Pre-condiciones : →  Una cuenta existente.

  - Post-condiciones: →  Una cuenta con la foto de perfil actualizada.
 
  - Flujo principal : →  1) El usuario hace la solicitd para cambiar de foto.
                         2) Se solicita al usuario la foto que desea usar.
                         3) El sistema hace el cambio y actualiza la información.
			 
  Caso#6: Cambiar correo electrónico.

  - Actor primario  : →  Usuario.

  - Pre-condiciones : →  Una cuenta existente..

  - Post-condiciones: →  Una cuenta con el correo nuevo.
 
  - Flujo principal : →  1) El usuario ace la solicitud para cambiar el correo.
                         2) Se manda un correo de verifiación al correo previamente
			    asociado, para hacer el cambio.
                         3) El usuario hace correctamente el proceso del cambio.
			 4) El sistema hace el cambio y actualiza la información.
