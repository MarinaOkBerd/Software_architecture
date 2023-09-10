package Rewards.Stones;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class StonesGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new StonesRewards();
    }
    
}
