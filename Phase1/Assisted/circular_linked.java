package assistedpractise;
public class circular_linked{  
	int data;  
	circular_linked next;  
	
public circular_linked(int data) {  
	this.data = data;  
}  
 
public circular_linked() {
	// TODO Auto-generated constructor stub
}

public circular_linked head = null;  
public circular_linked tail = null;  
 
public void add(int data){  

	circular_linked newNode = new circular_linked(data);  
  
		if(head == null) 
		{  
   
			head = newNode;  
			tail = newNode;  
			newNode.next = head;  
		}  
		else
		
		{  
  
			tail.next = newNode;    
			tail = newNode;  
  
			tail.next = head;  
		}  
}  
  
public void sortList() {  

	circular_linked current = head, index = null;  
	int temp;  
	if(head == null) {  
		System.out.println("List is empty");  
}  
	else {  
		do{  
 
			index = current.next;  
			while(index != head) {  
  
				if(current.data > index.data) {  
					temp =current.data;  
					current.data= index.data;  
					index.data = temp;  
				}  
				index= index.next;  
			}  
			current =current.next;  
		}while(current.next != head);   
	}  
}  

public void display() {  
	circular_linked current = head;  
	if(head == null) {  
		System.out.println("List is empty");  
	}  
	else {  
		do{    
			System.out.print(" "+ current.data);  
			current = current.next;  
}
		while(current != head);  
		System.out.println();  
}  
}  
public static void main(String[] args) {  
	circular_linked cl = new circular_linked();  
  
cl.add(70);  
cl.add(90);  
cl.add(20);  
cl.add(100);  
cl.add(50);  
 
System.out.println("Original list: ");  
cl.display();  
  
cl.sortList();  

System.out.println("Sorted list: ");  
cl.display();  
}  
}
