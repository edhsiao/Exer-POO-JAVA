package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Adaptador implements Iterator<Object> {
	
	
	  private final Enumeration <Object> oldEnum;

	  public Adaptador(final Enumeration <Object> old) {
	    oldEnum = old;
	  }

	 
	  public boolean hasNext() {
	    return oldEnum.hasMoreElements();
	  }

	  public Object next() {
	    return oldEnum.nextElement();
	  }

	 
	  public void remove() {
	    throw new UnsupportedOperationException("remove");
	  }
public static void main(String[] args) {
	System.out.println("eeeeeeeeeee");
}
}

