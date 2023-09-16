
public class SLL<T> {

    private class SLLNode<T> {
        private T info;
        private SLLNode<T> next;

        public SLLNode() {
            this(null, null);
        }

        public SLLNode(T el) {
            this(el, null);
        }

        public SLLNode(T el, SLLNode<T> ptr) {
            info = el;
            next = ptr;
        }
    }

    protected SLLNode<T> head, tail;

    public SLL() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(T el) {
        head = new SLLNode<T>(el, head);
        if (tail == null)
            tail = head;
    }

    public void addToTail(T el) {
        if (!isEmpty()) {
            SLLNode<T> newnode = new SLLNode<T>(el);
            tail.next = newnode;
            tail = tail.next;
        } else
            head = tail = new SLLNode<T>(el);
    }

    public T deleteFromHead() { // delete the head and return its info;
        if (isEmpty())
            return null;
        T el = head.info;
        if (head == tail) // if only one node on the list;
            head = tail = null;
        else
            head = head.next;
        return el;
    }

    public T deleteFromTail() { // delete the tail and return its info;
        if (isEmpty())
            return null;
        T el = tail.info;
        if (head == tail) // if only one node in the list;
            head = tail = null;
        else { // if more than one node in the list,
            SLLNode<T> tmp; // find the predecessor of tail;
            for (tmp = head; tmp.next != tail; tmp = tmp.next)
                ;
            tail = tmp; // the predecessor of tail becomes tail;
            tail.next = null;
        }
        return el;
    }

    public void delete(T el) { // delete the node with an element el;
        if (!isEmpty())
            if (head == tail && el.equals(head.info)) // if only one
                head = tail = null; // node on the list;
            else if (el.equals(head.info)) // if more than one node on the list;
                head = head.next; // and el is in the head node;
            else { // if more than one node in the list
                SLLNode<T> pred, tmp;// and el is in a nonhead node;
                for (pred = head, tmp = head.next; tmp != null
                        && !tmp.info.equals(el); pred = pred.next, tmp = tmp.next)
                    ;
                if (tmp != null) { // if el was found;
                    pred.next = tmp.next;
                    if (tmp == tail) // if el is in the last node;
                        tail = pred;
                }
            }
    }

    @Override
    public String toString() {
        if (head == null)
            return "[ ]";
        String str = "[ ";
        SLLNode<T> tmp = head;
        while (tmp != null) {
            str += tmp.info + " ";
            tmp = tmp.next;
        }
        return str + "]";
    }

    public boolean contains(T el) {
        if (head == null)
            return false;
        SLLNode<T> tmp = head;
        while (tmp != null) {
            if (tmp.info.equals(el))
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    public int size() {
        if (head == null)
            return 0;

        int count = 0;
        SLLNode<T> p = head;
        while (p != null) {
            count++;
            p = p.next;
        }

        return count;
    }

    // Please write the methods of Task02 here:
    public void insertbefore(T element, int index) {
        int count = 0;
        SLLNode<T> p = head;
        SLLNode<T> newnode = new SLLNode<T>(element);
        if (isEmpty()) {
            head = tail = newnode;
        }
        if (index == 0) {
            newnode.next = head;
            head = newnode;

        } else {
            while (count < index - 1) {
                count++;
                p = p.next;
            }
            newnode.next = p.next;
            p.next = newnode;
        }

    }
    public T delete(int index) {
        SLLNode<T> p = head;
        SLLNode<T> deleted= new SLLNode<>();
        int count =0;
        while(count < index-1 ){
            count++;
            p = p.next;
        }
        deleted = p.next ;
        p.next = p.next.next;

        return deleted.info;
    }
    public void deleteLast(){
        SLLNode<T> D = head;
        if (head==null){
            System.out.println("the list is empty !");
        }
        if (head == tail){
            head = tail = null;
        }
        else{
            while(D.next!= tail){
                D=D.next;
            }
            D.next = tail.next;
            D=tail;
            tail = null;
        }
    }
    public void remover(T e){
       SLLNode<T> wanted = new SLLNode<T>(e);
       SLLNode<T> p = head;
       while(p.next.info != wanted.info ){
        p = p.next;
       }
       if(p.next == null) System.out.println("we dont have your E");

       else{
        p.next =p.next.next;
        wanted.next = null;
        p =p.next; 
        
       }
    }

        
    }



