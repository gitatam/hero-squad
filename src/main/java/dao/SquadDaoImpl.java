package dao;

import models.Squad;

import java.util.ArrayList;
import java.util.List;

public class SquadDaoImpl implements SquadDao {
    private List<Squad> squads;

    public SquadDaoImpl() {
        squads = new ArrayList<>();
    }

    @Override
    public boolean addSquad(Squad squad) {
        return squads.add(squad);
    }

    @Override
    public List<Squad> findAllSquads() {
        return new ArrayList<>(squads);
    }


    @Override
    public Squad findSquadBySlug(String slug) {
        return null;
    }
}
