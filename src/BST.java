
public class BST {
	Nodo raiz;
	public BST() {
		raiz = null;
	}

	public void insertar(int key,Object valor) {
		Nodo n = new Nodo(key);
		n.valor = valor;
		
		if(raiz == null) {
			raiz = n;
		}
		else{
			Nodo temporal = raiz;
			while(temporal != null) {
				n.p = temporal;
				if(n.llave >= temporal.llave) {
					temporal = temporal.der;
				}else {
					temporal = temporal.izq;
				}
			}
			if(n.llave < n.p.llave) {
				n.p.izq = n;
			}else {
				n.p.der = n;
			}
		}
			
	}

	private class Nodo{
		public Nodo p;
		public Nodo der;
		public Nodo izq;
		public int llave;
		public Object valor;
	
		public Nodo(int key) {
			llave = key;
			der = null;
			izq = null;
			p = null;
			valor = null;
		}
	}
}
