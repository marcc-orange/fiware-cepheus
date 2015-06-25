package com.orange.espr4fastdata.model.cep;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pborscia on 03/06/2015.
 */
public class EventTypeIn extends EventType {
    private Set<String> providers;

    public EventTypeIn() {
        super();
    }

    public EventTypeIn(String id, String type, boolean isPattern) {
        super(id, type, isPattern);
    }

    public Set<String> getProviders() {
        return providers;
    }

    public void setProviders(Set<String> providers) {
        this.providers = providers;
    }

    public void addProvider(String provider) {
        if (providers == null) {
            providers = new HashSet<>();
        }
        providers.add(provider);
    }
}
