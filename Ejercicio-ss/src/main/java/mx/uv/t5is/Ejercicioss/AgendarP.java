package mx.uv.t5is.Ejercicioss;

public class AgendarP {
    private int id;
    private String nombre;
    private String tarea;

public AgendarP(){

}

public String getTarea() {
    return tarea;
}

public void setTarea(String tarea) {
    this.tarea = tarea;
}

public AgendarP(int id, String  nombre){
 this.id = id;
 this.nombre = nombre;
}

public int getId(){
    return this.id;
}
public void setId(int id){
    this.id = id;
}

public String getNombre(){
    return this.nombre;
}

public void setNonbre(String nombre){
    this.nombre = nombre;
}

}