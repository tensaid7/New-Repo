
public class Main {
	public static void main(String []args) {
		 MyIntArraylist list1 = new MyIntArraylist();
		 MyIntArraylist list2 = new MyIntArraylist();
		 list1.add(10);
		 list1.add(10);
		 list1.add(20);
		 list1.add(30);

		 System.out.println("size: " + list1.size());

		 System.out.println("Перед удалением: " + list1);
		 list1.delete(10);
		 System.out.println("После удаления: " + list1);
		 System.out.println("size: " + list1.size());

		 list1.add(40);
		 list1.set(100, 1);
		 System.out.println("После добавления 40: " + list1);
		 System.out.println("size: " + list1.size());


		 list2.add(10);
		 list2.add(30);
		 list2.add(50);
		 System.out.println("Равны? " + list1.equals(list2));
		 list1.addAll(list2);

		 list1.clear();

		 System.out.println(list1);

		 System.out.println(list2);
		 try {
			 list2.remove(2001);
		 } catch (RuntimeException e) {
			 System.out.println(e.getMessage());
		 }

	}
}