// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList07 {

    /*
    Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
    deleted value. If the list is empty, throw a NoSuchElementException .
     */

    public int deleteBack() {
        int back;
        ListNode07 current = front;

        while (current.next.next != null) {
            current = current.next;
        }

        back = current.next.data;
        current.next = null;
        return back;
    }

    // Everything below is copied from the book

    private ListNode07 front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList07() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode07 current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode07 current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode07 current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode07(value);
        } else {
            ListNode07 current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode07(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode07(value, front);
        } else {
            ListNode07 current = nodeAt(index - 1);
            current.next = new ListNode07(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode07 current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode07 nodeAt(int index) {
        ListNode07 current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}