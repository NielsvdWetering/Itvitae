public abstract class AbstractAnimal implements Animal {
    String name;
    int age;
    
    public void eat() {
        System.out.println("smak smak");
    }
    
    public void sleep() {
        System.out.println("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }
    
    AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}