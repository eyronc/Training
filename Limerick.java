public class Limerick extends Poem {
    private String title;
    
    public Limerick (String title) {
       super("Limerick",5);
       this.title = title;
    }
    
    //getter for limerick title
    public String title () {
       return title;
    }
 
    
    public void display () {
       System.out.print(title() + " is a " + name() + " poem consisting of " + numberLines() + " lines.");
    }
 
 }