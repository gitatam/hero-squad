package models;

import com.github.slugify.Slugify;

public class Squad {
    private int squadSize;
    private String squadName;
    private String squadObligation;
    private String slug;

    public Squad(int squadSize, String squadName, String squadObligation) {
        this.squadSize = squadSize;
        this.squadName = squadName;
        this.squadObligation = squadObligation;
        Slugify slugify = new Slugify();
        slug = slugify.slugify(squadName);
    }

    public String getSlug() {
        return slug;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getSquadObligation() {
        return squadObligation;
    }
}


