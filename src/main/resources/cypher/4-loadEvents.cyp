// 4-loadEvents
USING PERIODIC COMMIT 1000
LOAD CSV WITH HEADERS FROM "file:///C:/Users/ahamadam/dev/workspace/neo4j-neo4j_ogm/src/main/resources/cypher/csv/events.csv" AS csvLine

MATCH (home)<-[:HOME_TEAM]-(match:Match {id: csvLine.match_id})-[:AWAY_TEAM]->(away)

MATCH (player:Player {id: csvLine.player_id})-[:IN_SQUAD]->(squad)<-[:NAMED_SQUAD]-(team)
MATCH (player)-[:STARTED|:SUBSTITUTE]->(stats:STATS)-[:IN_MATCH]->(match)

// goals
FOREACH(n IN (CASE WHEN csvLine.type IN ["penalty", "goal", "owngoal"] THEN [1] else [] END) |
	FOREACH(t IN CASE WHEN team = home THEN [home] ELSE [away] END |
		MERGE (stats:STATS)-[:SCORED_GOAL]->(penalty:Goal {match_id: csvLine.match_id, player_id: csvLine.player_id, time: csvLine.time, type: csvLine.type})
	)		
)

// cards
FOREACH(n IN (CASE WHEN csvLine.type IN ["yellow", "red", "yellowred"] THEN [1] else [] END) |
	FOREACH(t IN CASE WHEN team = home THEN [home] ELSE [away] END |
		MERGE (stats:STATS)-[:RECEIVED_CARD]->(card {match_id: csvLine.match_id, player_id: csvLine.player_id, time: csvLine.time, type: csvLine.type})
	)		
)
;