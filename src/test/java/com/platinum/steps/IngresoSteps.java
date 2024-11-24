package com.platinum.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class IngresoSteps {

    WebDriver driver;

    @Given("El usuario se encuentra en la página de inicio")
    public void el_usuario_se_encuentra_en_la_pagina_de_inicio() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/banco-platinum"); // URL de la aplicación
    }

    @When("Ingresa el nombre de usuario {string} y contraseña {string}")
    public void ingresa_el_nombre_de_usuario_y_contraseña(String usuario, String contraseña) {
        
    }

    @Then("El sistema muestra el mensaje {string}")
    public void el_sistema_muestra_el_mensaje(String mensaje) {
        // Validar que el mensaje correcto se muestre
    }
}
