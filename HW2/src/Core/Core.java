package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Abstractions.ItemGenerator;
import Rewards.Bronze.BronzeGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Stones.StonesGenerator;

public class Core {
    public void run(){
       List<ItemGenerator> generatorList = new ArrayList<>();
       generatorList.add(new GoldGenerator());
       generatorList.add(new SilverGenerator());
       generatorList.add(new BronzeGenerator());
       generatorList.add(new StonesGenerator());
       Random random = new Random();
       ItemGenerator generator = generatorList.get(random.nextInt(0, generatorList.size()));
       System.out.println(generator.openReward()); 
    }
}
