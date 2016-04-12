package DrCasa;

public class Persona {

	private Enfermedad enfermedadActual;
	
	public void contraer (Enfermedad enfermedad) {
		enfermedadActual = enfermedad;
	}
	
	public boolean conEnfermedadAgresiva () {
		return enfermedadActual.esAgresiva();
	}
}