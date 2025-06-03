class Superclass {
    private int privateMember;
    public Superclass(int value) {
        privateMember = value;
    }
    public int getPrivateMember() {
        return privateMember;
    }
}
class Subclass extends Superclass {   
    public Subclass(int value) {
        super(value);
    }
    public void accessPrivateMember() {
        int value = getPrivateMember();
        System.out.println("Accessed privateMember in the subclass: " + value);
    }
}
public class AccessPrivateMemberExample {
    public static void main(String[] args) {
        Subclass subclassInstance = new Subclass(42);
        subclassInstance.accessPrivateMember();
    }
}

