public class Couplet extends Poem {
    private String title;
    
    public Couplet (String title) {
       super("Couplet",2);
       this.title = title;
    }
    
    //getter for couplet title
    public String title () {
       return title;
    }
   
    
    public void display () {
       System.out.print(title() + " is a " + name() + " poem consisting of " + numberLines() + " lines.");
    }
 
 }