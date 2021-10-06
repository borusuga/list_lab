package DST;

/**
 * This is List class
 * methods:
 * add(Object) -> void
 * add(Object, int) -> void
 * get(int) -> Object/null
 * remove(int) -> Object/null
 * set(Object, int) -> Object
 * contains(Object) -> boolean
 * indexOf(Object) -> int
 * size() -> int
 * isEmpty() -> boolean
 */

public class List {
    /**
     * This is Node class
     * fields:
     * Object obj
     * int index
     * Node next
     */
    private class Node {
        Object obj;
        // int index;
        Node next = null;

        public Node(Object obj, int index) {
            this.obj = obj;
            // this.index = index;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    {
        System.out.println("You've just created empty list");
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(Object obj) {
        if (this.size != 0) {
            Node node = new Node(obj, this.size);
            this.tail.next = node;
            this.tail = node;
        } else {
            this.head = new Node(obj, 0);
            this.head.next = null;
            this.tail = this.head;
        }
        this.size++;
    }

    public void add(Object obj, int index) {
        if (this.size == 0) {
            this.head = new Node(obj, 0);
            this.head.next = null;
            this.tail = this.head;
            this.size++;
        } else if (index <= 0) {
            Node node = new Node(obj, 0);
            node.next = this.head;
            this.head = node;
//            Node tmp = node.next;
//            while (tmp != null) {
//                tmp.index++;
//                tmp = tmp.next;
//            }
            this.size++;
        } else if (index >= this.size) {
            add(obj);
        } else {
            Node node = new Node(obj, index);
            Node tmp = head;
            for (int i = 0; i < index - 1 && tmp != this.tail; ++i) tmp = tmp.next;
//            while (tmp.next.index != index && tmp != this.tail) tmp = tmp.next;
            node.next = tmp.next;
            tmp.next = node;
            tmp = node.next;
//            while (tmp != null) {
//                tmp.index++;
//                tmp = tmp.next;
//            }
            this.size++;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= this.size || this.size == 0) return null;
        Node tmp = this.head;
        for (int i = 0; i < index ; ++i) tmp = tmp.next;
//        while (tmp.index != index) {
//            tmp = tmp.next;
//        }
        return tmp.obj;
    }

    public Object remove(int index) {
        if (index < 0 || index >= this.size || this.size == 0) return null;
        if (this.size == 1) {
            Object val = this.head.obj;
            this.head = null;
            this.tail = null;
            this.size--;
            return val;
        } else {
            Node tmp = head;
            Object val = null;
            if (index == 0) {
                val = this.head.obj;
                this.head = this.head.next;
            } else {
                for (int i = 0; i < index && tmp != this.tail; ++i) tmp = tmp.next;
//                while (tmp.next.index != index && tmp != this.tail)
//                    tmp = tmp.next;
                val = tmp.next.obj;
                tmp.next = tmp.next.next;
                tmp =  tmp.next;
            }
//            while (tmp != null) {
//                tmp.index--;
//                tmp = tmp.next;
//            }
            size--;
            return val;
        }
    }

    public Object set(Object obj, int index) {
        if (index < 0 || index >= this.size) return null;
        Node tmp = this.head;
        for (int i = 0; i < index - 1; ++i) tmp = tmp.next;
        Object old_val = tmp.obj;
        tmp.obj = obj;
        return old_val;
//        while (tmp != null) {
//            if (tmp.index == index) {
//                Object old_val = tmp.obj;
//                tmp.obj = obj;
//                return old_val;
//            }
//        }
//        return null;
    }

    public boolean contains(Object obj) {
        Node tmp = this.head;
        while (tmp != null) {
            if (tmp.obj == obj) return true;
            tmp = tmp.next;
        }
        return false;
    }

    public int indexOf(Object obj) {
        Node tmp = this.head;
        int i = 0;
        while (tmp != null) {
            if (tmp.obj == obj) return i;
            tmp = tmp.next;
            ++i;
        }
        return -1;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }
}


