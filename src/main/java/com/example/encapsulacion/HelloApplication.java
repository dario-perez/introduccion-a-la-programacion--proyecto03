package com.example.encapsulacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        class Persona {
            private int edad;
            private String nombre;
            private long telefono;
            public String getNombre() {
                return this.nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public Integer getEdad() {
                return this.edad;
            }
            public void setEdad(Integer edad) {
                this.edad = edad;
            }
            public long getTelefono() {
                return this.telefono;
            }
            public void setTelefono(long telefono) {
                this.telefono = telefono;
            }
        }
    }
}