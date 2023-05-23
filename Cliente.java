public class Cliente implements Comparable<Cliente>{
    private String nome;
    private String email;
    private String indirizzo;
    public Cliente(String nome,String email,String indirizzo){
        this.nome=nome;
        this.email=email;
        this.indirizzo=indirizzo;
    }
    public Cliente (){
        this.nome=null;
        this.email=null;
        this.indirizzo=null;
    }
    public String getNome(){return this.nome;}
    public String getEmail(){return this.email;}
    public String getIndirizzo(){return this.indirizzo;}
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setIndirizzo(String indirizzo){
        this.indirizzo=indirizzo;
    }
    
    public String toString(){
        return "\n nome: "+getNome()+" \n indririzzo: "+getIndirizzo()+"\n email: "+ getEmail();
    }
    public int compareTo(Cliente c){
        if(!(this.email.equals(c.getEmail()))){
            return 1;
        }else{
            return 0;
        }
    }

}