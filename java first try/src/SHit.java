public class SHit {
	public static <T> void main(String[] args) {
		SLL<Integer> lista = new SLL<Integer>();
		lista.addToTail(15);
		lista.addToTail(40);
		lista.addToTail(55);
		lista.addToTail(95);
		System.out.println(lista);
		lista.remover(55);
		System.out.println(lista);
		/*System.out.println(lista.delete(2));
		System.out.println("after deletion :"+lista);*/
			
		
	}
}
