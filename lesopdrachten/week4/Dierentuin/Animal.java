interface Animal {
    
    void eat();
    
    void sleep();
    
    default void makeSound() {
        System.out.println("Animal making a sound");
    }
}