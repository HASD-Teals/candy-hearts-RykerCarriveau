import java.util.Scanner;

public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart group1=new Heart("red", 3, "Hi", 30, 5.00, true, 50);
        Heart group2=new Heart("teal", 5, "Love CS-A", 50, 4.50, true, 200);
        Heart group3=new Heart("green", 2, "Go Girl!", 20, 3.50, true, 75);
        Heart[] store={group1,group2,group3};
        System.out.println(group1.report());
        System.out.println(buyOut(store));
        group2.adjStock(500);
        System.out.println(group2.report());
        order(store);
    }
    public static int buyOut(Heart[] arr1){
        int heartNumber=0;
        Heart fake= new Heart();
        for(int i=0;i<arr1.length;i++){
            fake=arr1[i];
            heartNumber=heartNumber+fake.getStock();
        }
        return heartNumber;
    }
    public static void order(Heart[] hearts){
        Scanner user=new Scanner(System.in);
        boolean correctColor=false;
        Heart total=new Heart();
        System.out.println("What color do you want?: ");
        String color=user.nextLine();
        System.out.println("How many do you want?: ");
        int number=user.nextInt();
        for(int j=0;j<hearts.length;j++){
            total=hearts[j];
            if(total.getColor().equals(color)){
                correctColor=true;
                if(number<=total.getStock()){
                    System.out.println("Color: "+total.getColor()+"\n"+"Total Calories: "+(total.getCalories()*number)+"\n"+"Saying: "+total.getSayings()+"\n"+"Size of Each: "+total.getSize()+"\n"+"Number Bought: "+number+"\n"+"Total Cost: $"+(total.getCostPerPound()*number));
                    hearts[j].setStock(hearts[j].getStock()-number);
                    return;
                }
                else{
                    System.out.println("Not Enough Stock");
                }
            }
            else if(correctColor==false && j==hearts.length-1){
                System.out.println("Not an Available Color");
            }
        }
    }
}
