  public class linkedlist
{
    class  Node 
{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


 Node head = null;
 Node tail = null;

 void create(int data)
{
  
    Node newnode = new Node(data);
    
    if(head == null)
    {
        head = newnode;
        tail = newnode;
        
    }
    else 
    {
       tail.next = newnode;
       tail = tail.next;
    }
    
}


void insert(int val,int pos)
{
    Node newnode = new Node(val);
    
    if(head == null)
    {
        head= newnode;
        tail = newnode;
    }
    
    if( pos == 0)
    {
        newnode.next = head;
        head = newnode;
    }
    else 
    {
        Node temp;
        temp = head;
        
        for(int i =1 ; i< pos;i++)
        {
            temp = temp.next;
        }
        
        newnode.next = temp.next;
        temp.next = newnode;
    }
    
}

void insert_last(int val){
    
    Node newnode = new Node(val);
    
    Node temp = head;
   
   while(temp.next != null)
   {
     temp = temp.next;
   }
   
   temp.next = newnode;
   newnode = tail;
}


 void display()
{
    Node temp = head;
    
    System.out.println("The linked list elelments are ");
    
    while(temp != null)
    {
        System.out.println(temp.data);
        
        temp = temp.next;
    }
    
}

public static void main (String[] args) {
    
   linkedlist slist = new linkedlist();
   
   slist.create(5);
   slist.create(7);
   slist.display();
   slist.insert(2,1);
   slist.insert_last(8);
   slist.display();
}
}
    
