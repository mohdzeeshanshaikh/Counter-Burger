public class Burger extends BurgerDecorator  
{
    String type ="";
    String size ="";
    String serve="";
    public Burger(String type,String size,String serve){
        this.type=type;
        this.size=size;
        this.serve=serve;
        description = type + " + "+ size + " + " + serve;
    }
    
    public double cost(){
        double cost=0;
        
        if(size.equals("1/3lb")){
            cost= 9.50;
        }
        else if(size.equals("2/3lb")){
            cost=11.50;
        }
        else if(size.equals("1lb")){
            cost= 15.50;
        }
        
        if(serve.equals("In a Bowl")){
            cost=cost+1;
        }
        
        return cost;
        }
    
     
}
