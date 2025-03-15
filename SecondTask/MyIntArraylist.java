
public class MyIntArraylist implements MyIntList {
    int storage[];
    int capacity = 100;
    int size = 0;

    public MyIntArraylist() {
        this(100);
    }

    public MyIntArraylist(int capacity) {
        this.capacity = capacity;
        storage = new int[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int x, int i) {
        if (i >= 0 && i < size){
            storage[i] = x;
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }
    }

    @Override
    public void remove(int i) {
        if (i >= 0 && i < size){
            for (int j = i; j < size - 1; j++){
                storage[j] = storage[j+1];
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }
    }


    @Override
    public void add(int x) {
        if (size < capacity) {
            storage[size++] = x;
        } else {
            throw new IndexOutOfBoundsException("Массив переполнен, невозможно добавить элемент");
        }
    }


    @Override
    public void delete(int x) {
        for (int i = 0; i < size; ){ 
            if (storage[i] == x) {
                for (int j = i; j < size - 1; j++) {
                    storage[j] = storage[j+1];
                }
                size--;
            } else {
                i++;
            }
        }
    }


    @Override
    public boolean equals(MyIntList otherList) {
        if (otherList == null || this.size != otherList.size()){
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (this.get(i) != otherList.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    
    @Override
    public void addAll(MyIntList otherList) {
        if (otherList == null){
            throw new IllegalArgumentException("Другой список не может быть null");
        }
        for (int i = 0; i < otherList.size(); i++) {
            this.add(otherList.get(i));
        }
    }
    
    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int get(int i){
        if (i >= 0 && i < size){
            return storage[i];
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }
    }

    @Override
    public String toString(){
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            result += storage[i] + " ";

        }
        result += "]";
        return result;
    }
}
