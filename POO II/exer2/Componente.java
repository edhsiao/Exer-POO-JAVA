import java.util.Collection;

public interface Componente {
	void imprimir();

	Collection<Componente> getSubComponentes();
}
