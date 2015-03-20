public class Sauce extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] sauce = new String[15];
    public Sauce(BurgerDecorator burgerDecorator,String[] sauce){
       this.burgerDecorator= burgerDecorator;
       this.sauce = sauce;
    }
    public void printDescription(){
        String desc= "";        
        burgerDecorator.printDescription();
        for (int i=0;i<sauce.length;i++){
            desc =desc + sauce[i];
            if(i!=sauce.length-1)
            {
                desc = desc + " + ";
            }            
        }
        System.out.println("  -"+desc);
    }
    //one cheese is free
    public double cost(){
        if(sauce.length>1){
            return (1*(sauce.length-1))+burgerDecorator.cost();
        }
         else
            return 0+ burgerDecorator.cost();
    }
}
