package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		
		System.out.print(shelfQueue.deQueue());
		System.out.print(shelfQueue.deQueue());
		System.out.print(shelfQueue.deQueue());
		
	}

}
