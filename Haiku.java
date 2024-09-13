public class Haiku extends Poem {
    private String title;
    
    public Haiku (String title) {
       super("Haiku",3);
       this.title = title;
    }
    
    //getter for haiku title
    public String title () {
       return title;
    }
 
    
    public void display () {
       System.out.print(title() + " is a " + name() + " poem consisting of " + numberLines() + " lines.");
    }
 
 }