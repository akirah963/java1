class Parent {  
    public String parentName = "ParentName";  
    protected int parentAge = 50;  
    private String parentSecret = "ParentSecret"; 
    public String getParentSecret() {  
        return parentSecret;  
    }  
}  

class Child extends Parent {  
    public String childName = "ChildName";  

    public void printParentFields() {  
        System.out.println("Parent Name: " + super.parentName);  
        System.out.println("Parent Age: " + super.parentAge);  
        System.out.println("Parent Secret: " + super.getParentSecret());  
    }  

    public static void main(String[] args) {  
        Child child = new Child();  
        child.printParentFields();  
    }  
}  