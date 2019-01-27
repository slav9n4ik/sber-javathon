
package de.jonashackt.springbootvuejs.model.gsonobject.yandex;

import java.util.HashMap;
import java.util.Map;

public class PropertyFeature {

    private String id;
    private String type;
    private String name;
    private Boolean value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

}