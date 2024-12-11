class Main{
    // why does JVM look for the main() method? --- apparently might have something to do with Java being based off of C
    // standard static main() method w/ no return (void)
    public static void main(String[] args) {
        // instantiate an obj of 'Ocarina' class
        Ocarina zelda = new Ocarina();

        /* below code will NOT work as instance variable back in 'Ocarina' class has access modifier set to 'private' so only local to that class */
        // zelda.song = "Song of Time";
        // System.out.println(zelda.song);

        // call .setSong() setter method to set song to new one
        zelda.setSong("Song of Time");
        // retrieve song using .getSong() getter method & print output stream
        System.out.println("zelda obj is currently holding " + zelda.getSong());

        // invoke .setSong() setter/mutator method to set song to a different one
        zelda.setSong("Zelda's Lullaby");
        // play song via .getSong() getter/accessor method & console log it out
        System.out.println("zelda obj's new song: " + zelda.getSong());

        // create a new instance of 'Ocarina' obj
        Ocarina link = new Ocarina();

        // set the 'song' & 'color' instance fields in 'Ocarina' class for 'link' obj to corresponding values
        link.setSong("Epona's Song");
        link.setColor("Blue");

        // print ostream to console log
        System.out.println("Link carries a (" + link.getColor() + ") Ocarina and calls his horse Epona using '" +
        link.getSong() + "'. Link meets Zelda at Hyrule Casstle and learns '" + zelda.getSong() + "' together!");

    }
}
