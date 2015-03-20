public class Cheese extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] cheese = new String[8];
    public Cheese(BurgerDecorator burgerDecorator,String[] cheese){
       this.burgerDecorator= burgerDecorator;
       this.cheese = cheese;
    }
    public void printDescription(){
        String desc="";
       burgerDecorator.printDescription();
        for (int i=0;i<cheese.length;i++){
            desc =desc + cheese[i];
            if(i!=cheese.length-1)
            {
                desc = desc + " + ";
            }
            
        }
        System.out.println("  -"+desc);
    }
    //one cheese is free
    public double cost(){
        if(cheese.length>1){
            return (1*(cheese.length-1))+burgerDecorator.cost();
        }
         else
            return 0+ burgerDecorator.cost();
    }
}
