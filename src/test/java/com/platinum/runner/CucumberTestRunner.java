package com.platinum.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta a los archivos .feature
    glue = "com.platinum.steps",              // Paquete donde están las Step Definitions
    plugin = { "pretty",                      // Para ver resultados en consola
               "html:target/cucumber-reports.html", // Generar reporte HTML
               "json:target/cucumber.json"    // Generar reporte JSON
             },
    monochrome = true,                        // Formato limpio en consola
    tags = "@smoke"                           // Etiquetas opcionales para filtrar escenarios
)
public class CucumberTestRunner {
    
}
