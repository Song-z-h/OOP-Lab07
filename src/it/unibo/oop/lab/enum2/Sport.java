/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.OUTDOOR, 10, "basket"),
	VOLLEY(Place.INDOOR, 10, "volley"),
	TENNIS(Place.OUTDOOR, 4, "tennis"),
	BIKE(Place.OUTDOOR, 1, "bike"),
	F1(Place.OUTDOOR, 1, "f1"),
	MOTOGP(Place.OUTDOOR, 1, "motogp"),
	SOCCER(Place.OUTDOOR, 22, "soccer");

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int numMembers;
	private final String sportName;
	private final Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.numMembers = noTeamMembers;
		this.sportName = actualName;
		this.place = place;
	}
	

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	 public boolean isIndividualSport() {
		 return numMembers == 1;
	 }
	 
	 public boolean isIndoorSport() {
		 return place.equals(Place.INDOOR);
	 }
	 
	 public Place getPlace() {
		 return this.place;
	 }
	 
	 public String toString() {
		 return this.sportName;
	 }
}
