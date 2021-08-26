package org.example.tournamentwinner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {


    /*
        1 winner - no ties

        O(n) time - # of competitions - loop through all competitions
        O(k) space - # of teams - save each team in a map with its scores
     */

    private static final int HOME_TEAM_WON = 1;
    private static final int POINTS_PER_WIN = 3;

    public String tournamentWinner(final List<List<String>> competitions, final List<Integer> results) {
        var currentBestTeam = "";
        final Map<String,Integer> scoresMap = new HashMap<>();
        scoresMap.put(currentBestTeam,0);

        var index = 0;
        for(final var competition : competitions) {
            final var result = results.get(index);
            final var homeTeam = competition.get(0);
            final var awayTeam = competition.get(1);
            final var winningTeam = result == HOME_TEAM_WON ? homeTeam : awayTeam;

            updateScores(winningTeam,POINTS_PER_WIN,scoresMap);

            currentBestTeam = scoresMap.get(winningTeam) > scoresMap.get(currentBestTeam) ? winningTeam : currentBestTeam;
            index++;
        }

        return currentBestTeam;
    }


    private void updateScores(final String team, final int points, final Map<String,Integer> scoresMap) {
        final int teamCurrentScore = scoresMap.getOrDefault(team,0);
        final int totalPoints = teamCurrentScore + points;
        scoresMap.put(team,totalPoints);
    }
}
