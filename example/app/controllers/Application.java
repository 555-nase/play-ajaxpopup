package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import views.html.popup;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result popup() {
        return ok(popup.render());
    }
  
}
