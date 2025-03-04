

/**
 * Sports event class, includes sports types
 * @author Kutay Demiray
 */
public class SportsEvent extends Event {

    // constants
    final static String[] types = { "Football" , "Basketball" , "Volleyball" , "Video Games" , "Other"};

    final static int FOOTBALL_EVENT = 0;
    final static int BASKETBALL_EVENT = 1;
    final static int VOLLEYBALL_EVENT = 2;
    final static int VIDEO_GAMES_EVENT = 3;
    final static int OTHER_SPORTS_EVENT = 4;

    // properties
    private int type;

    // constructor
    public SportsEvent( String title, User organiser, Time duration, int capacity, Location location, int accessStatus, int type ) {
        super( title, organiser, duration, capacity, location, accessStatus );
		this.type = type;
    }
	
	// methods
	
	String getType() {
		return types[ type ];
	}
	
	void setType( int type ) {
		this.type = type;
	}

}