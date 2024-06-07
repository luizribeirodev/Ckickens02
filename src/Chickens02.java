public class Chickens02 {
    public static void main(String[] args) {
                                    //Declarando variaveis
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit ;
        double eggs = 0;
        
        eggs += 100;            //Segunda-feira
        eggs += 121;            //Terça-feira
        eggs += 117;            //Quarta-feira    
        
        dailyAverage = eggs / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;
        
        

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
