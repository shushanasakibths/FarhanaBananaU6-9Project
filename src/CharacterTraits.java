// SHUSHANA SAKI
public class CharacterTraits {
    private static final String[] BLUE_EYES = {"deep", "ocean", "sapphire", "greenish-blue", "sky"};
    private static final String[] BROWN_EYES = {"dark", "hazel", "caramel", "amber", "chestnut"};
    private static final String[] GREEN_EYES = {"emerald", "jade", "forest", "mint", "olive"};

    private static final String[] BLACK_HAIR = {"raven", "ebony", "coal", "jet", "midnight"};
    private static final String[] BLONDE_HAIR = {"golden", "platinum", "sandy", "honey", "strawberry"};
    private static final String[] RED_HAIR = {"copper", "auburn", "scarlet", "ginger", "mahogany"};

    private static final String[] CURLY_HAIR = {"curly", "wavy", "coiled", "frizzy", "kinky"};
    private static final String[] STRAIGHT_HAIR = {"straight", "sleek", "smooth", "shiny", "silky"};

    private static final String[] DARK_SKIN = {"ebony", "mahogany", "cocoa", "black", "deep"};
    private static final String[] BROWN_SKIN = {"caramel", "tan", "bronze", "olive", "rich"};
    private static final String[] TAN_SKIN = {"honey", "golden", "sunkissed", "amber", "medium"};
    private static final String[] MED_SKIN = {"beige", "almond", "hazel", "sand", "neutral"};
    private static final String[] FAIR_SKIN = {"pale", "ivory", "light", "rosy", "porcelain"};

    private String[] eyes;
    private String[] hair;
    private String[] curly;
    private String[] skin;

    public CharacterTraits(String eyeColor, String hairColor, boolean isCurly, String skinColor) {
        switch (eyeColor.toLowerCase()) {
            case "blue":
                eyes = BLUE_EYES;
                break;
            case "brown":
                eyes = BROWN_EYES;
                break;
            case "green":
                eyes = GREEN_EYES;
                break;
            default:
                eyes = BROWN_EYES;
        }

        switch (hairColor.toLowerCase()) {
            case "black":
                hair = BLACK_HAIR;
                break;
            case "blonde":
                hair = BLONDE_HAIR;
                break;
            case "red":
                hair = RED_HAIR;
                break;
            default:
                hair = BLACK_HAIR;
        }

        if (isCurly) {
            curly = CURLY_HAIR;
        } else {
            curly = STRAIGHT_HAIR;
        }

        switch (skinColor.toLowerCase()) {
            case "dark":
                skin = DARK_SKIN;
                break;
            case "brown":
                skin = BROWN_SKIN;
                break;
            case "tan":
                skin = TAN_SKIN;
                break;
            case "medium":
                skin = MED_SKIN;
                break;
            default:
                skin = FAIR_SKIN;
        }
    }

    public String[] getEyes() {
        return eyes;
    }

    public String[] getHair() {
        return hair;
    }

    public String[] getCurly() {
        return curly;
    }

    public String[] getSkin() {
        return skin;
    }
}