public class MyList<T> implements IMyList {
    private int capacity;
    private T[] array;

    MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    MyList(int capacity) {
        if (capacity <= 0) {
            System.out.println("IllegalCapacityError");
        } else {
            this.capacity = capacity;
            this.array = (T[]) new Object[this.capacity];
        }
    }

    private void addToSize() {
        this.capacity *= 2;
    }

    @Override
    public int size() {
        int counter = 0;

        for (T element : this.array) {
            if (element == null) {
                break;
            }
            counter += 1;
        }

        return counter;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void add(Object data) {
        int index = this.size();

        if (index == this.capacity) {
            addToSize();
            T[] newArr = (T[]) new Object[this.capacity];

            for (int i = 0; i < this.array.length; i++) {
                newArr[i] = this.array[i];
            }

            newArr[this.array.length] = (T) data;
            this.array = newArr;
        } else {
            this.array[index] = (T) data;
        }
    }

    @Override
    public Object get(int index) {
        if (index > capacity || index < 0) {
            return null;
        }

        return this.array[index];
    }

    @Override
    public Object remove(int index) {
        if (index > capacity || index < 0) {
            return null;
        }

        T removedItem = this.array[index];

        for (int i = index; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        return removedItem;
    }

    @Override
    public Object set(int index, Object data) {
        if (index > capacity || index < 0) {
            return null;
        }

        this.array[index] = (T) data;

        return data;
    }

    @Override
    public String toString() {
        String elements = "[";

        try {
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i] == null) {
                    break;
                }
                elements += this.array[i];

                if (i < this.capacity && this.array[i + 1] != null) {
                    elements += ", ";
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }


        return elements += "]";
    }

    @Override
    public int indexOf(Object data) {
        int index = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null && data == this.array[i]) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object data) {
        int index = -1;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null && data == this.array[i]) {
                index = i;
            }
        }

        return index;
    }

    @Override
    public boolean isEmpty() {
        for (T element : this.array) {
            if (element != null) {
                return false;
            }
        }

        return true;
    }

    @Override
    public T[] toArray() {
        T[] newArr = (T[]) new Object[size()];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                break;
            }

            newArr[i] = this.array[i];
        }
        return newArr;
    }

    @Override
    public void clear() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    @Override
    public MyList<T> subList(int start, int finish) {
        MyList<T> newList = new MyList<>(finish - start + 1);

        for (int i = start; i <= finish; i++) {
            newList.add(this.array[i]);
        }

        return newList;
    }

    @Override
    public boolean contains(Object data) {
        for (T element : this.array) {
            if (element != null && element == data) {
                return true;
            }
        }

        return false;
    }
}