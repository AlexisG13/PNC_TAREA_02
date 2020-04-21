package com.uca.capas.tarea2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  


@Controller()
public class FechaController {

  @RequestMapping("/fecha")
  public @ResponseBody() String fecha(HttpServletRequest req) throws ParseException {
    int year = Integer.parseInt(req.getParameter("year"));
    int month = Integer.parseInt(req.getParameter("month"));
    int day = Integer.parseInt(req.getParameter("day"));
    String auxDate = String.format("%d/%d/%d",day,month,year);
    Date date = new SimpleDateFormat("dd/mm/yyyy").parse(auxDate);
    SimpleDateFormat dayWeek = new SimpleDateFormat("EEEE");
    return "El dia de la semana es " + dayWeek.format(date);
  }

}

