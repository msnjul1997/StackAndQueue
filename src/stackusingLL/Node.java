package stackusingLL;

public class Node {
	 int data;
	    Node next;
	    public Node(int data)
	    {
	        this.data = data;
	        this.next = null;
	    }


	//public class LinkedList {
//	    //Head of list
//	    static Node head;
//	    static Scanner sc = new Scanner(System.in);
	//
//	    //Inserting data at last
//	    public  void insert(int data) {
//	        Node node = new Node(data);
	//
//	        if(head == null) {
//	            head = node;
//	        }else {
//	            Node temp = head;
//	            while(temp.next != null) {
//	                temp = temp.next;
//	            }
//	            temp.next = node;
//	        }
//	    }
//	    //Inserting first
//	    public void insertFirst(int data)
//	    {
//	        Node node = new Node(data);
//	        node.next = head;
//	        head = node;
//	    }
//	    //remove all the nodes
//	    public void removeAll()
//	    {
//	        head = null;
//	    }
//	    //Insert After
//	    public void insertAfter(int data,int dataAfter) {
//	        Node node = new Node(data);
//	        Node temp = head;
//	        while (temp.data != dataAfter) {
//	            temp = temp.next;
//	        }
//	        node.next = temp.next;
//	        temp.next = node;
//	    }
//	    //Delete first
//	    public void deleteFirst()
//	    {
//	        head = head.next;
//	    }
//	    //Delete last
//	    public void deleteLast()
//	    {
//	        Node temp = head;
//	        while(temp.next.next != null)
//	        {
//	            temp = temp.next;
//	        }
//	        temp.next = null;
//	    }
//	    //Delete the data
//	    public void deleteData(int data)
//	    {
//	        Node node = new Node(data);
//	        Node temp = head;
//	        while(temp.next.data != data)
//	        {
//	            temp = temp.next;
//	        }
//	        temp.next = temp.next.next;
//	    }
	//
//	    //Searching node
//	    public void searchNode(int data)
//	    {
	//
//	        if(head.data == data)
//	        {
//	            System.out.println("The node with data "+data+ " is present at location 1");
//	            return;
//	        }
//	        Node node = new Node(data);
//	        Node temp = head;
//	        int count =2;
//	        while(temp.data != data)
//	        {
//	            temp = temp.next;
//	            count++;
//	        }
//	        System.out.println("The node with data "+data+" is present at "+count+" location");
	//
//	    }
//	    //Sorting
//	    public void sortData()
//	    {
//	        if(head == null)
//	        {
//	            System.out.println("List is empty");
//	            return;
//	        }
//	        int data;
//	        Node temp = head,index = null;
//	        while(temp != null)
//	        {
//	            index = temp.next;
//	            while (index!= null) {
//	                if (temp.data > index.data) {
//	                    data = temp.data;
//	                    temp.data = index.data;
//	                    index.data = data;
//	                }
//	                index = index.next;
//	            }
//	            temp = temp.next;
//	        }
//	    }
//	    //Printing list
//	    public  void printList() {
	//
//	        Node temp = head;
	//
//	        while(temp != null) {
//	            System.out.print(temp.data+"->");
//	            temp = temp.next;
//	        }
//	    }
	//
	//}

}

