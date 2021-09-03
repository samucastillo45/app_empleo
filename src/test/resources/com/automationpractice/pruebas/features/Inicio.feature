#language:es
Característica: Pagina de inicio de Automation Practice

  
  Esquema del escenario: Registro en your logo
    Dado que estoy en la pagina de Inicio de LogoYour
    Cuando ingreso al enlace Sign in
      | correo   |
      | <Correo> |
    Y lleno los campos de la cuenta
      | nombre   | apellido   | clave   | compa   | dir   | dir2   | ciudad   | codigopost   | otro   | tel1   | tel2   |
      | <nombre> | <apellido> | <clave> | <compa> | <dir> | <dir2> | <ciudad> | <codigopost> | <otro> | <tel1> | <tel2> |
    Entonces valido que aparezca mi nombre y apellido en el menu

    Ejemplos: 
      | Correo                 | nombre | apellido | clave      | dir            | compa     | dir2              | ciudad  | codigopost | otro      | tel1    | tel2       |
      | viejocasti077@sqasa.com | angel  | castillo | Leumas4511 | Cra 8 N° 64-42 | SQABOGOTA | Clle 31G SUR 1-55 | Boogota |      23457 | Buen Reto | 2718392 | 3112235777 |

  
  Esquema del escenario: Registro en your logo con correo existente
    Dado que estoy en la pagina de Inicio de LogoYour
    Cuando ingreso al enlace Sign in
      | correo   |
      | <Correo> |
    Entonces valido que aparezca el mensaje de error <mensaje>

    Ejemplos: 
      | Correo       | mensaje                                                                                                              |  
      | viejocasti0@sqasa.com | An account using this email address has already been registered. Please enter a valid password or request a new one. | 
