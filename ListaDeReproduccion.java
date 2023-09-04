
public class PlayList {//Clase representa un reproductor de música

//ATRIBUTOS
private String nombre;//Almacena el nombre de la lista de reporduccion
private List<Cancion> canciones; //Almacena una lista de objetos Cancio 
private int indiceActual;//Almacena el indice de lacacion actual

//CONSTRUCTOR
public PlayList(String nombre) {
 this.nombre = nombre;// Se asigna el nombre a la lista de reproducción
 this.canciones = new ArrayList<Cancion>();//Inicializa la lista vacia de canciones
  this.indiceActual = -1;//Indica que no hay ninguna canción seleccionada
}
	  
//METODO AGREGAR
public void agregarCancion(Cancion cancion) {//Agrega una canción
 this.canciones.add(cancion);//Añade la canción a la lista de canciones
}	

//METODO ELIMINAR
public void eliminarCancion(int indice) {//Elimina una canción
 if (indice >= 0 && indice < this.canciones.size()) {//Verifica si el índice es válido
   this.canciones.remove(indice);//Elimina la cancións
   if (this.indiceActual == indice) {// Se ajusta el índice actual
     this.indiceActual = -1;//Indica que no hay canción seleccionada
   } else if (this.indiceActual > indice) {
     this.indiceActual--;//Resta uno al índice actual
   }
 }
}

//METODO SELECCIONAR
public void seleccionarCancion(int indice) {
 
 if (indice >= 0 && indice < this.canciones.size()) {//Verifica si el índice es válido
   this.indiceActual = indice;//Asigna el índice a la canción actual
 }
}

//METODO REPRODUCCIR EL INDICE ACTUAL
public void reproducirCancion() {
 if (this.indiceActual != -1) {//Verifica si hay alguna canción seleccionada
   Cancion cancionActual = this.canciones.get(this.indiceActual);//Obtiene la canción actual
   System.out.println("Reproduciendo: " + cancionActual.getNombre() + " - " + cancionActual.getArtista());//IMmprime el nombre y el artista
 }
}

//METODO SIGUIENTE CANCION
public void siguienteCancion() {
 
 if (!this.canciones.isEmpty()) {//Verifica si hay alguna canción
   this.indiceActual = (this.indiceActual + 1) % this.canciones.size();//Incrementa el índice actual
   this.reproducirCancion();//Reproduce la nueva canción
 }
}

//METODO CANCION ANTERIOR
public void anteriorCancion() {
 if (!this.canciones.isEmpty()) {//Verifica si hay alguna canción
   this.indiceActual = (this.indiceActual - 1 + this.canciones.size()) % this.canciones.size();//Decrementa el índice actual en uno
   this.reproducirCancion();//Reproduce la nueva canción
 }
}