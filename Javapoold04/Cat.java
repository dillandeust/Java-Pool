public class Cat extends Animal{
    
    private static String color="grey";
    
    public  Cat(String name){
        super(name, 4, Type.MAMMAL);
       System.out.println(name +": MEEEOOWWWW");
    }
    
    public  Cat(String name, String cColor){
        super(name, 4, Type.MAMMAL);
        color = cColor;
       System.out.println(name +": MEEEOOWWWW");
    }

    public  void meow(){
        System.out.println(getName() +" the "+ color+ " kitty is meowing.");
    }

    public String getColor(){
        return color;
    }


}
