package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:
    private String id;
    private String name;
    private String deleted;
    private String color;
    private String profile;
    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private String has_2fa;
    private String two_factor_type;
    private boolean has_files;

    public User(JSONObject json) {

        if (json.get("id") != null) {
            this.id= (String) json.get("id");
        }

        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }

        if (json.get("deleted") != null) {
            this.deleted = (String) json.get("deleted");
        }
        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }
        if (json.get("profile") != null) {
            this.profile = (String) json.get("profile");
        }
        if (json.get("is_admin") != null) {
            this.is_admin = (boolean) json.get("is_admin");
        }
        if (json.get("is_owner") != null) {
            this.is_owner = (boolean) json.get("is_owner");
        }
        if (json.get("is_primary_owner") != null) {
            this.is_primary_owner = (boolean) json.get("is_primary_owner");
        }
        if (json.get("is_restricted") != null) {
            this.is_restricted = (boolean) json.get("is_restricted");
        }
        if (json.get("is_ultra_restricted") != null) {
            this.is_ultra_restricted = (boolean) json.get("is_ultra_restricted");
        }
        if (json.get("has_2fa") != null) {
            this.has_2fa = (String) json.get("has_2fa");
        }
        if (json.get("two_factor_type") != null) {
            this.two_factor_type= (String) json.get("two_factor_type");
        }

        if (json.get("has_files") != null) {
            this.has_files = (boolean) json.get("has_files");
        }


        // TODO: parse a user from the incoming json
    }

    // TODO add getters to access private fields
}
