public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private String sayings;
    private int calories;
    private double costPerPound;
    private boolean available;
    private int stock;
    private int size;

    // CONSTRUCTORS
    public Heart() {
        color="";
        size=0;
        sayings="";
        calories=0;
        costPerPound=0;
        available=false;
        stock=0;
    } // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(String color, int size, String sayings, int calories, double costPerPound, boolean available, int stock){
        this.color=color;
        this.size=size;
        this.sayings=sayings;
        this.calories=calories;
        this.costPerPound=costPerPound;
        this.available=available;
        this.stock=stock;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    //Add remaining Accessor methods here...
    public String getSayings() {
        return this.sayings;
    }
    public int getCalories() {
        return this.calories;
    }
    public double getCostPerPound() {
        return this.costPerPound;
    }
    public boolean getAvailable() {
        return this.available;
    }
    public int getStock() {
        return this.stock;
    }
    public int getSize() {
        return this.size;
    }
    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...
    public void setWriting(String sayings){
        this.sayings= sayings;
    }
    public void setCalories(int calories){
        this.calories= calories;
    }
    public void setCostPerPound(int costPerPound){
        this.costPerPound= costPerPound;
    }
    public void setAvailable(boolean available){
        this.available= available;
    }
    public void setStock(int stock){
        this.stock= stock;
    }
    public void setSize(int size){
        this.size= size;
    }
    // METHODS
    public String report() {
        return this.color+"\n"+this.size+"\n"+this.sayings+"\n"+this.calories+"\n"+this.costPerPound+"\n"+this.available+"\n"+this.stock;// Add other properties here as you add them to the class

    }
    public void adjPrice(int costPerPound, int percent){
        this.costPerPound=costPerPound*((percent/100)+1);
    }
    public void inStock(){
        int stock=this.stock;
        if(stock>0){
            this.available=true;
        }
        else{
            this.available=false;
        }
    }
    //Write other methods here (if needed)...
    public void adjStock(int newStock){
        if(newStock<0){
            newStock=0;
            this.stock=newStock;
        }
        else{
            this.stock=newStock;
        }
        inStock();
    }
}
