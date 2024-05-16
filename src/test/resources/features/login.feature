@testfeature
Feature: Iniciar Sesión en la pagina Juntoz y agregar producto en el carrito

  @test
  Scenario: Iniciar sesión
    Given  que me encuentro en la página de Juntoz
    And cierro pop ups
    And clic en el boton cuenta
    And clic en el boton iniciar sesion
    When inicio sesión con las credenciales email: "diana15hilario@gmail.com" y contraseña: "Peluchin23"
    And clic en el boton ingresar
    And ingresar a la categoria envio gratis
    And seleccionar el primer producto
    And agregar al carrito
    Then validar que se haya agregado exitosamente al carrito
