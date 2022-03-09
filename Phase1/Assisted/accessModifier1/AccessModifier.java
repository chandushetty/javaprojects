package accessModifier1;

public class AccessModifier {
    public static void main(String[] args) {
    	
    	System.out.println("Dafault Access specifier");
    	defAccessSpecifier obj = new defAccessSpecifier();
    	obj.display();
	}
}
class defAccessSpecifier
{
	void display() {
		System.out.println("You are using defalut access specifier");
	}
	
}
