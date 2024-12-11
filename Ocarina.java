/* Encapsulation Example */
public class Ocarina {
    /* best practice for variables to have access modifiers of 'private' 
    -- especially for instance fields in Encapsulation */
    private String color;
    private String song;

    // getter ("access") method for instance field 'color'
    // conventionally 'public'
    // used to get something back --- need a return type (not 'void' -- same as instance field here)
    public String getColor(){
        // return back value
        return color;
    }

    // setter ("mutator") method for instance field 'color'
    // best practice for access modifier to be 'public'
    // only to 'set' a value -- no return -- 'void'
    public void setColor(String color){ // here 'color' is a placeholder -- just set to 'color' to describe what's it inputting
        // set 'Oscarina' class instance field 'color' (via 'this') to arg String 'color'
        this.color = color;
    }

    // getter ("accessor") method/behavior for instance field 'song'
    public String getSong(){
        return song;
    }

    // setter ("mutator") method/behavior for instance field 'song'
    public void setSong(String song){
        // setting instance variable/field song to arg String 'song'
        this.song = song;
    }

}

/* Encapsulation conventions:
 1) All instance fields for class are 'private'
 2) Each field has a corresponding getter & setter method w/ access modifier set to 'public'
 2a) ... getter ("accessor") method -- return something ('String, int, double, etc.')
     ... naming convention: getVariableName()
 2b) ... setter ("mutator") method -- set instance variable to arg no return ('void')
     ... naming convention: setVariableName()
*/
