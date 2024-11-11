// just use the website!
import java.util.Random;

public class RandomGenerator {
    private static final String[] NATIONALITIES = {
        "American", "Canadian", "Mexican", "Brazilian", "British", "French", "German",
        "Italian", "Spanish", "Chinese", "Japanese", "Korean", "Indian", "Australian",
        "Russian", "South African", "Egyptian", "Nigerian", "Kenyan", "Argentinian"
    };

    private static final String[] VERBS = {
        "running", "jumping", "swimming", "dancing", "reading", "writing", "singing", "talking", "laughing", "crying", "eating", "drinking", "sleeping", "waking", "smiling", "frowning", "thinking", "dreaming", "planning", "building", "creating", "destroying", "painting", "drawing", "playing", "working", "shopping", "traveling", "driving", "flying", "climbing", "walking", "hiking", "cooking", "baking", "speaking", "listening", "watching", "exploring", "teaching", "learning", "studying", "meditating", "relaxing", "exercising", "skipping", "hopping", "jogging", "lifting", "throwing", "catching", "kicking", "shooting", "scoring", "winning", "losing", "cheering", "booing", "whistling", "clapping", "hugging", "kissing", "shaking", "touching", "feeling", "sensing", "imagining", "wondering", "pondering", "reflecting", "considering", "evaluating", "judging", "choosing", "selecting", "preferring", "deciding", "agreeing", "disagreeing", "arguing", "debating", "discussing", "sharing", "borrowing", "lending", "giving", "taking", "accepting", "rejecting", "receiving", "sending", "delivering", "packing", "unwrapping", "opening", "closing", "finishing", "beginning", "figging", "froting",
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