package com.nkwenti.spi.greetings;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class WelcomeEventListenerProviderFactory implements EventListenerProviderFactory {

    public static final String ID = "nkwenti-greetings";

    @Override
    public EventListenerProvider create(KeycloakSession session) {
        return new WelcomeEventListenerProvider(session);
    }

    @Override
    public void init(Config.Scope config) {
        
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        
    }

    @Override
    public void close() {
        
    }

    @Override
    public String getId() {
        return ID;
    }
}
