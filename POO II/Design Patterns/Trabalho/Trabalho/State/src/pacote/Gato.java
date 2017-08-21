package pacote;

public class Gato {
	public final Estado VIVO = new EstadoVivo();
	public final Estado MORTO = new EstadoMorto();
	public final Estado QUANTICO = new EstadoQuantico();
	private Estado estado;
	
	public void setEstado(Estado estado) {
	this.estado = estado;
	}
	
	public void miar(){
		estado.miar();
	}
	
	public static void main(String[] args) {
		Gato g = new Gato();
		g.estado = g.VIVO;
		g.miar();
		g.estado = g.MORTO;
		g.miar();
		g.estado = g.QUANTICO;
		g.miar();
	}


}
