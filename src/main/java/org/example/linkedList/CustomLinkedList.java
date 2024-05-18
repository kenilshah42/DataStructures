package org.example.linkedList;
public class CustomLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public CustomLinkedList() {
        this.size = 0;
    }
    public CustomLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    /**
     * This method inserts a new element at the start of linked list
     * @param value
     */
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    /**
     * This method inserts a new element at the last of linked list
     * @param value
     */
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    /**
     * This method displays all the elements in the linked list
     */
    public void display(){
        Node temp = head;
        System.out.print(temp.value + " -> ");
        while(temp.next != null){
            temp = temp.next;
            System.out.print(temp.value + " -> ");
        }
        System.out.print("END");
    }

    /**
     * This method inserts an element at specified index
     * @param value
     * @param index
     */
    public void insert(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1;i < index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    /**
     * This method removes a first element from linked list
     * @return
     */
    public int deleteFirst(){
        Node node = head;
        int value = head.value;
        head = node.next;
        node.next = null;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    /**
     * This method removes a last element from linked list
     * @return
     */
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node node = get(size-2);
        int value = tail.value;
        node.next =null;
        tail = node;
        size--;
        return value;
    }

    /**
     * This method removes element at a specified index in linked list
     * @param index
     * @return
     */
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == (size - 1)){
            return deleteLast();
        }
        Node node = get(index - 1);
        int value = node.next.value;
        node.next = node.next.next;
        size--;
        return value;
    }

    /**
     * This method fetches node at a specified index from linked list
     * @param index
     * @return
     */
    public Node get(int index){
        Node node = head; //first iteration is already done here
        for(int i = 0;i<index;i++){ // So i < index instead of i <= index
            node = node.next;
        }
        return node;
    }

    public void insertRecursively(int value,int index){
        head = this.insertRecursively(value,index,head); //It will set the first node as head always
    }

    private Node insertRecursively(int value,int index,Node node){
        if(index == 0){
            Node newNode = new Node(value,node);
            size++;
            return newNode;
        }
        node.next = insertRecursively(value,index-1,node.next);
        return node;
    }

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    /**
     * This method fetches the node by given value
     * @param value
     * @return
     */
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(value == node.value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static CustomLinkedList mergeLinkLists(CustomLinkedList l1,CustomLinkedList l2){
        Node f = l1.head;
        Node s = l2.head;
        CustomLinkedList newLl = new CustomLinkedList();
        while(f != null && s != null){
            if(f.value < s.value){
                newLl.insertLast(f.value);
                f = f.next;
            }else{
                newLl.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            newLl.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            newLl.insertLast(s.value);
            s = s.next;
        }
        return newLl;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int findCycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                }while(slow == fast);
                return length;
            }
        }
        return 0;
    }

    public void recursiveReverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        recursiveReverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
