package com.automationpractice.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\automationpractice\\pruebas\\features\\Inicio.feature",
glue="com.automationpractice.pruebas.stepdefinitions",
snippets=SnippetType.CAMELCASE)

public class InicioRunner {



}
