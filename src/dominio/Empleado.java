
package dominio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;
    

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    
    public void verDatos(){
        System.out.println("--------------------------");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Fecha Ingreso a la Empresa: ");
        System.out.println("       "+fechaI.getAnio()+" "+fechaI.getMes()+" "+fechaI.getDia());
        System.out.println("--------------------------");
        GregorianCalendar fActual= new GregorianCalendar();
        Date fA = new Date();
        fActual.setTime(fA);
        int anioE,mesE,diaE;
        int anioT,mesT,diaT;
        anioE=fActual.get(Calendar.YEAR)-fechaN.getAnio();
        mesE=fActual.get(Calendar.MONTH)-fechaN.getMes();
        diaE=fActual.get(Calendar.DAY_OF_MONTH)-fechaN.getDia();
        anioT=fActual.get(Calendar.YEAR)-fechaI.getAnio();
        mesT=fActual.get(Calendar.MONTH)-fechaI.getMes();
        diaT=fActual.get(Calendar.DAY_OF_MONTH)-fechaI.getDia();
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Fecha nacimiento:"+fechaN.getAnio()+"-"+fechaN.getMes()+"-"+fechaN.getDia());
        System.out.println("Edad Empleado:(años)"+anioE+"-(meses)"+mesE+"-(dias)"+diaE);
        System.out.println("Fecha ingreso:"+fechaI.getAnio()+"-"+fechaI.getMes()+"-"+fechaI.getDia());
        System.out.println("Tiempo en la empresa:"+anioT+","+mesT+","+diaT);
    }
    
    @Override
    public String toString(){
        return this.getNombre()+"\n"+this.getFechaN()+"\n"+this.fechaI;
    }
    
}
