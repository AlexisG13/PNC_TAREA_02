package com.uca.capas.tarea2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class AlumnoController {

  @RequestMapping("/alumno")
  public @ResponseBody() String alumno() {
    String alumno = "Alexis Javier Gómez Coto , 00122717 . Ingeniería Informática , Cuarto Año";
    return alumno;
  }

}

