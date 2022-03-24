public class App {
    public static void main(String[] args) 
    throws Exception {
        //Declara um objeto Caneta e instacia ele
        Caneta  c1 = new Caneta();
        c1.iniciarCaneta("Bic", "azul", 1.0);
        Caneta c2 = new Caneta();
        c2.iniciarCaneta("Stabillo", "vermelha", 0.4);
        
        c1.escrever("O hashira do som é um cara diferenciado, mas não é melhor hashira. Contudo ninguém nega que o Muzsan parece o Michael Jackson rsrssrsssrsrrsrssrrsrsrsrsrsrs é Musan");
        c2.escrever("Qual é o melhor hashira?");
        
    }
    
}
