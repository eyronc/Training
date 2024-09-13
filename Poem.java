public class Poem {
    public String name;
    public int numberLines;
    
    //constructor
    public Poem (String name, int numberLines) {
       this.name = name;
       this.numberLines = numberLines;
    }
 
    //getter for poem name
    public String name () {
       return name;
    }
    
    //getter for poem lines
    public int numberLines () {
       return numberLines;
    }
    
 }