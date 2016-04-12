package DrCasa;

public class AutoInmune implements Enfermedad {
	
	private int cantidadDeVecesQueAfecto = 0;
	
	public boolean esAgresiva () {
		return cantidadDeVecesQueAfecto > 30;
	}

	public void pasarUnDia() {
		cantidadDeVecesQueAfecto = cantidadDeVecesQueAfecto + 1; 
	}
}
