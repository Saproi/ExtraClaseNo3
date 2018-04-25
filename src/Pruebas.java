import BinarySearchTree.BinarySearchTree;

public class Pruebas {

	public static void main(String[] args) {
		BST arbol = new BST();
		arbol.insertar(5, "Hola Mundo");
		arbol.insertar(4, -1234);
		arbol.insertar(7, null);
		arbol.insertar(1, 1);
		arbol.insertar(9, "asdlkj");
		arbol.insertar(5, 5);


		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.print();
		System.out.println("x");
		bt.remove(2);
		bt.print();
	}

}
