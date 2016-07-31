package com.bet123.api;

import java.util.List;

public final class BetWebService implements IBetWebService {
	/**
	 * Gets list of teams available for betting.
	 * @return list of team available for betting.
	 */
	public List<String> GetTeams()
	{
		return null;
	}
	
	/**
	 * Gets set of games a team is playing or will be playing
	 * @param teamId - team identifier
	 * @return team's current or future games
	 */
	public List<String> GetGames(int teamId)
	{
		return null;
	}
	
	/**
	 * Set of betting lines for a specific game
	 * @param teamId - team identifier
	 * @param gameId - game identifier
	 * @return betting lines for a game 
	 */
	public List<String> GetLines(int teamId, int gameId)
	{
		return null;
	}
}
