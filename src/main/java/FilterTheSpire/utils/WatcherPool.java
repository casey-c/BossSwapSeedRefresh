package FilterTheSpire.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class WatcherPool extends CharacterPool {
    private static WatcherPool singleton = null;

    public static WatcherPool getInstance(){
        if (singleton == null){
            singleton = new WatcherPool();
        }
        return singleton;
    }

    private WatcherPool(){
        cardPool = new ArrayList<>(Arrays.asList(
            "EmptyFist",
            "Prostrate",
            "Evaluate",
            "CrushJoints",
            "PathToVictory",
            "FollowUp",
            "CutThroughFate",
            "SashWhip",
            "EmptyBody",
            "ClearTheMind",
            "Crescendo",
            "ThirdEye",
            "Protect",
            "FlurryOfBlows",
            "JustLucky",
            "Halt",
            "FlyingSleeves",
            "BowlingBash",
            "Consecrate",
            "Pray",
            "SignatureMove",
            "Weave",
            "EmptyMind",
            "Nirvana",
            "Tantrum",
            "Conclude",
            "Worship",
            "Swivel",
            "Perseverance",
            "Meditate",
            "Study",
            "WaveOfTheHand",
            "SandsOfTime",
            "FearNoEvil",
            "ReachHeaven",
            "MentalFortress",
            "DeceiveReality",
            "Adaptation",
            "InnerPeace",
            "Collect",
            "WreathOfFlame",
            "Wallop",
            "CarveReality",
            "Fasting2",
            "LikeWater",
            "ForeignInfluence",
            "WindmillStrike",
            "Indignation",
            "BattleHymn",
            "TalkToTheHand",
            "Sanctity",
            "Wireheading",
            "Vengeance",
            "WheelKick",
            "Judgement",
            "ConjureBlade",
            "MasterReality",
            "Brilliance",
            "Devotion",
            "Blasphemy",
            "Ragnarok",
            "LessonLearned",
            "Scrawl",
            "Vault",
            "Alpha",
            "Wish",
            "Omniscience",
            "Establishment",
            "SpiritShield",
            "DevaForm",
            "DeusExMachina"
        ));

        commonRelicPool = getSharedCommonRelicPool();
        commonRelicPool.add("Damaru");

        uncommonRelicPool = getSharedUncommonRelicPool();
        uncommonRelicPool.add("Yang");
        uncommonRelicPool.add("TeardropLocket");

        rareRelicPool = getSharedRareRelicPool();
        rareRelicPool.add("CloakClasp");
        rareRelicPool.add("GoldenEye");

        bossRelicPool = getSharedBossRelicPool();
        bossRelicPool.add("HolyWater");
        bossRelicPool.add("VioletLotus");

        shopRelicPool = getSharedShopRelicPool();
        shopRelicPool.add("Melange");
    }
}
