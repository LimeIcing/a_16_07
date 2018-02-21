public class ListNode07 {
    public int data; // data stored in this node
    public ListNode07 next; // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode07() {
        this(0, null);
    }

     // post: constructs a node with given data and null link
    public ListNode07(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode07(int data, ListNode07 next) {
        this.data = data;
        this.next = next;
    }
}