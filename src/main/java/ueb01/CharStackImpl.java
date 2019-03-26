package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    class CharElement{
        char value;
        CharElement next;

        CharElement(char value, CharElement next){
            this.value = value;
            this.next = next;
        }
    }

    private CharElement first;

    @Override
    public void push(char c) {

        first = new CharElement(c, first);

    }

    @Override
    public char pop() {
        if(first == null)
            throw new NoSuchElementException();

        char v = first.value;
        first = first.next;

        return v;

    }

    @Override
    public int size() {
         int n = 0;
         CharElement it = first;
         while(it != null){
             n++;
             it = it.next;

         }
         return n;
    }
}
