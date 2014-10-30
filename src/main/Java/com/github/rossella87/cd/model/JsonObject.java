package com.github.rossella87.biblioteca.model;

import com.google.gson.Gson;

/**
 * biblio
 * Created by Pasquale Boemio <boemianrapsodi@gmail.com>
 * <p/>
 * 19 October 2014.
 */
public abstract class JsonObject extends Model {

  public String toJson() {
    Gson gson = new Gson();

    return gson.toJson(this);
  }

  public static<Child extends Model> Child fromJson(Class<Child> childClass, String json) {
    Gson gson = new Gson();

    return gson.fromJson(json, childClass);
  }

}
