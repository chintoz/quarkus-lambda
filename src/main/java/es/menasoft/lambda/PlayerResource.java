package es.menasoft.lambda;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/players")
public class PlayerResource {
    private static final Map<String, Player> players = new HashMap<>();

    static {
        players.put("0001", Player.builder().name("Tiger Hovland").club("Augusta").handicap(0).build());
        players.put("0002", Player.builder().name("Jacinto Ram").club("El Coto").handicap(18.5).build());
    }

    @GET
    public List<Player> getPlayers() {
        return players.values().stream().toList();
    }
}
