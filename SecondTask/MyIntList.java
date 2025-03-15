
public interface MyIntList {
	int size();
	void set(int i, int x);
	void remove(int i);
	void add(int x);
	void delete(int x);
	boolean equals(MyIntList otherList);
	void addAll(MyIntList otherList);
	void clear();


	int get(int i);
	String toString();
}
