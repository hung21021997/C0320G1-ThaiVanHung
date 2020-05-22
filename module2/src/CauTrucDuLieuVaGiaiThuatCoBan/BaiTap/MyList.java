package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public E remove(E e){
        for (int i=0; i<size; i++){
            if (e.equals(elements[i])){
                for (int j=i; j<size; j++){
                    elements[j]=elements[j+1];
                }
            }
        }
        return (E) elements;
    }
    public int size(){
        return size;
    }

    public MyList clone(){
        MyList myList = new MyList();
        for (int i=0; i<size; i++){
            myList.elements[i] = elements[i];
        }
        myList.size=size;
        return myList;
    }
    public boolean contains(E e){
        for (int i=0; i<size; i++){
            if(e.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        int index = 0;
        for (int i=0; i<size; i++){
            if(e.equals(elements[i])){
                index=i;
            }
        }
        if(index>0){
            return index;
        } else {
            return -1;
        }
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }
    public void clear(){
        for (int i=0; i<size; i++){
            this.remove((E) elements[i]);
        }
    }
}
