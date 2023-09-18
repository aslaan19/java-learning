public class SHit {
	public static <T> void main(String[] args) {
		SLL<Integer> lista = new SLL<Integer>();
		lista.addToTail(15);
		lista.addToTail(40);
		lista.addToTail(55);
		lista.addToTail(95);
		lista.addToTail(512);
		lista.addToTail(102);
		lista.addToTail(94);
		System.out.println(lista);
		lista.Less3();
		System.out.println(lista);
		
			
		
	}
}
