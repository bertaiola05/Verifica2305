import java.util.PriorityQueue;

public class Pizzeria{
    private static PriorityQueue<Cliente> pizzeria= new PriorityQueue(100);

    public static Cliente cerca(String mail){
        Cliente[] clienti=new Cliente[100];
        clienti=pizzeria.toArray(new Cliente[pizzeria.size()]);
        for(int i=0;i<pizzeria.size();i++){
            if(clienti[i].getEmail().equals(mail)){
                return clienti[i];
            }
        }
        return null;
    }
    public static void main(){
        Cliente c1=new Cliente ("francesco","francesco.bertaiola@salesianiverona.it","via casio rolex");
        Cliente c2=new Cliente ("kikko","kikko@gmail.com","via rom");
        Cliente c3=new Cliente ("lollo","lollo.fontana@vaticano.roma","via le mani");
        
        try{
            pizzeria.add(c1);
            pizzeria.add(c2);
            pizzeria.add(c3);
        }catch(ClassCastException|NullPointerException e){
            
        }
        try{
            Cliente t=cerca(c2.getEmail());
            if(t!=null){
                System.out.println(t.toString());
            }else{
                System.out.println("Errore");
            }
        }catch(NullPointerException e){
            
        }
        System.out.println(pizzeria.remove(pizzeria.peek()));
        try{
            Cliente t=cerca(c1.getEmail());
            if(t!=null){
                System.out.println(t.toString());
            }else{
                System.out.println("Errore");
            }
        }catch(NullPointerException e){
            
        }
                System.out.println(pizzeria.remove(pizzeria.peek()));
              try{
            Cliente t=cerca(c2.getEmail());
            if(t!=null){
                System.out.println(t.toString());
            }else{
                System.out.println("Errore");
            }
        }catch(NullPointerException e){
            
        }  
    }
}