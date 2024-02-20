package javaTasks.Task1_S2_OOP;
import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void
    releaseFromMarket(List<Actor> actors);
    void update();

}
