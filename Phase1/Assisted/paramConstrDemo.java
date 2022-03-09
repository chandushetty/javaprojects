package assistedpractise;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrDemo {
public static void main(String[] args) {

	Std std1=new Std(2,"Chandu");
	Std std2=new Std(10,"Manoj");
	std1.display();
	std2.display();
		}
}

