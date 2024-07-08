package day4;

class AccessModifierExample {
    private String privateVar = "I am private";
    protected String protectedVar = "I am protected";
    public String publicVar = "I am public";

    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }
}