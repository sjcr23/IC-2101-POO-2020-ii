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
   - Fundadores:
     -> Pierre-Alexandre Meyer
     -> Stéphan Brossier 
   - Contribuidores:
     -> Joel Batista
     -> Alena Dudzinskaya
   - Usuarios:
     -> Becca Gaspard
     -> holkra

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
  |                 Creación de un nuevo tipo de subscripción                 |
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

  -Desempeño: 
       Kill Bill ha sido la plataforma líder de facturación y pago de código 
       abierto durante los últimos 10 años. Organizaciones de todo el mundo, 
       desde nuevas empresas hasta empresas públicas, confían en Kill Bill
       para facturar miles de millones cada año.
 
  -Portabilidad y compatibilidad:
       Acceso en tiempo real con informes básicos o personalizados. Pruebe
       varios modelos de facturación para ver cuál es más rentable para su
       negocio. Realice pruebas y acomode fácilmente incluso los descuentos
       promocionales más breves.
