import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("username", req.attribute("username"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
