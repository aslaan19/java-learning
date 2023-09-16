public class SHit {
	public static <T> void main(String[] args) {
		SLL<Integer> lista = new SLL<Integer>();
		lista.addToTail(15);
		lista.addToTail(16);
		lista.addToTail(20);
		lista.addToTail(9);
		System.out.println(lista);
		lista.deleteLast();
		System.out.println(lista);
		/*System.out.println(lista.delete(2));
		System.out.println("after deletion :"+lista);*/
			
		
	}
}
