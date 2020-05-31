
package SLL;
import SLL.SingleNode;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode createSingleLinkedList(final int value) {
        head = new SingleNode();
        final SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;

    }
    public SingleNode getHead() {
		return head;
	}

	public void setHead(final SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(final SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(final int size) {
		this.size = size;
    }
    public boolean existsLinkedList(){
        return head != null;
    }
    
    public void insertInLinkedList(final int value, int loc) {
        final SingleNode node = new SingleNode();
        node.setValue(value);
        if (!existsLinkedList()) {
            System.out.println("Linked list doesnt exists");
            return;
        } else if (loc = 0) {
            node.setNext(head);
            head = node;
        } else if (loc >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }
            final SingleNode nextNode = tempNode.getNext();
            node.setNext(nextNode);
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }

    void traverseLinkedList() {
        if (existsLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                if (i != getSize() - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked List doesnt exists");
        }
        System.out.println();

    }

    boolean searchNode(final int value) {
        if (existsLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (value == tempNode.getValue()) {
                    System.out.println("Found at " + i);
                    return true;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
        }
        System.out.println("Node not found");
        return false;
    }

    void deleteLinkedList() {
        System.out.println("Deleting");
        head = null;
        tail = null;
        System.out.println("Linked List deleted");
        return;
    }

    void deletionOfNode(final int loc) {
        if(!existsLinkedList()){
            System.out.println("Linkedlist doesnot exists");
            return;
        }
        else if(loc == 0){
            head = head.getNext();
            setSize(getSize() -1);
            if(getSize() == 0){
                tail = null;
            }
        }
        else if(loc >= getSize()){
            SingleNode tempNode = head;
            for (int i =0 ; i< size; i++){
                tempNode = tempNode.getNext();
            }
            if(tempNode == head){
                tail = null;
                head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(tail);
            tail = tempNode;
            setSize(getSize() - 1);
        }
        else{
            SingleNode tempNode = head;
            for(int i=0;i<loc -1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }

    }

}