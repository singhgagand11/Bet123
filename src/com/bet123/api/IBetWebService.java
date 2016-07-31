package com.bet123.api;

import java.util.List;

/**
 * Bet Web Service Api
 * @author gagandeep
 *
 */
public interface IBetWebService {
	
	/**
	 * Gets list of teams available for betting.
	 * @return list of team available for betting.
	 */
	List<String> GetTeams();
	
	/**
	 * Gets set of games a team is playing or will be playing
	 * @param teamId - team identifier
	 * @return team's current or future games
	 */
	List<String> GetGames(int teamId);
	
	/**
	 * Set of betting lines for a specific game
	 * @param teamId - team identifier
	 * @param gameId - game identifier
	 * @return betting lines for a game 
	 */
	List<String> GetLines(int teamId, int gameId);
}
