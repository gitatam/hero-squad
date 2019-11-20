import dao.SquadDao;
import dao.SquadDaoImpl;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        SquadDao squadDao = new SquadDaoImpl();

        before((req, res) ->{
            if (req.cookie("username") != null) {
                req.attribute("username", req.cookie("username"));
            }
        } );

        before("/squads", (req, res) -> {
            if (req.attribute("username") == null) {
                res.redirect("/");
                halt();
            }
        });

        get("/", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("username", req.attribute("username"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            String username = req.queryParams("username").toUpperCase();
            res.cookie("username", username);
            model.put("username", username);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squads", squadDao.findAllSquads());
            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads", (req, res) -> {
            String squadName = req.queryParams("name");
            String squadObligation = req.queryParams("obligation");
            int squadSize = Integer.parseInt(req.queryParams("size"));
            Squad squad = new Squad(squadSize, squadName, squadObligation);
            squadDao.addSquad(squad);
            res.redirect("/squads");
            return null;

        }, new HandlebarsTemplateEngine());

        get("/squads/:slug", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squad", squadDao.findSquadBySlug(req.params("slug")));
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine() );

    }
}
