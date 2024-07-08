package day4;

public class AccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExample example = new AccessModifierExample();
        System.out.println(example.publicVar);
        example.publicMethod();
        System.out.println(example.protectedVar);
        example.protectedMethod();
	}

}
