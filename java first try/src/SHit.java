public class SHit {
	public static <T> void main(String[] args) {
		SLL<Integer> lista = new SLL<Integer>();
		lista.addToTail(15);
		lista.addToTail(16);
		lista.addToTail(20);
		lista.addToTail(9);
		int bom =lista.indexthree(2);
		System.out.println(bom);
			
		
	}
}
