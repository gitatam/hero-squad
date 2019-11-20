package models;

import com.github.slugify.Slugify;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Squad {
    private int squadSize;
    private String squadName;
    private String squadObligation;
    private String slug;
    private Set<Hero> heroes;

    public Squad(int squadSize, String squadName, String squadObligation) {
        this.squadSize = squadSize;
        this.squadName = squadName;
        this.squadObligation = squadObligation;
        heroes = new HashSet<>();
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

    public List<Hero> getHeroes() {
        return new ArrayList<>(heroes);
    }

    public int getHeroCount() {
        return heroes.size();
    }

    public boolean addHeroToSquad(Hero hero){
        return heroes.add(hero);
    }
}


