package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

	private TestSportByEnumeration() {
	}

	/**
	 * @param args ignored
	 */
	public static void main(final String... args) {
		/*
		 * [TEST DEFINITION]
		 * 
		 * By now, you know how to do it
		 */
		// TODO
		final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<User>("Davide", "Cassani",
				"dcassani", 53);

		/*
		 * Cassani practiced bike and loves F1 and MotoGP
		 */
		dcassani.addSport(Sport.bike, Sport.F1, Sport.motogp);
		System.out.println(
				"Cassani has been a professional biker: " + dcassani.hasSport(Sport.bike));
		System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(Sport.soccer));

	}
}
