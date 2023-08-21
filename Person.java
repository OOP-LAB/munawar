class Person {
    private String name;
    private int age;
   
    // Default constructor
    public Person() {
        name = "";
        age = 0;
    }
   
    // Constructor that takes a name parameter
    public Person(String name) {
        this.name = name;
        age = 0;
    }
   
    // Constructor that takes both name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " " + age;
    }
}
class PrepBytes
{
    public static void main(String args[]){
        Person p1 = new Person();
        Person p2 = new Person("PrepBuddy");
        Person p3 = new Person("PrepBuddy", 18);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    }
