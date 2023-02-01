package Resources;

import Util.IDUtil;

public abstract class RateableResource {
    public String name;

    public String id;

    public RateableResource(String name) {
        this.id = IDUtil.generateId();
        this.name = name;
    }

    public String getCapitalizedName() {
        return Character.toUpperCase(this.name.charAt(0)) + this.name.substring(1);
    }
}
