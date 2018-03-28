package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private CharElement head;

    @Override
    public void push(char c) {

        if (head == null) {

            head = new CharElement(c, null);

        } else {
            CharElement halter = head;

            head = new CharElement(c, halter);
        }
    }


    @Override
    public char pop() {

        if (head == null) throw new NoSuchElementException();
        {
            char r = head.value;
            head = head.next;
            return r;

        }
    }

    @Override
    public int size() {
        CharElement it = head;
        int n = 0;
        while (it != null) {
            n++;
            it = it.next;
        }
        return n;
    }
}



