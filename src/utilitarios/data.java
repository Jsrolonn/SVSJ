package utilitarios;
import java.util.Date;
import java.text.SimpleDateFormat;
public class data
{
 //crear 4 variables, tienen que ser públicas para poder utilizar desde la VP
 public String mes, dia, anho, dia_semana, hora;
 SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
 public void leer_hora()
 {
 Date horaActual = new Date();
 hora = formatoHora.format(horaActual);
 }
 public void el_dato() //método para leer el dato
 {
 Date dato = new Date(); //crear un objeto de tipo Fecha
 // mes = ""+ dato.getMonth();//varia de 0 y el "" convierte a String
 dia = ""+ dato.getDate();
 anho = ""+ (1900+ dato.getYear());//agrega 112 por ser 2012
 // dia_semana = ""+ dato.getDay();//retorna el día de la semana de 0-6
 //dar formato a la fecha
 switch(dato.getMonth()) //0 a 11
 {
 case 0: mes = "Enero"; break;
 case 1: mes = "Febrero"; break;
 case 2: mes = "Marzo"; break;
 case 3: mes = "Abril"; break;
 case 4: mes = "Mayo"; break;
 case 5: mes = "Junio"; break;
 case 6: mes = "Julio"; break;
 case 7: mes = "Agosto"; break;
 case 8: mes = "Septiembre"; break;
 case 9: mes = "Octubre"; break;
 case 10: mes = "Noviembre"; break;
 case 11: mes = "Diciembre"; break;
 }
 switch(dato.getDay())
 {
 case 0: dia_semana = "Domingo"; break;
 case 1: dia_semana = "Lunes"; break;
 case 2: dia_semana = "Martes"; break;
 case 3: dia_semana = "Miércoles"; break;
 case 4: dia_semana = "Jueves"; break;
 case 5: dia_semana = "Viernes"; break;
 case 6: dia_semana = "Sábado"; break;
 }
 }
}
