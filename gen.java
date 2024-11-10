import java.util.Random;

public class RandomGenerator {
    private static final String[] NATIONALITIES = {
        "American", "Canadian", "Mexican", "Brazilian", "British", "French", "German",
        "Italian", "Spanish", "Chinese", "Japanese", "Korean", "Indian", "Australian",
        "Russian", "South African", "Egyptian", "Nigerian", "Kenyan", "Argentinian"
    };

    private static final String[] VERBS = {
        "run", "jump", "swim", "dance", "read", "write", "sing", "talk", "laugh", "cry",
        "eat", "drink", "sleep", "wake", "smile", "frown", "think", "dream", "plan",
        "build", "create", "destroy", "paint", "draw", "play", "work", "shop", "travel",
        "drive", "fly", "climb", "walk", "hike", "cook", "bake", "speak", "listen", 
        "watch", "explore", "teach", "learn", "study", "meditate", "relax", "exercise",
        "skip", "hop", "jog", "lift", "throw", "catch", "kick", "shoot", "score", 
        "win", "lose", "cheer", "boo", "whistle", "clap", "hug", "kiss", "shake", 
        "touch", "feel", "sense", "imagine", "wonder", "ponder", "reflect", "consider",
        "evaluate", "judge", "choose", "select", "prefer", "decide", "agree", 
        "disagree", "argue", "debate", "discuss", "share", "borrow", "lend", "give", 
        "take", "accept", "reject", "receive", "send", "delivering", "pack", "unwrap", 
        "open", "close", "finish", "begging"
    };

    public static void main(String[] args) {
        Random random = new Random();

        // Generate random nationality
        int nationalityIndex = random.nextInt(NATIONALITIES.length);
        String randomNationality = NATIONALITIES[nationalityIndex];
        System.out.println("Random Nationality: " + randomNationality);

        // Generate random verb
        int verbIndex = random.nextInt(VERBS.length);
        String randomVerb = VERBS[verbIndex];
        System.out.println("Random Verb: " + randomVerb);
    }
}